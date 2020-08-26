package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotBlockResponse extends js.Object {
  /**
    * The data content of the block.
    */
  var BlockData: js.UndefOr[typings.awsSdk.ebsMod.BlockData] = js.native
  /**
    * The checksum generated for the block, which is Base64 encoded.
    */
  var Checksum: js.UndefOr[typings.awsSdk.ebsMod.Checksum] = js.native
  /**
    * The algorithm used to generate the checksum for the block, such as SHA256.
    */
  var ChecksumAlgorithm: js.UndefOr[typings.awsSdk.ebsMod.ChecksumAlgorithm] = js.native
  /**
    * The size of the data in the block.
    */
  var DataLength: js.UndefOr[typings.awsSdk.ebsMod.DataLength] = js.native
}

object GetSnapshotBlockResponse {
  @scala.inline
  def apply(): GetSnapshotBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnapshotBlockResponse]
  }
  @scala.inline
  implicit class GetSnapshotBlockResponseOps[Self <: GetSnapshotBlockResponse] (val x: Self) extends AnyVal {
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
    def setBlockData(value: BlockData): Self = this.set("BlockData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockData: Self = this.set("BlockData", js.undefined)
    @scala.inline
    def setChecksum(value: Checksum): Self = this.set("Checksum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecksum: Self = this.set("Checksum", js.undefined)
    @scala.inline
    def setChecksumAlgorithm(value: ChecksumAlgorithm): Self = this.set("ChecksumAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecksumAlgorithm: Self = this.set("ChecksumAlgorithm", js.undefined)
    @scala.inline
    def setDataLength(value: DataLength): Self = this.set("DataLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLength: Self = this.set("DataLength", js.undefined)
  }
  
}

