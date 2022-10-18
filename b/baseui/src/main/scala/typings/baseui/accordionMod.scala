package typings.baseui

import typings.baseui.accordionAccordionMod.default
import typings.baseui.accordionTypesMod.PanelStateReducer
import typings.baseui.accordionTypesMod.SharedStylePropsArg
import typings.baseui.accordionTypesMod.StatefulPanelProps
import typings.baseui.accordionTypesMod.StatelessAccordionProps
import typings.baseui.anon.ExpandedBoolean
import typings.baseui.anon.PartialAccordionProps
import typings.baseui.anon.childrenReactNodedisabled
import typings.baseui.anon.heightstringnumberSharedS
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.g
import typings.baseui.baseuiStrings.li_
import typings.baseui.baseuiStrings.svg
import typings.baseui.baseuiStrings.ul
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.global.JSX.Element
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("baseui/accordion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/accordion", "Accordion")
  @js.native
  open class Accordion () extends default
  /* static members */
  object Accordion {
    
    @JSImport("baseui/accordion", "Accordion")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/accordion", "Accordion.defaultProps")
    @js.native
    def defaultProps: PartialAccordionProps = js.native
    inline def defaultProps_=(x: PartialAccordionProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/accordion", "Panel")
  @js.native
  val Panel: ForwardRefExoticComponent[childrenReactNodedisabled] = js.native
  
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/accordion", "STATE_CHANGE_TYPE.expand")
    @js.native
    val expand: typings.baseui.baseuiStrings.expand = js.native
  }
  
  inline def StatefulPanel(props: StatefulPanelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatefulPanel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/accordion", "StatefulPanelContainer")
  @js.native
  open class StatefulPanelContainer ()
    extends typings.baseui.accordionStatefulPanelContainerMod.default
  object StatefulPanelContainer {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/accordion", "StatefulPanelContainer.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/accordion", "StatefulPanelContainer.defaultProps.initialState")
      @js.native
      def initialState: ExpandedBoolean = js.native
      inline def initialState_=(x: ExpandedBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      @JSImport("baseui/accordion", "StatefulPanelContainer.defaultProps.stateReducer")
      @js.native
      def stateReducer: PanelStateReducer = js.native
      inline def stateReducer_=(x: PanelStateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def StatelessAccordion(hasAccordionChildrenDisabledExpandedOnChangeOverridesRenderAll: StatelessAccordionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatelessAccordion")(hasAccordionChildrenDisabledExpandedOnChangeOverridesRenderAll.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/accordion", "StyledContent")
  @js.native
  val StyledContent: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/accordion", "StyledContentAnimationContainer")
  @js.native
  val StyledContentAnimationContainer: StyletronComponent[div, heightstringnumberSharedS] = js.native
  
  @JSImport("baseui/accordion", "StyledHeader")
  @js.native
  val StyledHeader: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/accordion", "StyledPanelContainer")
  @js.native
  val StyledPanelContainer: StyletronComponent[li_, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/accordion", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[ul, js.Object] = js.native
  
  @JSImport("baseui/accordion", "StyledToggleIcon")
  @js.native
  val StyledToggleIcon: StyletronComponent[svg, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/accordion", "StyledToggleIconGroup")
  @js.native
  val StyledToggleIconGroup: StyletronComponent[g, SharedStylePropsArg] = js.native
  
  type SharedProps = SharedStylePropsArg
}
