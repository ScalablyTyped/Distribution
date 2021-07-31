package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportPlaybackKeyPairRequest extends StObject {
  
  /**
    * An arbitrary string (a nickname) assigned to a playback key pair that helps the customer identify that resource. The value does not need to be unique.
    */
  var name: js.UndefOr[PlaybackKeyPairName] = js.undefined
  
  /**
    * The public portion of a customer-generated key pair.
    */
  var publicKeyMaterial: PlaybackPublicKeyMaterial
  
  /**
    * Any tags provided with the request are added to the playback key pair tags.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object ImportPlaybackKeyPairRequest {
  
  @scala.inline
  def apply(publicKeyMaterial: PlaybackPublicKeyMaterial): ImportPlaybackKeyPairRequest = {
    val __obj = js.Dynamic.literal(publicKeyMaterial = publicKeyMaterial.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportPlaybackKeyPairRequest]
  }
  
  @scala.inline
  implicit class ImportPlaybackKeyPairRequestMutableBuilder[Self <: ImportPlaybackKeyPairRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: PlaybackKeyPairName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPublicKeyMaterial(value: PlaybackPublicKeyMaterial): Self = StObject.set(x, "publicKeyMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
