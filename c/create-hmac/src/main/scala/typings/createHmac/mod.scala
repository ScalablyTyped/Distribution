package typings.createHmac

import typings.node.Buffer
import typings.node.cryptoMod.Hmac
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("create-hmac", JSImport.Namespace)
  @js.native
  def apply(algo: Algorithm, key: String): Hmac = js.native
  @JSImport("create-hmac", JSImport.Namespace)
  @js.native
  def apply(algo: Algorithm, key: Buffer): Hmac = js.native
  
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
    
    @scala.inline
    def md5: typings.createHmac.createHmacStrings.md5 = "md5".asInstanceOf[typings.createHmac.createHmacStrings.md5]
    
    @scala.inline
    def ripemd160: typings.createHmac.createHmacStrings.ripemd160 = "ripemd160".asInstanceOf[typings.createHmac.createHmacStrings.ripemd160]
    
    @scala.inline
    def rmd160: typings.createHmac.createHmacStrings.rmd160 = "rmd160".asInstanceOf[typings.createHmac.createHmacStrings.rmd160]
    
    @scala.inline
    def sha: typings.createHmac.createHmacStrings.sha = "sha".asInstanceOf[typings.createHmac.createHmacStrings.sha]
    
    @scala.inline
    def sha1: typings.createHmac.createHmacStrings.sha1 = "sha1".asInstanceOf[typings.createHmac.createHmacStrings.sha1]
    
    @scala.inline
    def sha224: typings.createHmac.createHmacStrings.sha224 = "sha224".asInstanceOf[typings.createHmac.createHmacStrings.sha224]
    
    @scala.inline
    def sha256: typings.createHmac.createHmacStrings.sha256 = "sha256".asInstanceOf[typings.createHmac.createHmacStrings.sha256]
    
    @scala.inline
    def sha384: typings.createHmac.createHmacStrings.sha384 = "sha384".asInstanceOf[typings.createHmac.createHmacStrings.sha384]
    
    @scala.inline
    def sha512: typings.createHmac.createHmacStrings.sha512 = "sha512".asInstanceOf[typings.createHmac.createHmacStrings.sha512]
  }
}
