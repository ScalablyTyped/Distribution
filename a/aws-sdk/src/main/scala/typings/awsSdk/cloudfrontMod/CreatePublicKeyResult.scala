package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePublicKeyResult extends StObject {
  
  /**
    * The identifier for this version of the public key.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the public key.
    */
  var Location: js.UndefOr[String] = js.undefined
  
  /**
    * The public key.
    */
  var PublicKey: js.UndefOr[typings.awsSdk.cloudfrontMod.PublicKey] = js.undefined
}
object CreatePublicKeyResult {
  
  inline def apply(): CreatePublicKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePublicKeyResult]
  }
  
  extension [Self <: CreatePublicKeyResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setPublicKey(value: PublicKey): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
  }
}
