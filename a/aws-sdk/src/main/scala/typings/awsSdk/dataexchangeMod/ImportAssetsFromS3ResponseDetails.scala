package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportAssetsFromS3ResponseDetails extends js.Object {
  /**
    * Is a list of Amazon S3 bucket and object key pairs.
    */
  var AssetSources: ListOfAssetSourceEntry = js.native
  /**
    * The unique identifier for the data set associated with this import job.
    */
  var DataSetId: Id = js.native
  /**
    * The unique identifier for the revision associated with this import response.
    */
  var RevisionId: Id = js.native
}

object ImportAssetsFromS3ResponseDetails {
  @scala.inline
  def apply(AssetSources: ListOfAssetSourceEntry, DataSetId: Id, RevisionId: Id): ImportAssetsFromS3ResponseDetails = {
    val __obj = js.Dynamic.literal(AssetSources = AssetSources.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetsFromS3ResponseDetails]
  }
  @scala.inline
  implicit class ImportAssetsFromS3ResponseDetailsOps[Self <: ImportAssetsFromS3ResponseDetails] (val x: Self) extends AnyVal {
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
    def setAssetSourcesVarargs(value: AssetSourceEntry*): Self = this.set("AssetSources", js.Array(value :_*))
    @scala.inline
    def setAssetSources(value: ListOfAssetSourceEntry): Self = this.set("AssetSources", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSetId(value: Id): Self = this.set("DataSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevisionId(value: Id): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
  }
  
}

