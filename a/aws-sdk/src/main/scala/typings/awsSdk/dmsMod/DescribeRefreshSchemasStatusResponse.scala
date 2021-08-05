package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRefreshSchemasStatusResponse extends StObject {
  
  /**
    * The status of the schema.
    */
  var RefreshSchemasStatus: js.UndefOr[typings.awsSdk.dmsMod.RefreshSchemasStatus] = js.undefined
}
object DescribeRefreshSchemasStatusResponse {
  
  inline def apply(): DescribeRefreshSchemasStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRefreshSchemasStatusResponse]
  }
  
  extension [Self <: DescribeRefreshSchemasStatusResponse](x: Self) {
    
    inline def setRefreshSchemasStatus(value: RefreshSchemasStatus): Self = StObject.set(x, "RefreshSchemasStatus", value.asInstanceOf[js.Any])
    
    inline def setRefreshSchemasStatusUndefined: Self = StObject.set(x, "RefreshSchemasStatus", js.undefined)
  }
}
