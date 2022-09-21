package typings.createHash

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(algorithm: algorithm): HashAlgorithm = ^.asInstanceOf[js.Dynamic].apply(algorithm.asInstanceOf[js.Any]).asInstanceOf[HashAlgorithm]
  inline def apply(algorithm: algorithm, options: Any): HashAlgorithm = (^.asInstanceOf[js.Dynamic].apply(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HashAlgorithm]
  
  @JSImport("create-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait HashAlgorithm extends StObject {
    
    def digest(): Buffer = js.native
    def digest(target: encoding): String = js.native
    
    def end(): Unit = js.native
    
    def read(): Unit = js.native
    
    def update(data: String): this.type = js.native
    def update(data: String, encoding: String): this.type = js.native
    def update(data: js.typedarray.DataView): this.type = js.native
    def update(data: js.typedarray.DataView, encoding: String): this.type = js.native
    def update(data: TypedArray): this.type = js.native
    def update(data: TypedArray, encoding: String): this.type = js.native
    def update(data: Buffer): this.type = js.native
    def update(data: Buffer, encoding: String): this.type = js.native
    
    def write(data: String): this.type = js.native
    def write(data: String, encoding: String): this.type = js.native
    def write(data: js.typedarray.DataView): this.type = js.native
    def write(data: js.typedarray.DataView, encoding: String): this.type = js.native
    def write(data: TypedArray): this.type = js.native
    def write(data: TypedArray, encoding: String): this.type = js.native
    def write(data: Buffer): this.type = js.native
    def write(data: Buffer, encoding: String): this.type = js.native
  }
  
  type TypedArray = js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  /* Rewritten from type alias, can be one of: 
    - typings.createHash.createHashStrings.md5
    - typings.createHash.createHashStrings.rmd160
    - typings.createHash.createHashStrings.ripemd160
    - typings.createHash.createHashStrings.sha
    - typings.createHash.createHashStrings.sha1
    - typings.createHash.createHashStrings.sha224
    - typings.createHash.createHashStrings.sha256
    - typings.createHash.createHashStrings.sha384
    - typings.createHash.createHashStrings.sha512
  */
  trait algorithm extends StObject
  object algorithm {
    
    inline def md5: typings.createHash.createHashStrings.md5 = "md5".asInstanceOf[typings.createHash.createHashStrings.md5]
    
    inline def ripemd160: typings.createHash.createHashStrings.ripemd160 = "ripemd160".asInstanceOf[typings.createHash.createHashStrings.ripemd160]
    
    inline def rmd160: typings.createHash.createHashStrings.rmd160 = "rmd160".asInstanceOf[typings.createHash.createHashStrings.rmd160]
    
    inline def sha: typings.createHash.createHashStrings.sha = "sha".asInstanceOf[typings.createHash.createHashStrings.sha]
    
    inline def sha1: typings.createHash.createHashStrings.sha1 = "sha1".asInstanceOf[typings.createHash.createHashStrings.sha1]
    
    inline def sha224: typings.createHash.createHashStrings.sha224 = "sha224".asInstanceOf[typings.createHash.createHashStrings.sha224]
    
    inline def sha256: typings.createHash.createHashStrings.sha256 = "sha256".asInstanceOf[typings.createHash.createHashStrings.sha256]
    
    inline def sha384: typings.createHash.createHashStrings.sha384 = "sha384".asInstanceOf[typings.createHash.createHashStrings.sha384]
    
    inline def sha512: typings.createHash.createHashStrings.sha512 = "sha512".asInstanceOf[typings.createHash.createHashStrings.sha512]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.createHash.createHashStrings.utf8
    - typings.createHash.createHashStrings.hex
    - typings.createHash.createHashStrings.base64
  */
  trait encoding extends StObject
  object encoding {
    
    inline def base64: typings.createHash.createHashStrings.base64 = "base64".asInstanceOf[typings.createHash.createHashStrings.base64]
    
    inline def hex: typings.createHash.createHashStrings.hex = "hex".asInstanceOf[typings.createHash.createHashStrings.hex]
    
    inline def utf8: typings.createHash.createHashStrings.utf8 = "utf8".asInstanceOf[typings.createHash.createHashStrings.utf8]
  }
}
