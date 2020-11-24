package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MssPackage extends js.Object {
  
  var Encryption: js.UndefOr[MssEncryption] = js.native
  
  /**
    * A list of MSS manifest configurations.
    */
  var MssManifests: listOfMssManifest = js.native
  
  /**
    * The duration (in seconds) of each segment.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
}
object MssPackage {
  
  @scala.inline
  def apply(MssManifests: listOfMssManifest): MssPackage = {
    val __obj = js.Dynamic.literal(MssManifests = MssManifests.asInstanceOf[js.Any])
    __obj.asInstanceOf[MssPackage]
  }
  
  @scala.inline
  implicit class MssPackageOps[Self <: MssPackage] (val x: Self) extends AnyVal {
    
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
    def setMssManifestsVarargs(value: MssManifest*): Self = this.set("MssManifests", js.Array(value :_*))
    
    @scala.inline
    def setMssManifests(value: listOfMssManifest): Self = this.set("MssManifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryption(value: MssEncryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    
    @scala.inline
    def setSegmentDurationSeconds(value: integer): Self = this.set("SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentDurationSeconds: Self = this.set("SegmentDurationSeconds", js.undefined)
  }
}
