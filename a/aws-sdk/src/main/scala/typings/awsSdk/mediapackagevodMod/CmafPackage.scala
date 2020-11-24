package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CmafPackage extends js.Object {
  
  var Encryption: js.UndefOr[CmafEncryption] = js.native
  
  /**
    * A list of HLS manifest configurations.
    */
  var HlsManifests: listOfHlsManifest = js.native
  
  /**
    * Duration (in seconds) of each fragment. Actual fragments will be
  rounded to the nearest multiple of the source fragment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
}
object CmafPackage {
  
  @scala.inline
  def apply(HlsManifests: listOfHlsManifest): CmafPackage = {
    val __obj = js.Dynamic.literal(HlsManifests = HlsManifests.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmafPackage]
  }
  
  @scala.inline
  implicit class CmafPackageOps[Self <: CmafPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHlsManifestsVarargs(value: HlsManifest*): Self = this.set("HlsManifests", js.Array(value :_*))
    
    @scala.inline
    def setHlsManifests(value: listOfHlsManifest): Self = this.set("HlsManifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryption(value: CmafEncryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    
    @scala.inline
    def setSegmentDurationSeconds(value: integer): Self = this.set("SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentDurationSeconds: Self = this.set("SegmentDurationSeconds", js.undefined)
  }
}
