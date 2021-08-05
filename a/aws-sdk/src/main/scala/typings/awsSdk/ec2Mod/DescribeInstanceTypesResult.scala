package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceTypesResult extends StObject {
  
  /**
    * The instance type. For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceTypes: js.UndefOr[InstanceTypeInfoList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
}
object DescribeInstanceTypesResult {
  
  inline def apply(): DescribeInstanceTypesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceTypesResult]
  }
  
  extension [Self <: DescribeInstanceTypesResult](x: Self) {
    
    inline def setInstanceTypes(value: InstanceTypeInfoList): Self = StObject.set(x, "InstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypesUndefined: Self = StObject.set(x, "InstanceTypes", js.undefined)
    
    inline def setInstanceTypesVarargs(value: InstanceTypeInfo*): Self = StObject.set(x, "InstanceTypes", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
