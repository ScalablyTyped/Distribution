package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.InitialState
import typings.baseui.anon.Kind
import typings.baseui.anon.Length
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.round_
import typings.baseui.buttonGroupButtonGroupMod.default
import typings.baseui.buttonGroupTypesMod.StatefulButtonGroupProps
import typings.baseui.buttonGroupTypesMod.StatefulContainerProps
import typings.react.mod.global.JSX.Element
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupMod {
  
  @JSImport("baseui/button-group", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/button-group", "ButtonGroup")
  @js.native
  open class ButtonGroup () extends default
  /* static members */
  object ButtonGroup {
    
    @JSImport("baseui/button-group", "ButtonGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/button-group", "ButtonGroup.defaultProps")
    @js.native
    def defaultProps: Kind = js.native
    inline def defaultProps_=(x: Kind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Readonly<{ readonly radio :'radio',  readonly checkbox :'checkbox'}> */
  object MODE {
    
    @JSImport("baseui/button-group", "MODE.checkbox")
    @js.native
    val checkbox: typings.baseui.baseuiStrings.checkbox = js.native
    
    @JSImport("baseui/button-group", "MODE.radio")
    @js.native
    val radio: typings.baseui.baseuiStrings.radio = js.native
  }
  
  object SHAPE extends Shortcut {
    
    @JSImport("baseui/button-group", "SHAPE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/button-group", "SHAPE.circle")
    @js.native
    val circle: typings.baseui.baseuiStrings.circle = js.native
    
    @JSImport("baseui/button-group", "SHAPE.pill")
    @js.native
    val pill: typings.baseui.baseuiStrings.pill = js.native
    
    @JSImport("baseui/button-group", "SHAPE.round")
    @js.native
    val round: round_ = js.native
    
    @JSImport("baseui/button-group", "SHAPE.square")
    @js.native
    val square: typings.baseui.baseuiStrings.square = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SHAPE.foo` */
    override def _to: default_ = default
  }
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/button-group", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/button-group", "SIZE.compact")
    @js.native
    val compact: typings.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/button-group", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/button-group", "SIZE.mini")
    @js.native
    val mini: typings.baseui.baseuiStrings.mini = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  /* Inlined std.Readonly<{ readonly change :'change'}> */
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/button-group", "STATE_CHANGE_TYPE.change")
    @js.native
    val change: change_ = js.native
  }
  
  inline def StatefulButtonGroup(props: StatefulButtonGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatefulButtonGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/button-group", "StatefulContainer")
  @js.native
  open class StatefulContainer protected ()
    extends typings.baseui.statefulContainerMod.default {
    def this(props: StatefulContainerProps) = this()
  }
  /* static members */
  object StatefulContainer {
    
    @JSImport("baseui/button-group", "StatefulContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/button-group", "StatefulContainer.defaultProps")
    @js.native
    def defaultProps: InitialState = js.native
    inline def defaultProps_=(x: InitialState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/button-group", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, Length] = js.native
}
