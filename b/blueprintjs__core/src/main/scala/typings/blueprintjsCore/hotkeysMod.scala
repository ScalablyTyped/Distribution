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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotkeysMod {
  
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
    @scala.inline
    def defaultProps_=(x: AllowInInput): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkey.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
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
    @scala.inline
    def defaultProps_=(x: TabIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkeys.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "HotkeysTarget")
  @js.native
  def HotkeysTarget[T /* <: IConstructor[IHotkeysTargetComponent] */](WrappedComponent: T): DisplayName with T = js.native
  
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
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "comboMatches")
  @js.native
  def comboMatches(a: IKeyCombo, b: IKeyCombo): Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "getKeyCombo")
  @js.native
  def getKeyCombo(e: KeyboardEvent): IKeyCombo = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "getKeyComboString")
  @js.native
  def getKeyComboString(e: KeyboardEvent): String = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "hideHotkeysDialog")
  @js.native
  def hideHotkeysDialog(): Unit = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "parseKeyCombo")
  @js.native
  def parseKeyCombo(combo: String): IKeyCombo = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "setHotkeysDialogProps")
  @js.native
  def setHotkeysDialogProps(props: PartialIHotkeysDialogProp): Unit = js.native
}
