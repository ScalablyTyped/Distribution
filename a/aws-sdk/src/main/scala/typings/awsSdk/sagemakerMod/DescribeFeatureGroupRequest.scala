package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFeatureGroupRequest extends StObject {
  
  /**
    * The name of the FeatureGroup you want described. 
    */
  var FeatureGroupName: typings.awsSdk.sagemakerMod.FeatureGroupName
  
  /**
    * A token to resume pagination of the list of Features (FeatureDefinitions). 2,500 Features are returned by default.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object DescribeFeatureGroupRequest {
  
  inline def apply(FeatureGroupName: FeatureGroupName): DescribeFeatureGroupRequest = {
    val __obj = js.Dynamic.literal(FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFeatureGroupRequest]
  }
  
  extension [Self <: DescribeFeatureGroupRequest](x: Self) {
    
    inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
