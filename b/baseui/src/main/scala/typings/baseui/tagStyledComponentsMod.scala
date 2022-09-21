package typings.baseui

import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.span
import typings.baseui.tagTypesMod.SharedPropsArg
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagStyledComponentsMod {
  
  @JSImport("baseui/tag/styled-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/tag/styled-components", "Action")
  @js.native
  val Action: StyletronComponent[span, SharedPropsArg] = js.native
  
  @JSImport("baseui/tag/styled-components", "Root")
  @js.native
  val Root: StyletronComponent[span, SharedPropsArg] = js.native
  
  @JSImport("baseui/tag/styled-components", "StartEnhancerContainer")
  @js.native
  val StartEnhancerContainer: StyletronComponent[div, SharedPropsArg] = js.native
  
  @JSImport("baseui/tag/styled-components", "Text")
  @js.native
  val Text: StyletronComponent[span, SharedPropsArg] = js.native
  
  inline def customOnRamp(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("customOnRamp")().asInstanceOf[String]
  inline def customOnRamp(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("customOnRamp")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def customOnRamp(color: String, unit: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("customOnRamp")(color.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def customOnRamp(color: Unit, unit: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("customOnRamp")(color.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
}
