package typings.bip21

import typings.bip21.anon.Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bip21", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decode(uri: String): Address = js.native
  
  def encode(address: String): String = js.native
  def encode(address: String, options: js.Any): String = js.native
}
