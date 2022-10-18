package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object string {
  
  @JSImport("css-tree", "string")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(input: String, apostrophe: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any], apostrophe.asInstanceOf[js.Any])).asInstanceOf[String]
}
