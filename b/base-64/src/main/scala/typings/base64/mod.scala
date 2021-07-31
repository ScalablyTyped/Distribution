package typings.base64

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base-64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def encode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("base-64", "version")
  @js.native
  val version: String = js.native
}
