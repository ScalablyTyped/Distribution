package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyComboMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/keyCombo", "KeyCombo")
  @js.native
  class KeyCombo protected ()
    extends AbstractPureComponent2[IKeyComboProps, js.Object, js.Object] {
    def this(props: IKeyComboProps) = this()
    def this(props: IKeyComboProps, context: js.Any) = this()
    
    var renderKey: js.Any = js.native
    
    var renderMinimalKey: js.Any = js.native
  }
  /* static members */
  object KeyCombo {
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/keyCombo", "KeyCombo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/keyCombo", "KeyCombo.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IKeyComboProps extends IProps {
    
    /** The key combo to display, such as `"cmd + s"`. */
    var combo: String = js.native
    
    /**
      * Whether to render in a minimal style.
      * If `false`, each key in the combo will be rendered inside a `<kbd>` tag.
      * If `true`, only the icon or short name of a key will be rendered with no wrapper styles.
      * @default false
      */
    var minimal: js.UndefOr[Boolean] = js.native
  }
  object IKeyComboProps {
    
    @scala.inline
    def apply(combo: String): IKeyComboProps = {
      val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyComboProps]
    }
    
    @scala.inline
    implicit class IKeyComboPropsMutableBuilder[Self <: IKeyComboProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCombo(value: String): Self = StObject.set(x, "combo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
    }
  }
}
