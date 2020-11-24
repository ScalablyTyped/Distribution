package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSnapshotBlockResponse extends js.Object {
  
  /**
    * The SHA256 checksum generated for the block data by Amazon EBS.
    */
  var Checksum: js.UndefOr[typings.awsSdk.ebsMod.Checksum] = js.native
  
  /**
    * The algorithm used by Amazon EBS to generate the checksum.
    */
  var ChecksumAlgorithm: js.UndefOr[typings.awsSdk.ebsMod.ChecksumAlgorithm] = js.native
}
object PutSnapshotBlockResponse {
  
  @scala.inline
  def apply(): PutSnapshotBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSnapshotBlockResponse]
  }
  
  @scala.inline
  implicit class PutSnapshotBlockResponseOps[Self <: PutSnapshotBlockResponse] (val x: Self) extends AnyVal {
    
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
    def setChecksum(value: Checksum): Self = this.set("Checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("Checksum", js.undefined)
    
    @scala.inline
    def setChecksumAlgorithm(value: ChecksumAlgorithm): Self = this.set("ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksumAlgorithm: Self = this.set("ChecksumAlgorithm", js.undefined)
  }
}
