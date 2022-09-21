package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportPlaybackKeyPairRequest extends StObject {
  
  /**
    * Playback-key-pair name. The value does not need to be unique.
    */
  var name: js.UndefOr[PlaybackKeyPairName] = js.undefined
  
  /**
    * The public portion of a customer-generated key pair.
    */
  var publicKeyMaterial: PlaybackPublicKeyMaterial
  
  /**
    * Any tags provided with the request are added to the playback key pair tags. See Tagging Amazon Web Services Resources for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is documented there.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object ImportPlaybackKeyPairRequest {
  
  inline def apply(publicKeyMaterial: PlaybackPublicKeyMaterial): ImportPlaybackKeyPairRequest = {
    val __obj = js.Dynamic.literal(publicKeyMaterial = publicKeyMaterial.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportPlaybackKeyPairRequest]
  }
  
  extension [Self <: ImportPlaybackKeyPairRequest](x: Self) {
    
    inline def setName(value: PlaybackKeyPairName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublicKeyMaterial(value: PlaybackPublicKeyMaterial): Self = StObject.set(x, "publicKeyMaterial", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
