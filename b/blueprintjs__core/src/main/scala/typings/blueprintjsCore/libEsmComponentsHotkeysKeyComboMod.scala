package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsHotkeysKeyComboMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/keyCombo", "KeyCombo")
  @js.native
  open class KeyCombo protected ()
    extends AbstractPureComponent2[KeyComboTagProps, js.Object, js.Object] {
    def this(props: KeyComboTagProps) = this()
    def this(props: KeyComboTagProps, context: Any) = this()
    
    /* private */ var renderKey: Any = js.native
    
    /* private */ var renderMinimalKey: Any = js.native
  }
  /* static members */
  object KeyCombo {
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/keyCombo", "KeyCombo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/keyCombo", "KeyCombo.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IKeyComboProps
    extends StObject
       with IProps {
    
    /** The key combo to display, such as `"cmd + s"`. */
    var combo: String
    
    /**
      * Whether to render in a minimal style.
      * If `false`, each key in the combo will be rendered inside a `<kbd>` tag.
      * If `true`, only the icon or short name of a key will be rendered with no wrapper styles.
      *
      * @default false
      */
    var minimal: js.UndefOr[Boolean] = js.undefined
  }
  object IKeyComboProps {
    
    inline def apply(combo: String): IKeyComboProps = {
      val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyComboProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IKeyComboProps] (val x: Self) extends AnyVal {
      
      inline def setCombo(value: String): Self = StObject.set(x, "combo", value.asInstanceOf[js.Any])
      
      inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
    }
  }
  
  type KeyComboTagProps = IKeyComboProps
}
