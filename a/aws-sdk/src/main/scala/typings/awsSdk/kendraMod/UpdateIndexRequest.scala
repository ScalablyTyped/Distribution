package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIndexRequest extends js.Object {
  /**
    * Sets the number of addtional storage and query capacity units that should be used by the index. You can change the capacity of the index up to 5 times per day. If you are using extra storage units, you can't reduce the storage capacity below that required to meet the storage needs for your index.
    */
  var CapacityUnits: js.UndefOr[CapacityUnitsConfiguration] = js.native
  /**
    * A new description for the index.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.native
  /**
    * The document metadata to update. 
    */
  var DocumentMetadataConfigurationUpdates: js.UndefOr[DocumentMetadataConfigurationList] = js.native
  /**
    * The identifier of the index to update.
    */
  var Id: IndexId = js.native
  /**
    * The name of the index to update.
    */
  var Name: js.UndefOr[IndexName] = js.native
  /**
    * A new IAM role that gives Amazon Kendra permission to access your Amazon CloudWatch logs.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.native
}

object UpdateIndexRequest {
  @scala.inline
  def apply(Id: IndexId): UpdateIndexRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIndexRequest]
  }
  @scala.inline
  implicit class UpdateIndexRequestOps[Self <: UpdateIndexRequest] (val x: Self) extends AnyVal {
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
    def setId(value: IndexId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCapacityUnits(value: CapacityUnitsConfiguration): Self = this.set("CapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityUnits: Self = this.set("CapacityUnits", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDocumentMetadataConfigurationUpdatesVarargs(value: DocumentMetadataConfiguration*): Self = this.set("DocumentMetadataConfigurationUpdates", js.Array(value :_*))
    @scala.inline
    def setDocumentMetadataConfigurationUpdates(value: DocumentMetadataConfigurationList): Self = this.set("DocumentMetadataConfigurationUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentMetadataConfigurationUpdates: Self = this.set("DocumentMetadataConfigurationUpdates", js.undefined)
    @scala.inline
    def setName(value: IndexName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
  }
  
}

