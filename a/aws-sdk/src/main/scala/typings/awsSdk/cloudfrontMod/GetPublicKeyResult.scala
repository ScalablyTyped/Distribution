package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPublicKeyResult extends StObject {
  
  /**
    * The identifier for this version of the public key.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The public key.
    */
  var PublicKey: js.UndefOr[typings.awsSdk.cloudfrontMod.PublicKey] = js.undefined
}
object GetPublicKeyResult {
  
  inline def apply(): GetPublicKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicKeyResult]
  }
  
  extension [Self <: GetPublicKeyResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setPublicKey(value: PublicKey): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
  }
}
