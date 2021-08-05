package typings.blueprintjsCore

import typings.blueprintjsCore.anon.AllowInInput
import typings.blueprintjsCore.anon.DisplayName
import typings.blueprintjsCore.anon.PartialIHotkeysDialogProp
import typings.blueprintjsCore.anon.TabIndex
import typings.blueprintjsCore.constructorMod.IConstructor
import typings.blueprintjsCore.hotkeyMod.IHotkeyProps
import typings.blueprintjsCore.hotkeyParserMod.IKeyCombo
import typings.blueprintjsCore.hotkeysTargetMod.IHotkeysTargetComponent
import typings.blueprintjsCore.hotkeysTypesMod.IHotkeysProps
import typings.blueprintjsCore.keyComboMod.IKeyComboProps
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotkeysMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkey")
  @js.native
  class Hotkey protected ()
    extends typings.blueprintjsCore.hotkeyMod.Hotkey {
    def this(props: IHotkeyProps) = this()
    def this(props: IHotkeyProps, context: js.Any) = this()
  }
  /* static members */
  object Hotkey {
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkey")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkey.defaultProps")
    @js.native
    def defaultProps: AllowInInput = js.native
    inline def defaultProps_=(x: AllowInInput): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkey.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkeys")
  @js.native
  class Hotkeys protected ()
    extends typings.blueprintjsCore.hotkeysHotkeysMod.Hotkeys {
    def this(props: IHotkeysProps) = this()
    def this(props: IHotkeysProps, context: js.Any) = this()
  }
  /* static members */
  object Hotkeys {
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkeys")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkeys.defaultProps")
    @js.native
    def defaultProps: TabIndex = js.native
    inline def defaultProps_=(x: TabIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkeys.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def HotkeysTarget[T /* <: IConstructor[IHotkeysTargetComponent] */](WrappedComponent: T): DisplayName & T = ^.asInstanceOf[js.Dynamic].applyDynamic("HotkeysTarget")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[DisplayName & T]
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "KeyCombo")
  @js.native
  class KeyCombo protected ()
    extends typings.blueprintjsCore.keyComboMod.KeyCombo {
    def this(props: IKeyComboProps) = this()
    def this(props: IKeyComboProps, context: js.Any) = this()
  }
  /* static members */
  object KeyCombo {
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "KeyCombo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "KeyCombo.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def comboMatches(a: IKeyCombo, b: IKeyCombo): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("comboMatches")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getKeyCombo(e: KeyboardEvent): IKeyCombo = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyCombo")(e.asInstanceOf[js.Any]).asInstanceOf[IKeyCombo]
  
  inline def getKeyComboString(e: KeyboardEvent): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyComboString")(e.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hideHotkeysDialog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideHotkeysDialog")().asInstanceOf[Unit]
  
  inline def parseKeyCombo(combo: String): IKeyCombo = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeyCombo")(combo.asInstanceOf[js.Any]).asInstanceOf[IKeyCombo]
  
  inline def setHotkeysDialogProps(props: PartialIHotkeysDialogProp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHotkeysDialogProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
