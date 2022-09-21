package typings.bip21

import org.scalablytyped.runtime.StringDictionary
import typings.bip21.anon.Address
import typings.bip21.anon.Amount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bip21", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(uri: String): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(uri.asInstanceOf[js.Any]).asInstanceOf[Address]
  inline def decode(uri: String, urnScheme: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(uri.asInstanceOf[js.Any], urnScheme.asInstanceOf[js.Any])).asInstanceOf[Address]
  
  inline def encode(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(address: String, options: Unit, urnScheme: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(address.asInstanceOf[js.Any], options.asInstanceOf[js.Any], urnScheme.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(address: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(address.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(address: String, options: Options, urnScheme: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(address.asInstanceOf[js.Any], options.asInstanceOf[js.Any], urnScheme.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Options = Amount | StringDictionary[String]
}
