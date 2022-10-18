package typings.baseui

import typings.baseui.anon.StatefulRadioGroupPropsOm
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.input
import typings.baseui.baseuiStrings.label
import typings.baseui.radioRadioMod.default
import typings.baseui.radioTypesMod.DefaultProps
import typings.baseui.radioTypesMod.DefaultStatefulProps
import typings.baseui.radioTypesMod.StatefulContainerProps
import typings.baseui.radioTypesMod.StyleProps
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioMod {
  
  object ALIGN {
    
    @JSImport("baseui/radio", "ALIGN.horizontal")
    @js.native
    val horizontal: typings.baseui.baseuiStrings.horizontal = js.native
    
    @JSImport("baseui/radio", "ALIGN.vertical")
    @js.native
    val vertical: typings.baseui.baseuiStrings.vertical = js.native
  }
  
  @JSImport("baseui/radio", "Radio")
  @js.native
  open class Radio () extends default
  object Radio {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/radio", "Radio.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/radio", "Radio.defaultProps.align")
      @js.native
      def align: String = js.native
      inline def align_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("align")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/radio", "Radio.defaultProps.autoFocus")
      @js.native
      def autoFocus: Boolean = js.native
      inline def autoFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/radio", "Radio.defaultProps.checked")
      @js.native
      def checked: Boolean = js.native
      inline def checked_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checked")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/radio", "Radio.defaultProps.containsInteractiveElement")
      @js.native
      def containsInteractiveElement: Boolean = js.native
      inline def containsInteractiveElement_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("containsInteractiveElement")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/radio", "Radio.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/radio", "Radio.defaultProps.error")
      @js.native
      def error: Boolean = js.native
      inline def error_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/radio", "Radio.defaultProps.inputRef")
      @js.native
      def inputRef: RefObject[HTMLInputElement] = js.native
      inline def inputRef_=(x: RefObject[HTMLInputElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(x.asInstanceOf[js.Any])
      
      inline def onBlur(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBlur")().asInstanceOf[Unit]
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      inline def onFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")().asInstanceOf[Unit]
      
      inline def onMouseDown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMouseDown")().asInstanceOf[Unit]
      
      inline def onMouseEnter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMouseEnter")().asInstanceOf[Unit]
      
      inline def onMouseLeave(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMouseLeave")().asInstanceOf[Unit]
      
      inline def onMouseUp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMouseUp")().asInstanceOf[Unit]
    }
  }
  
  @JSImport("baseui/radio", "RadioGroup")
  @js.native
  open class RadioGroup ()
    extends typings.baseui.radioRadiogroupMod.default
  object RadioGroup {
    
    @JSImport("baseui/radio", "RadioGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/radio", "RadioGroup.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    inline def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/radio", "StatefulContainer")
  @js.native
  open class StatefulContainer protected ()
    extends typings.baseui.radioStatefulRadiogroupContainerMod.default {
    def this(props: StatefulContainerProps) = this()
  }
  object StatefulContainer {
    
    @JSImport("baseui/radio", "StatefulContainer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/radio", "StatefulContainer.defaultProps")
    @js.native
    def defaultProps: DefaultStatefulProps = js.native
    inline def defaultProps_=(x: DefaultStatefulProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  object StatefulRadioGroup {
    
    inline def apply(props: StatefulRadioGroupPropsOm): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/radio", "StatefulRadioGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/radio", "StatefulRadioGroup.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/radio", "StyledDescription")
  @js.native
  val StyledDescription: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/radio", "StyledInput")
  @js.native
  val StyledInput: StyletronComponent[input, js.Object] = js.native
  
  @JSImport("baseui/radio", "StyledLabel")
  @js.native
  val StyledLabel: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/radio", "StyledRadioGroupRoot")
  @js.native
  val StyledRadioGroupRoot: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/radio", "StyledRadioMarkInner")
  @js.native
  val StyledRadioMarkInner: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/radio", "StyledRadioMarkOuter")
  @js.native
  val StyledRadioMarkOuter: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/radio", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[label, StyleProps] = js.native
}
