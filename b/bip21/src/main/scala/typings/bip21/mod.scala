package typings.bip21

import typings.bip21.anon.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bip21", "decode")
  @js.native
  def decode(uri: String): Address = js.native
  
  @JSImport("bip21", "encode")
  @js.native
  def encode(address: String): String = js.native
  @JSImport("bip21", "encode")
  @js.native
  def encode(address: String, options: js.Any): String = js.native
}
