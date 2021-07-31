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
  
  @scala.inline
  def apply(): DescribeRefreshSchemasStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRefreshSchemasStatusResponse]
  }
  
  @scala.inline
  implicit class DescribeRefreshSchemasStatusResponseMutableBuilder[Self <: DescribeRefreshSchemasStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefreshSchemasStatus(value: RefreshSchemasStatus): Self = StObject.set(x, "RefreshSchemasStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshSchemasStatusUndefined: Self = StObject.set(x, "RefreshSchemasStatus", js.undefined)
  }
}
