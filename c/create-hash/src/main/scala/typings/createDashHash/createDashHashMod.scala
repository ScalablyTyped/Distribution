package typings.createDashHash

import typings.createDashHash.createDashHashMod.HashAlgorithm
import typings.createDashHash.createDashHashMod.TypedArray
import typings.createDashHash.createDashHashMod.algorithm
import typings.createDashHash.createDashHashMod.encoding
import typings.node.Buffer
import typings.std.DataView
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("create-hash", JSImport.Namespace)
@js.native
object createDashHashMod extends js.Object {
  @js.native
  trait HashAlgorithm extends js.Object {
    def digest(): Buffer = js.native
    def digest(target: encoding): String = js.native
    def end(): Unit = js.native
    def read(): Unit = js.native
    def update(data: String): this.type = js.native
    def update(data: String, encoding: String): this.type = js.native
    def update(data: TypedArray): this.type = js.native
    def update(data: TypedArray, encoding: String): this.type = js.native
    def update(data: Buffer): this.type = js.native
    def update(data: Buffer, encoding: String): this.type = js.native
    def update(data: DataView): this.type = js.native
    def update(data: DataView, encoding: String): this.type = js.native
    def write(data: String): this.type = js.native
    def write(data: String, encoding: String): this.type = js.native
    def write(data: TypedArray): this.type = js.native
    def write(data: TypedArray, encoding: String): this.type = js.native
    def write(data: Buffer): this.type = js.native
    def write(data: Buffer, encoding: String): this.type = js.native
    def write(data: DataView): this.type = js.native
    def write(data: DataView, encoding: String): this.type = js.native
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
  type TypedArray = Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | Float32Array | Float64Array
}

