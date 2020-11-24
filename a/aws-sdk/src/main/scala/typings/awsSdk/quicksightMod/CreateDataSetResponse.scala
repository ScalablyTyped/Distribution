package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDataSetResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
    */
  var DataSetId: js.UndefOr[ResourceId] = js.native
  
  /**
    * The ARN for the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
    */
  var IngestionArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ID of the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
    */
  var IngestionId: js.UndefOr[ResourceId] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object CreateDataSetResponse {
  
  @scala.inline
  def apply(): CreateDataSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataSetResponse]
  }
  
  @scala.inline
  implicit class CreateDataSetResponseOps[Self <: CreateDataSetResponse] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setDataSetId(value: ResourceId): Self = this.set("DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSetId: Self = this.set("DataSetId", js.undefined)
    
    @scala.inline
    def setIngestionArn(value: Arn): Self = this.set("IngestionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngestionArn: Self = this.set("IngestionArn", js.undefined)
    
    @scala.inline
    def setIngestionId(value: ResourceId): Self = this.set("IngestionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngestionId: Self = this.set("IngestionId", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
