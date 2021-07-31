package typings.base64Url

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base64-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def decode(value: String, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def encode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def encode(value: String, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def escape(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def unescape(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
