package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataSourcePermissionsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the data source.
    */
  var DataSourceArn: js.UndefOr[Arn] = js.undefined
  
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
}
object UpdateDataSourcePermissionsResponse {
  
  @scala.inline
  def apply(): UpdateDataSourcePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDataSourcePermissionsResponse]
  }
  
  @scala.inline
  implicit class UpdateDataSourcePermissionsResponseMutableBuilder[Self <: UpdateDataSourcePermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceArn(value: Arn): Self = StObject.set(x, "DataSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceArnUndefined: Self = StObject.set(x, "DataSourceArn", js.undefined)
    
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
  }
}
