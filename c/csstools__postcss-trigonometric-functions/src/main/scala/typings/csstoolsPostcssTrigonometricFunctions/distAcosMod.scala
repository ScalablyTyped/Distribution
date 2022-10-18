package typings.csstoolsPostcssTrigonometricFunctions

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAcosMod {
  
  @JSImport("@csstools/postcss-trigonometric-functions/dist/acos", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/postcss-trigonometric-functions/dist/acos", "acosFunctionCheck")
  @js.native
  val acosFunctionCheck: /* "acos(" */ String = js.native
  
  inline def transformAcosFunction(decl: Declaration): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformAcosFunction")(decl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
