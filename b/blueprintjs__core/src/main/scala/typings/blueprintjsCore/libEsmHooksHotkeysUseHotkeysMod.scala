package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmHooksHotkeysHotkeyConfigMod.HotkeyConfig
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmHooksHotkeysUseHotkeysMod {
  
  @JSImport("@blueprintjs/core/lib/esm/hooks/hotkeys/useHotkeys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useHotkeys(keys: js.Array[HotkeyConfig]): UseHotkeysReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useHotkeys")(keys.asInstanceOf[js.Any]).asInstanceOf[UseHotkeysReturnValue]
  inline def useHotkeys(keys: js.Array[HotkeyConfig], options: UseHotkeysOptions): UseHotkeysReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useHotkeys")(keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseHotkeysReturnValue]
  
  trait UseHotkeysOptions extends StObject {
    
    /**
      * A custom document to reference when binding global event handlers.
      * This can be useful when using iframes in an application.
      *
      * @default window.document
      */
    var document: js.UndefOr[Document] = js.undefined
    
    /**
      * The key combo which will trigger the hotkeys dialog to open.
      *
      * @default "?"
      */
    var showDialogKeyCombo: js.UndefOr[String] = js.undefined
  }
  object UseHotkeysOptions {
    
    inline def apply(): UseHotkeysOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseHotkeysOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseHotkeysOptions] (val x: Self) extends AnyVal {
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setShowDialogKeyCombo(value: String): Self = StObject.set(x, "showDialogKeyCombo", value.asInstanceOf[js.Any])
      
      inline def setShowDialogKeyComboUndefined: Self = StObject.set(x, "showDialogKeyCombo", js.undefined)
    }
  }
  
  trait UseHotkeysReturnValue extends StObject {
    
    var handleKeyDown: KeyboardEventHandler[HTMLElement]
    
    var handleKeyUp: KeyboardEventHandler[HTMLElement]
  }
  object UseHotkeysReturnValue {
    
    inline def apply(handleKeyDown: KeyboardEvent[HTMLElement] => Unit, handleKeyUp: KeyboardEvent[HTMLElement] => Unit): UseHotkeysReturnValue = {
      val __obj = js.Dynamic.literal(handleKeyDown = js.Any.fromFunction1(handleKeyDown), handleKeyUp = js.Any.fromFunction1(handleKeyUp))
      __obj.asInstanceOf[UseHotkeysReturnValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseHotkeysReturnValue] (val x: Self) extends AnyVal {
      
      inline def setHandleKeyDown(value: KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "handleKeyDown", js.Any.fromFunction1(value))
      
      inline def setHandleKeyUp(value: KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "handleKeyUp", js.Any.fromFunction1(value))
    }
  }
}
