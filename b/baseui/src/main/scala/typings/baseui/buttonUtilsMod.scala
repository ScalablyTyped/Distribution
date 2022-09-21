package typings.baseui

import typings.baseui.anon.PartialSharedStyleProps
import typings.baseui.buttonTypesMod.ButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonUtilsMod {
  
  @JSImport("baseui/button/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSharedProps(hasColorsDisabledIsLoadingIsSelectedKindShapeSize: ButtonProps): PartialSharedStyleProps = ^.asInstanceOf[js.Dynamic].applyDynamic("getSharedProps")(hasColorsDisabledIsLoadingIsSelectedKindShapeSize.asInstanceOf[js.Any]).asInstanceOf[PartialSharedStyleProps]
}
