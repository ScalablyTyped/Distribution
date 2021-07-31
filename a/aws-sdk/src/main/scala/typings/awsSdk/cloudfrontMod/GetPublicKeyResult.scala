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
  
  @scala.inline
  def apply(): GetPublicKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicKeyResult]
  }
  
  @scala.inline
  implicit class GetPublicKeyResultMutableBuilder[Self <: GetPublicKeyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setPublicKey(value: PublicKey): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
  }
}
