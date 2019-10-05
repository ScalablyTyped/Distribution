package typings.createDashHmac

import typings.createDashHmac.createDashHmacMod.Algorithm
import typings.node.Buffer
import typings.node.cryptoMod.Hmac
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("create-hmac", JSImport.Namespace)
@js.native
object createDashHmacMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.createDashHmac.createDashHmacStrings.rmd160
    - typings.createDashHmac.createDashHmacStrings.ripemd160
    - typings.createDashHmac.createDashHmacStrings.md5
    - typings.createDashHmac.createDashHmacStrings.sha
    - typings.createDashHmac.createDashHmacStrings.sha1
    - typings.createDashHmac.createDashHmacStrings.sha224
    - typings.createDashHmac.createDashHmacStrings.sha256
    - typings.createDashHmac.createDashHmacStrings.sha384
    - typings.createDashHmac.createDashHmacStrings.sha512
  */
  trait Algorithm extends js.Object
  
  def apply(algo: Algorithm, key: String): Hmac = js.native
  def apply(algo: Algorithm, key: Buffer): Hmac = js.native
}

