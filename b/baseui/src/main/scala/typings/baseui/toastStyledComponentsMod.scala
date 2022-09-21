package typings.baseui

import typings.baseui.anon.sizenumberstringcolorstri
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.svg
import typings.baseui.toastTypesMod.PlacementType
import typings.baseui.toastTypesMod.SharedStylePropsArg
import typings.baseui.toastTypesMod.ToasterSharedStylePropsArg
import typings.styletronReact.typesMod.StyletronComponent
import typings.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastStyledComponentsMod {
  
  @JSImport("baseui/toast/styled-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/toast/styled-components", "Body")
  @js.native
  val Body: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/toast/styled-components", "CloseIconSvg")
  @js.native
  val CloseIconSvg: StyletronComponent[svg, sizenumberstringcolorstri] = js.native
  
  @JSImport("baseui/toast/styled-components", "InnerContainer")
  @js.native
  val InnerContainer: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/toast/styled-components", "Root")
  @js.native
  val Root: StyletronComponent[div, ToasterSharedStylePropsArg] = js.native
  
  inline def getPlacement(placement: PlacementType): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlacement")(placement.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
}
