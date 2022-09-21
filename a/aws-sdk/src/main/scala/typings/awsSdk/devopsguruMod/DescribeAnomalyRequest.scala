package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAnomalyRequest extends StObject {
  
  /**
    * The ID of the member account.
    */
  var AccountId: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    *  The ID of the anomaly. 
    */
  var Id: AnomalyId
}
object DescribeAnomalyRequest {
  
  inline def apply(Id: AnomalyId): DescribeAnomalyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAnomalyRequest]
  }
  
  extension [Self <: DescribeAnomalyRequest](x: Self) {
    
    inline def setAccountId(value: AwsAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setId(value: AnomalyId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
