package typings.bip21

import typings.bip21.anon.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bip21", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(uri: String): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(uri.asInstanceOf[js.Any]).asInstanceOf[Address]
  
  @scala.inline
  def encode(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def encode(address: String, options: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(address.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
