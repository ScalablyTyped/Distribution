package typings.ckeditorCkeditor5RemoveFormat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRemoveformatcommandMod {
  
  @JSImport("@ckeditor/ckeditor5-remove-format/src/removeformatcommand", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with RemoveFormatCommand {
    
    /**
      * Returns an iterable of formatting attributes of a given model item.
      *
      * **Note:** Formatting items have the `isFormatting` property set to `true`.
      *
      * @param schema The schema describing the item.
      * @returns The names of formatting attributes found in a given item.
      */
    /* private */ /* CompleteClass */
    var _getFormattingAttributes: Any = js.native
    
    /**
      * Returns an iterable of items in a selection (including the selection itself) that have formatting model
      * attributes to be removed by the feature.
      *
      * @param schema The schema describing the item.
      */
    /* private */ /* CompleteClass */
    var _getFormattingItems: Any = js.native
    
    /**
      * @inheritDoc
      */
    /* CompleteClass */
    override def execute(): Unit = js.native
    
    /**
      * @inheritDoc
      */
    /* CompleteClass */
    override def refresh(): Unit = js.native
    
    /* CompleteClass */
    var value: Boolean = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ trait RemoveFormatCommand extends StObject {
    
    /**
      * Returns an iterable of formatting attributes of a given model item.
      *
      * **Note:** Formatting items have the `isFormatting` property set to `true`.
      *
      * @param schema The schema describing the item.
      * @returns The names of formatting attributes found in a given item.
      */
    /* private */ var _getFormattingAttributes: Any
    
    /**
      * Returns an iterable of items in a selection (including the selection itself) that have formatting model
      * attributes to be removed by the feature.
      *
      * @param schema The schema describing the item.
      */
    /* private */ var _getFormattingItems: Any
    
    /**
      * @inheritDoc
      */
    def execute(): Unit
    
    /**
      * @inheritDoc
      */
    def refresh(): Unit
    
    var value: Boolean
  }
  object RemoveFormatCommand {
    
    inline def apply(
      _getFormattingAttributes: Any,
      _getFormattingItems: Any,
      execute: () => Unit,
      refresh: () => Unit,
      value: Boolean
    ): RemoveFormatCommand = {
      val __obj = js.Dynamic.literal(_getFormattingAttributes = _getFormattingAttributes.asInstanceOf[js.Any], _getFormattingItems = _getFormattingItems.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute), refresh = js.Any.fromFunction0(refresh), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveFormatCommand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoveFormatCommand] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def set_getFormattingAttributes(value: Any): Self = StObject.set(x, "_getFormattingAttributes", value.asInstanceOf[js.Any])
      
      inline def set_getFormattingItems(value: Any): Self = StObject.set(x, "_getFormattingItems", value.asInstanceOf[js.Any])
    }
  }
}
