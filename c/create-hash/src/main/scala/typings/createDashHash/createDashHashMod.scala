package typings.createDashHash

import typings.createDashHash.createDashHashMod.HashAlgorithm
import typings.createDashHash.createDashHashMod.algorithm
import typings.createDashHash.createDashHashMod.encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("create-hash", JSImport.Namespace)
@js.native
object createDashHashMod extends js.Object {
  @js.native
  trait HashAlgorithm extends js.Object {
    def digest(): String = js.native
    def digest(target: encoding): String = js.native
    def end(): Unit = js.native
    def read(): Unit = js.native
    def update(data: String): Unit = js.native
    def write(data: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.createDashHash.createDashHashStrings.md5
    - typings.createDashHash.createDashHashStrings.rmd160
    - typings.createDashHash.createDashHashStrings.ripemd160
    - typings.createDashHash.createDashHashStrings.sha
    - typings.createDashHash.createDashHashStrings.sha1
    - typings.createDashHash.createDashHashStrings.sha224
    - typings.createDashHash.createDashHashStrings.sha256
    - typings.createDashHash.createDashHashStrings.sha384
    - typings.createDashHash.createDashHashStrings.sha512
  */
  trait algorithm extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.createDashHash.createDashHashStrings.utf8
    - typings.createDashHash.createDashHashStrings.hex
    - typings.createDashHash.createDashHashStrings.base64
  */
  trait encoding extends js.Object
  
  def apply(algorithm: algorithm): HashAlgorithm = js.native
  def apply(algorithm: algorithm, options: js.Any): HashAlgorithm = js.native
}

