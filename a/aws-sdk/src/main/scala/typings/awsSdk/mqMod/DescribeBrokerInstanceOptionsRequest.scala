package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBrokerInstanceOptionsRequest extends StObject {
  
  /**
    * Filter response by engine type.
    */
  var EngineType: js.UndefOr[string] = js.native
  
  /**
    * Filter response by host instance type.
    */
  var HostInstanceType: js.UndefOr[string] = js.native
  
  /**
    * The maximum number of instance options that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.mqMod.MaxResults] = js.native
  
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * Filter response by storage type.
    */
  var StorageType: js.UndefOr[string] = js.native
}
object DescribeBrokerInstanceOptionsRequest {
  
  @scala.inline
  def apply(): DescribeBrokerInstanceOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBrokerInstanceOptionsRequest]
  }
  
  @scala.inline
  implicit class DescribeBrokerInstanceOptionsRequestMutableBuilder[Self <: DescribeBrokerInstanceOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngineType(value: string): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
    
    @scala.inline
    def setHostInstanceType(value: string): Self = StObject.set(x, "HostInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostInstanceTypeUndefined: Self = StObject.set(x, "HostInstanceType", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStorageType(value: string): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
  }
}
