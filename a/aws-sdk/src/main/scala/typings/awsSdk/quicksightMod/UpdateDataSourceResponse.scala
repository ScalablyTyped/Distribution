package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataSourceResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the data source.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The ID of the data source. This ID is unique per AWS Region for each AWS account.
    */
  var DataSourceId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * The update status of the data source's last update.
    */
  var UpdateStatus: js.UndefOr[ResourceStatus] = js.undefined
}
object UpdateDataSourceResponse {
  
  @scala.inline
  def apply(): UpdateDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDataSourceResponse]
  }
  
  @scala.inline
  implicit class UpdateDataSourceResponseMutableBuilder[Self <: UpdateDataSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setDataSourceId(value: ResourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "DataSourceId", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUpdateStatus(value: ResourceStatus): Self = StObject.set(x, "UpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateStatusUndefined: Self = StObject.set(x, "UpdateStatus", js.undefined)
  }
}
