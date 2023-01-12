package typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PxfObject extends StObject {
  
  /**
    * PFX or PKCS12 encoded private key and certificate chain.
    */
  var buf: String | Buffer
  
  /**
    * Optional passphrase.
    */
  var passphrase: js.UndefOr[String] = js.undefined
}
object PxfObject {
  
  inline def apply(buf: String | Buffer): PxfObject = {
    val __obj = js.Dynamic.literal(buf = buf.asInstanceOf[js.Any])
    __obj.asInstanceOf[PxfObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PxfObject] (val x: Self) extends AnyVal {
    
    inline def setBuf(value: String | Buffer): Self = StObject.set(x, "buf", value.asInstanceOf[js.Any])
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
  }
}
