package typings.csstoolsPostcssTrigonometricFunctions

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tanMod {
  
  @JSImport("@csstools/postcss-trigonometric-functions/dist/tan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/postcss-trigonometric-functions/dist/tan", "tanFunctionCheck")
  @js.native
  val tanFunctionCheck: /* "tan(" */ String = js.native
  
  inline def transformTanFunction(decl: Declaration): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformTanFunction")(decl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
