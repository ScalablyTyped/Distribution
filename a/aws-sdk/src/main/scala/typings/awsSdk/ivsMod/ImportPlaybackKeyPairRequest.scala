package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportPlaybackKeyPairRequest extends js.Object {
  
  /**
    * An arbitrary string (a nickname) assigned to a playback key pair that helps the customer identify that resource. The value does not need to be unique.
    */
  var name: js.UndefOr[PlaybackKeyPairName] = js.native
  
  /**
    * The public portion of a customer-generated key pair.
    */
  var publicKeyMaterial: PlaybackPublicKeyMaterial = js.native
  
  /**
    * Any tags provided with the request are added to the playback key pair tags.
    */
  var tags: js.UndefOr[Tags] = js.native
}
object ImportPlaybackKeyPairRequest {
  
  @scala.inline
  def apply(publicKeyMaterial: PlaybackPublicKeyMaterial): ImportPlaybackKeyPairRequest = {
    val __obj = js.Dynamic.literal(publicKeyMaterial = publicKeyMaterial.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportPlaybackKeyPairRequest]
  }
  
  @scala.inline
  implicit class ImportPlaybackKeyPairRequestOps[Self <: ImportPlaybackKeyPairRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPublicKeyMaterial(value: PlaybackPublicKeyMaterial): Self = this.set("publicKeyMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: PlaybackKeyPairName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
