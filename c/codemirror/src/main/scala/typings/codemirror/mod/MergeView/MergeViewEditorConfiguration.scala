package typings.codemirror.mod.MergeView

import typings.codemirror.mod.EditorConfiguration
import typings.codemirror.mod.TextMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options available to MergeView.
  */
@js.native
trait MergeViewEditorConfiguration extends EditorConfiguration {
  /**
    * Determines whether the original editor allows editing. Defaults to false.
    */
  var allowEditingOriginals: js.UndefOr[Boolean] = js.native
  /**
    * When true stretches of unchanged text will be collapsed. When a number is given, this indicates the amount
    * of lines to leave visible around such stretches (which defaults to 2). Defaults to false.
    */
  var collapseIdentical: js.UndefOr[Boolean | Double] = js.native
  /**
    * Sets the style used to connect changed chunks of code. By default, connectors are drawn. When this is set to "align",
    * the smaller chunk is padded to align with the bigger chunk instead.
    */
  var connect: js.UndefOr[String] = js.native
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
  ] = js.native
  /**
    * Provides original version of the document to be shown on the right of the editor.
    */
  var orig: js.Any = js.native
  /**
    * Provides original version of the document to be shown on the left of the editor.
    * To create a 2-way (as opposed to 3-way) merge view, provide only one of origLeft and origRight.
    */
  var origLeft: js.UndefOr[js.Any] = js.native
  /**
    * Provides original version of document to be shown on the right of the editor.
    * To create a 2-way (as opposed to 3-way) merge view, provide only one of origLeft and origRight.
    */
  var origRight: js.UndefOr[js.Any] = js.native
  /**
    * Determines whether buttons that allow the user to revert changes are shown. Defaults to true.
    */
  var revertButtons: js.UndefOr[Boolean] = js.native
  /**
    * When true, changed pieces of text are highlighted. Defaults to true.
    */
  var showDifferences: js.UndefOr[Boolean] = js.native
}

object MergeViewEditorConfiguration {
  @scala.inline
  def apply(orig: js.Any): MergeViewEditorConfiguration = {
    val __obj = js.Dynamic.literal(orig = orig.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeViewEditorConfiguration]
  }
  @scala.inline
  implicit class MergeViewEditorConfigurationOps[Self <: MergeViewEditorConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrig(value: js.Any): Self = this.set("orig", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowEditingOriginals(value: Boolean): Self = this.set("allowEditingOriginals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEditingOriginals: Self = this.set("allowEditingOriginals", js.undefined)
    @scala.inline
    def setCollapseIdentical(value: Boolean | Double): Self = this.set("collapseIdentical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseIdentical: Self = this.set("collapseIdentical", js.undefined)
    @scala.inline
    def setConnect(value: String): Self = this.set("connect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    @scala.inline
    def setOnCollapse(
      value: (/* mergeView */ MergeViewEditor, /* line */ Double, /* size */ Double, /* mark */ TextMarker) => Unit
    ): Self = this.set("onCollapse", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnCollapse: Self = this.set("onCollapse", js.undefined)
    @scala.inline
    def setOrigLeft(value: js.Any): Self = this.set("origLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigLeft: Self = this.set("origLeft", js.undefined)
    @scala.inline
    def setOrigRight(value: js.Any): Self = this.set("origRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigRight: Self = this.set("origRight", js.undefined)
    @scala.inline
    def setRevertButtons(value: Boolean): Self = this.set("revertButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevertButtons: Self = this.set("revertButtons", js.undefined)
    @scala.inline
    def setShowDifferences(value: Boolean): Self = this.set("showDifferences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDifferences: Self = this.set("showDifferences", js.undefined)
  }
  
}

