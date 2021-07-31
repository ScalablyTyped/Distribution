package typings.base64Js

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base64-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def byteLength(b64: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(b64.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def fromByteArray(uint8: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromByteArray")(uint8.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toByteArray(b64: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toByteArray")(b64.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
}
