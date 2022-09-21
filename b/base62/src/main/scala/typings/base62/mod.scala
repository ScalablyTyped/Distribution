package typings.base62

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base62", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def encode(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setCharacterSet(characters: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCharacterSet")(characters.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
