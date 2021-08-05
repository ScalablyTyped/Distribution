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
  
  inline def apply(): UpdateDataSourcePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDataSourcePermissionsResponse]
  }
  
  extension [Self <: UpdateDataSourcePermissionsResponse](x: Self) {
    
    inline def setDataSourceArn(value: Arn): Self = StObject.set(x, "DataSourceArn", value.asInstanceOf[js.Any])
    
    inline def setDataSourceArnUndefined: Self = StObject.set(x, "DataSourceArn", js.undefined)
    
    inline def setDataSourceId(value: ResourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "DataSourceId", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
