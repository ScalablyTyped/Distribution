package typings.nanoidDv9xcG2u

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport(".nanoid-Dv9xcG2u", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def customAlphabet(alphabet: String): js.Function1[/* size */ js.UndefOr[Double], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("customAlphabet")(alphabet.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* size */ js.UndefOr[Double], String]]
  inline def customAlphabet(alphabet: String, defaultSize: Double): js.Function1[/* size */ js.UndefOr[Double], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("customAlphabet")(alphabet.asInstanceOf[js.Any], defaultSize.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* size */ js.UndefOr[Double], String]]
  
  inline def customRandom(alphabet: String, size: Double, random: js.Function1[/* bytes */ Double, js.typedarray.Uint8Array]): js.Function0[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("customRandom")(alphabet.asInstanceOf[js.Any], size.asInstanceOf[js.Any], random.asInstanceOf[js.Any])).asInstanceOf[js.Function0[String]]
  
  inline def nanoid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nanoid")().asInstanceOf[String]
  inline def nanoid(size: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nanoid")(size.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def random(bytes: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport(".nanoid-Dv9xcG2u", "urlAlphabet")
  @js.native
  val urlAlphabet: String = js.native
}
