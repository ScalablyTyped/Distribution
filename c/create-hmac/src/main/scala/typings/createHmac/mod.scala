package typings.createHmac

import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.Hmac
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(algo: Algorithm, key: String): Hmac = (^.asInstanceOf[js.Dynamic].apply(algo.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Hmac]
  inline def apply(algo: Algorithm, key: Buffer): Hmac = (^.asInstanceOf[js.Dynamic].apply(algo.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Hmac]
  
  @JSImport("create-hmac", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.createHmac.createHmacStrings.rmd160
    - typings.createHmac.createHmacStrings.ripemd160
    - typings.createHmac.createHmacStrings.md5
    - typings.createHmac.createHmacStrings.sha
    - typings.createHmac.createHmacStrings.sha1
    - typings.createHmac.createHmacStrings.sha224
    - typings.createHmac.createHmacStrings.sha256
    - typings.createHmac.createHmacStrings.sha384
    - typings.createHmac.createHmacStrings.sha512
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    inline def md5: typings.createHmac.createHmacStrings.md5 = "md5".asInstanceOf[typings.createHmac.createHmacStrings.md5]
    
    inline def ripemd160: typings.createHmac.createHmacStrings.ripemd160 = "ripemd160".asInstanceOf[typings.createHmac.createHmacStrings.ripemd160]
    
    inline def rmd160: typings.createHmac.createHmacStrings.rmd160 = "rmd160".asInstanceOf[typings.createHmac.createHmacStrings.rmd160]
    
    inline def sha: typings.createHmac.createHmacStrings.sha = "sha".asInstanceOf[typings.createHmac.createHmacStrings.sha]
    
    inline def sha1: typings.createHmac.createHmacStrings.sha1 = "sha1".asInstanceOf[typings.createHmac.createHmacStrings.sha1]
    
    inline def sha224: typings.createHmac.createHmacStrings.sha224 = "sha224".asInstanceOf[typings.createHmac.createHmacStrings.sha224]
    
    inline def sha256: typings.createHmac.createHmacStrings.sha256 = "sha256".asInstanceOf[typings.createHmac.createHmacStrings.sha256]
    
    inline def sha384: typings.createHmac.createHmacStrings.sha384 = "sha384".asInstanceOf[typings.createHmac.createHmacStrings.sha384]
    
    inline def sha512: typings.createHmac.createHmacStrings.sha512 = "sha512".asInstanceOf[typings.createHmac.createHmacStrings.sha512]
  }
}
