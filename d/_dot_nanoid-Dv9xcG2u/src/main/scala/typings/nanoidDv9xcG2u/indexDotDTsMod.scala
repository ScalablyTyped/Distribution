package typings.nanoidDv9xcG2u

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexDotDTsMod {
  
  @JSImport(".nanoid-Dv9xcG2u/non-secure/index.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def customAlphabet(alphabet: String): js.Function1[/* size */ js.UndefOr[Double], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("customAlphabet")(alphabet.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* size */ js.UndefOr[Double], String]]
  inline def customAlphabet(alphabet: String, defaultSize: Double): js.Function1[/* size */ js.UndefOr[Double], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("customAlphabet")(alphabet.asInstanceOf[js.Any], defaultSize.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* size */ js.UndefOr[Double], String]]
  
  inline def nanoid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nanoid")().asInstanceOf[String]
  inline def nanoid(size: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nanoid")(size.asInstanceOf[js.Any]).asInstanceOf[String]
}
