package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFeatureGroupResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the FeatureGroup. This is a unique identifier for the feature group. 
    */
  var FeatureGroupArn: typings.awsSdk.sagemakerMod.FeatureGroupArn
}
object CreateFeatureGroupResponse {
  
  inline def apply(FeatureGroupArn: FeatureGroupArn): CreateFeatureGroupResponse = {
    val __obj = js.Dynamic.literal(FeatureGroupArn = FeatureGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFeatureGroupResponse]
  }
  
  extension [Self <: CreateFeatureGroupResponse](x: Self) {
    
    inline def setFeatureGroupArn(value: FeatureGroupArn): Self = StObject.set(x, "FeatureGroupArn", value.asInstanceOf[js.Any])
  }
}
