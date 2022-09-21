package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClassicLinkInstancesResult extends StObject {
  
  /**
    * Information about one or more linked EC2-Classic instances.
    */
  var Instances: js.UndefOr[ClassicLinkInstanceList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeClassicLinkInstancesResult {
  
  inline def apply(): DescribeClassicLinkInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClassicLinkInstancesResult]
  }
  
  extension [Self <: DescribeClassicLinkInstancesResult](x: Self) {
    
    inline def setInstances(value: ClassicLinkInstanceList): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: ClassicLinkInstance*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
