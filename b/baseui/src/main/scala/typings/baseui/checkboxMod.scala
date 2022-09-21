package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.baseuiStrings.CHANGE
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.input
import typings.baseui.baseuiStrings.label
import typings.baseui.baseuiStrings.span
import typings.baseui.checkboxCheckboxMod.default
import typings.baseui.checkboxTypesMod.DefaultProps
import typings.baseui.checkboxTypesMod.DefaultStatefulProps
import typings.baseui.checkboxTypesMod.SharedStyleProps
import typings.baseui.checkboxTypesMod.StatefulCheckboxProps
import typings.baseui.checkboxTypesMod.StatefulContainerProps
import typings.react.mod.global.JSX.Element
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  @JSImport("baseui/checkbox", "Checkbox")
  @js.native
  open class Checkbox () extends default
  object Checkbox {
    
    @JSImport("baseui/checkbox", "Checkbox")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/checkbox", "Checkbox.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    inline def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Readonly<{ readonly top :'top',  readonly right :'right',  readonly bottom :'bottom',  readonly left :'left'}> */
  object LABEL_PLACEMENT {
    
    @JSImport("baseui/checkbox", "LABEL_PLACEMENT.bottom")
    @js.native
    val bottom: typings.baseui.baseuiStrings.bottom = js.native
    
    @JSImport("baseui/checkbox", "LABEL_PLACEMENT.left")
    @js.native
    val left: typings.baseui.baseuiStrings.left = js.native
    
    @JSImport("baseui/checkbox", "LABEL_PLACEMENT.right")
    @js.native
    val right: typings.baseui.baseuiStrings.right = js.native
    
    @JSImport("baseui/checkbox", "LABEL_PLACEMENT.top")
    @js.native
    val top: typings.baseui.baseuiStrings.top = js.native
  }
  
  object STATE_TYPE {
    
    @JSImport("baseui/checkbox", "STATE_TYPE.change")
    @js.native
    val change: CHANGE = js.native
  }
  
  /* Inlined std.Readonly<{ readonly default :'default',  readonly toggle :'toggle',  readonly toggle_round :'toggle'}> */
  object STYLE_TYPE extends Shortcut {
    
    @JSImport("baseui/checkbox", "STYLE_TYPE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/checkbox", "STYLE_TYPE.toggle")
    @js.native
    val toggle: typings.baseui.baseuiStrings.toggle = js.native
    
    @JSImport("baseui/checkbox", "STYLE_TYPE.toggle_round")
    @js.native
    val toggleRound: typings.baseui.baseuiStrings.toggle = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `STYLE_TYPE.foo` */
    override def _to: default_ = default
  }
  
  object StatefulCheckbox {
    
    inline def apply(props: StatefulCheckboxProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/checkbox", "StatefulCheckbox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/checkbox", "StatefulCheckbox.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/checkbox", "StatefulContainer")
  @js.native
  open class StatefulContainer protected ()
    extends typings.baseui.statefulCheckboxContainerMod.default {
    def this(props: StatefulContainerProps) = this()
  }
  object StatefulContainer {
    
    @JSImport("baseui/checkbox", "StatefulContainer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/checkbox", "StatefulContainer.defaultProps")
    @js.native
    def defaultProps: DefaultStatefulProps = js.native
    inline def defaultProps_=(x: DefaultStatefulProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/checkbox", "StyledCheckmark")
  @js.native
  val StyledCheckmark: StyletronComponent[span, SharedStyleProps] = js.native
  
  @JSImport("baseui/checkbox", "StyledInput")
  @js.native
  val StyledInput: StyletronComponent[input, js.Object] = js.native
  
  @JSImport("baseui/checkbox", "StyledLabel")
  @js.native
  val StyledLabel: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/checkbox", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[label, SharedStyleProps] = js.native
  
  @JSImport("baseui/checkbox", "StyledToggle")
  @js.native
  val StyledToggle: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/checkbox", "StyledToggleTrack")
  @js.native
  val StyledToggleTrack: StyletronComponent[div, SharedStyleProps] = js.native
}
