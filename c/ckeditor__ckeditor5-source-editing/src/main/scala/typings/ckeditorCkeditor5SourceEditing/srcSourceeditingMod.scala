package typings.ckeditorCkeditor5SourceEditing

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSourceeditingMod {
  
  @JSImport("@ckeditor/ckeditor5-source-editing/src/sourceediting", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SourceEditing {
    /**
      * @inheritDoc
      */
    def this(editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any) = this()
  }
  
  @js.native
  trait SourceEditing
    extends StObject
       with Plugin {
    
    /**
      * Maps all root names to their document data.
      */
    /* private */ var _dataFromRoots: Any = js.native
    
    /**
      * Disables all commands.
      */
    /* private */ var _disableCommands: Any = js.native
    
    /**
      * The element replacer instance used to replace the editing roots with the wrapper elements containing the document source.
      */
    /* private */ var _elementReplacer: Any = js.native
    
    /**
      * Clears forced disable for all commands, that was previously set through {@link #_disableCommands}.
      */
    /* private */ var _enableCommands: Any = js.native
    
    /**
      * Focuses the textarea containing document source from the first editing root.
      */
    /* private */ var _focusSourceEditing: Any = js.native
    
    /**
      * Adds or removes the `readonly` attribute from the textarea from all roots, if document source mode is active.
      *
      * @param isReadOnly Indicates whether all textarea elements should be read-only.
      */
    /* private */ var _handleReadOnlyMode: Any = js.native
    
    /**
      * Restores all hidden editing roots and sets the source data in them.
      */
    /* private */ var _hideSourceEditing: Any = js.native
    
    /**
      * Checks, if the plugin is allowed to handle the source editing mode by itself. Currently, the source editing mode is supported only
      * for the {@link module:editor-classic/classiceditor~ClassicEditor classic editor}.
      */
    /* private */ var _isAllowedToHandleSourceEditingMode: Any = js.native
    
    /**
      * Maps all root names to wrapper elements containing the document source.
      */
    /* private */ var _replacedRoots: Any = js.native
    
    /**
      * Creates source editing wrappers that replace each editing root. Each wrapper contains the document source from the corresponding
      * root.
      *
      * The wrapper element contains a textarea and it solves the problem, that the textarea element cannot auto expand its height based on
      * the content it contains. The solution is to make the textarea more like a plain div element, which expands in height as much as it
      * needs to, in order to display the whole document source without scrolling. The wrapper element is a parent for the textarea and for
      * the pseudo-element `::after`, that replicates the look, content, and position of the textarea. The pseudo-element replica is hidden,
      * but it is styled to be an identical visual copy of the textarea with the same content. Then, the wrapper is a grid container and both
      * of its children (the textarea and the `::after` pseudo-element) are positioned within a CSS grid to occupy the same grid cell. The
      * content in the pseudo-element `::after` is set in CSS and it stretches the grid to the appropriate size based on the textarea value.
      * Since both children occupy the same grid cell, both have always the same height.
      */
    /* private */ var _showSourceEditing: Any = js.native
    
    /**
      * @inheritDoc
      */
    def afterInit(): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def init(): Unit = js.native
    
    /**
      * Flag indicating whether the document source mode is active.
      *
      * @observable
      */
    var isSourceEditingMode: Boolean = js.native
    
    /**
      * Updates the source data in all hidden editing roots.
      */
    def updateEditorData(): Unit = js.native
  }
}
