package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetDestinationEntry extends js.Object {
  /**
    * The unique identifier for the asset.
    */
  var AssetId: Id = js.native
  /**
    * The S3 bucket that is the destination for the asset.
    */
  var Bucket: string = js.native
  /**
    * The name of the object in Amazon S3 for the asset.
    */
  var Key: js.UndefOr[string] = js.native
}

object AssetDestinationEntry {
  @scala.inline
  def apply(AssetId: Id, Bucket: string): AssetDestinationEntry = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetDestinationEntry]
  }
  @scala.inline
  implicit class AssetDestinationEntryOps[Self <: AssetDestinationEntry] (val x: Self) extends AnyVal {
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
    def setAssetId(value: Id): Self = this.set("AssetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucket(value: string): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: string): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
  }
  
}

