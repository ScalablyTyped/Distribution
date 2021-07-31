package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataSourceRequest extends StObject {
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The ID of the data source. This ID is unique per AWS Region for each AWS account.
    */
  var DataSourceId: ResourceId
}
object DescribeDataSourceRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DataSourceId: ResourceId): DescribeDataSourceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSourceId = DataSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDataSourceRequest]
  }
  
  @scala.inline
  implicit class DescribeDataSourceRequestMutableBuilder[Self <: DescribeDataSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceId(value: ResourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
  }
}
