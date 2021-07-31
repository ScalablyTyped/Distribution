package typings.codemirror.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MergeView {
  
  /**
    * A function that calculates either a two-way or three-way merge between different sets of content.
    */
  @scala.inline
  def apply(element: HTMLElement): MergeViewEditor = ^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any]).asInstanceOf[MergeViewEditor]
  @scala.inline
  def apply(element: HTMLElement, options: MergeViewEditorConfiguration): MergeViewEditor = (^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MergeViewEditor]
  
  @JSImport("codemirror", "MergeView")
  @js.native
  val ^ : js.Any = js.native
  
  trait DiffView extends StObject {
    
    /**
      * Forces the view to reload.
      */
    def forceUpdate(): js.Function1[/* mode */ String, Unit]
    
    /**
      * Sets whether or not the merge view should show the differences between the editor views.
      */
    def setShowDifferences(showDifferences: Boolean): Unit
  }
  object DiffView {
    
    @scala.inline
    def apply(forceUpdate: () => js.Function1[/* mode */ String, Unit], setShowDifferences: Boolean => Unit): DiffView = {
      val __obj = js.Dynamic.literal(forceUpdate = js.Any.fromFunction0(forceUpdate), setShowDifferences = js.Any.fromFunction1(setShowDifferences))
      __obj.asInstanceOf[DiffView]
    }
    
    @scala.inline
    implicit class DiffViewMutableBuilder[Self <: DiffView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceUpdate(value: () => js.Function1[/* mode */ String, Unit]): Self = StObject.set(x, "forceUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetShowDifferences(value: Boolean => Unit): Self = StObject.set(x, "setShowDifferences", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Tracks changes in chunks from oroginal to new.
    */
  trait MergeViewDiffChunk extends StObject {
    
    var editFrom: Double
    
    var editTo: Double
    
    var origFrom: Double
    
    var origTo: Double
  }
  object MergeViewDiffChunk {
    
    @scala.inline
    def apply(editFrom: Double, editTo: Double, origFrom: Double, origTo: Double): MergeViewDiffChunk = {
      val __obj = js.Dynamic.literal(editFrom = editFrom.asInstanceOf[js.Any], editTo = editTo.asInstanceOf[js.Any], origFrom = origFrom.asInstanceOf[js.Any], origTo = origTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeViewDiffChunk]
    }
    
    @scala.inline
    implicit class MergeViewDiffChunkMutableBuilder[Self <: MergeViewDiffChunk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEditFrom(value: Double): Self = StObject.set(x, "editFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditTo(value: Double): Self = StObject.set(x, "editTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigFrom(value: Double): Self = StObject.set(x, "origFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigTo(value: Double): Self = StObject.set(x, "origTo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MergeViewEditor
    extends StObject
       with Editor {
    
    /**
      * Returns the editor instance.
      */
    def editor(): Editor = js.native
    
    /**
      * Left side of the merge view.
      */
    var left: DiffView = js.native
    
    def leftChunks(): js.Array[MergeViewDiffChunk] = js.native
    
    def leftOriginal(): Editor = js.native
    
    /**
      * Right side of the merge view.
      */
    var right: DiffView = js.native
    
    def rightChunks(): js.Array[MergeViewDiffChunk] = js.native
    
    def rightOriginal(): Editor = js.native
    
    /**
      * Sets whether or not the merge view should show the differences between the editor views.
      */
    def setShowDifferences(showDifferences: Boolean): Unit = js.native
  }
  
  /**
    * Options available to MergeView.
    */
  trait MergeViewEditorConfiguration
    extends StObject
       with EditorConfiguration {
    
    /**
      * Determines whether the original editor allows editing. Defaults to false.
      */
    var allowEditingOriginals: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true stretches of unchanged text will be collapsed. When a number is given, this indicates the amount
      * of lines to leave visible around such stretches (which defaults to 2). Defaults to false.
      */
    var collapseIdentical: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * Sets the style used to connect changed chunks of code. By default, connectors are drawn. When this is set to "align",
      * the smaller chunk is padded to align with the bigger chunk instead.
      */
    var connect: js.UndefOr[String] = js.undefined
    
    /**
      * Callback for when stretches of unchanged text are collapsed.
      */
    var onCollapse: js.UndefOr[
        js.Function4[
          /* mergeView */ MergeViewEditor, 
          /* line */ Double, 
          /* size */ Double, 
          /* mark */ TextMarker, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Provides original version of the document to be shown on the right of the editor.
      */
    var orig: js.Any
    
    /**
      * Provides original version of the document to be shown on the left of the editor.
      * To create a 2-way (as opposed to 3-way) merge view, provide only one of origLeft and origRight.
      */
    var origLeft: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Provides original version of document to be shown on the right of the editor.
      * To create a 2-way (as opposed to 3-way) merge view, provide only one of origLeft and origRight.
      */
    var origRight: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Determines whether buttons that allow the user to revert changes are shown. Defaults to true.
      */
    var revertButtons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, changed pieces of text are highlighted. Defaults to true.
      */
    var showDifferences: js.UndefOr[Boolean] = js.undefined
  }
  object MergeViewEditorConfiguration {
    
    @scala.inline
    def apply(orig: js.Any): MergeViewEditorConfiguration = {
      val __obj = js.Dynamic.literal(orig = orig.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeViewEditorConfiguration]
    }
    
    @scala.inline
    implicit class MergeViewEditorConfigurationMutableBuilder[Self <: MergeViewEditorConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEditingOriginals(value: Boolean): Self = StObject.set(x, "allowEditingOriginals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEditingOriginalsUndefined: Self = StObject.set(x, "allowEditingOriginals", js.undefined)
      
      @scala.inline
      def setCollapseIdentical(value: Boolean | Double): Self = StObject.set(x, "collapseIdentical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseIdenticalUndefined: Self = StObject.set(x, "collapseIdentical", js.undefined)
      
      @scala.inline
      def setConnect(value: String): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      @scala.inline
      def setOnCollapse(
        value: (/* mergeView */ MergeViewEditor, /* line */ Double, /* size */ Double, /* mark */ TextMarker) => Unit
      ): Self = StObject.set(x, "onCollapse", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      @scala.inline
      def setOrig(value: js.Any): Self = StObject.set(x, "orig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigLeft(value: js.Any): Self = StObject.set(x, "origLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigLeftUndefined: Self = StObject.set(x, "origLeft", js.undefined)
      
      @scala.inline
      def setOrigRight(value: js.Any): Self = StObject.set(x, "origRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigRightUndefined: Self = StObject.set(x, "origRight", js.undefined)
      
      @scala.inline
      def setRevertButtons(value: Boolean): Self = StObject.set(x, "revertButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevertButtonsUndefined: Self = StObject.set(x, "revertButtons", js.undefined)
      
      @scala.inline
      def setShowDifferences(value: Boolean): Self = StObject.set(x, "showDifferences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDifferencesUndefined: Self = StObject.set(x, "showDifferences", js.undefined)
    }
  }
}
