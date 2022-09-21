package typings.csstoolsPostcssTrigonometricFunctions

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asinMod {
  
  @JSImport("@csstools/postcss-trigonometric-functions/dist/asin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/postcss-trigonometric-functions/dist/asin", "asinFunctionCheck")
  @js.native
  val asinFunctionCheck: /* "asin(" */ String = js.native
  
  inline def transformAsinFunction(decl: Declaration): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformAsinFunction")(decl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
