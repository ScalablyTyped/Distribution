package typings.base64url

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base64url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("base64url", JSImport.Default)
  @js.native
  def default: Base64Url = js.native
  @scala.inline
  def default_=(x: Base64Url): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Base64Url extends StObject {
    
    def apply(input: String): String = js.native
    def apply(input: String, encoding: String): String = js.native
    def apply(input: Buffer): String = js.native
    def apply(input: Buffer, encoding: String): String = js.native
    
    def decode(base64url: String): String = js.native
    def decode(base64url: String, encoding: String): String = js.native
    
    def encode(input: String): String = js.native
    def encode(input: String, encoding: String): String = js.native
    def encode(input: Buffer): String = js.native
    def encode(input: Buffer, encoding: String): String = js.native
    
    def fromBase64(base64: String): String = js.native
    
    def toBase64(base64url: String): String = js.native
    def toBase64(base64url: Buffer): String = js.native
    
    def toBuffer(base64url: String): Buffer = js.native
  }
}
