package typings.baseui

import typings.baseui.anon.InputRef
import typings.baseui.anon.InputWidth
import typings.baseui.baseuiStrings.$size
import typings.baseui.baseuiStrings.defaultValue
import typings.baseui.baseuiStrings.input
import typings.baseui.baseuiStrings.inputRef
import typings.baseui.baseuiStrings.overrides
import typings.baseui.baseuiStrings.value
import typings.baseui.selectTypesMod.AutosizeInputProps
import typings.baseui.selectTypesMod.AutosizeInputState
import typings.baseui.selectTypesMod.SharedStylePropsArg
import typings.react.mod.Component
import typings.react.mod.ComponentProps
import typings.std.HTMLElement
import typings.std.Omit
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autosizeInputMod {
  
  @JSImport("baseui/select/autosize-input", JSImport.Default)
  @js.native
  open class default () extends AutosizeInput
  /* static members */
  object default {
    
    @JSImport("baseui/select/autosize-input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/select/autosize-input", "default.defaultProps")
    @js.native
    def defaultProps: InputRef = js.native
    inline def defaultProps_=(x: InputRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AutosizeInput
    extends Component[
          AutosizeInputProps & (Omit[
            ComponentProps[StyletronComponent[input, SharedStylePropsArg]], 
            /* keyof baseui.baseui/select/types.AutosizeInputProps */ value | defaultValue | inputRef | overrides | $size
          ]), 
          AutosizeInputState, 
          Any
        ] {
    
    @JSName("componentDidMount")
    def componentDidMount_MAutosizeInput(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAutosizeInput(prevProps: AutosizeInputProps, prevState: AutosizeInputState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAutosizeInput(): Unit = js.native
    
    var mounted: Boolean = js.native
    
    var sizer: js.UndefOr[HTMLElement | Null] = js.native
    
    def sizerRef(): Unit = js.native
    def sizerRef(el: HTMLElement): Unit = js.native
    
    @JSName("state")
    var state_AutosizeInput: InputWidth = js.native
    
    def updateInputWidth(): Unit = js.native
  }
}
