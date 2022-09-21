package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutStoredQueryResponse extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the query. For example, arn:partition:service:region:account-id:resource-type/resource-name/resource-id.
    */
  var QueryArn: js.UndefOr[typings.awsSdk.configserviceMod.QueryArn] = js.undefined
}
object PutStoredQueryResponse {
  
  inline def apply(): PutStoredQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutStoredQueryResponse]
  }
  
  extension [Self <: PutStoredQueryResponse](x: Self) {
    
    inline def setQueryArn(value: QueryArn): Self = StObject.set(x, "QueryArn", value.asInstanceOf[js.Any])
    
    inline def setQueryArnUndefined: Self = StObject.set(x, "QueryArn", js.undefined)
  }
}
