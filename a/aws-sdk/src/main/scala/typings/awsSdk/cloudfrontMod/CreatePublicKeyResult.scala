package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePublicKeyResult extends StObject {
  
  /**
    * The identifier for this version of the public key.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * The URL of the public key.
    */
  var Location: js.UndefOr[String] = js.native
  
  /**
    * The public key.
    */
  var PublicKey: js.UndefOr[typings.awsSdk.cloudfrontMod.PublicKey] = js.native
}
object CreatePublicKeyResult {
  
  @scala.inline
  def apply(): CreatePublicKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePublicKeyResult]
  }
  
  @scala.inline
  implicit class CreatePublicKeyResultMutableBuilder[Self <: CreatePublicKeyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    @scala.inline
    def setPublicKey(value: PublicKey): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
  }
}
