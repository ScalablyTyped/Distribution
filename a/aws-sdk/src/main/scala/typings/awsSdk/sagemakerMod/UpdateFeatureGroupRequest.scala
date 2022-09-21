package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFeatureGroupRequest extends StObject {
  
  /**
    * Updates the feature group. Updating a feature group is an asynchronous operation. When you get an HTTP 200 response, you've made a valid request. It takes some time after you've made a valid request for Feature Store to update the feature group.
    */
  var FeatureAdditions: js.UndefOr[typings.awsSdk.sagemakerMod.FeatureAdditions] = js.undefined
  
  /**
    * The name of the feature group that you're updating.
    */
  var FeatureGroupName: typings.awsSdk.sagemakerMod.FeatureGroupName
}
object UpdateFeatureGroupRequest {
  
  inline def apply(FeatureGroupName: FeatureGroupName): UpdateFeatureGroupRequest = {
    val __obj = js.Dynamic.literal(FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFeatureGroupRequest]
  }
  
  extension [Self <: UpdateFeatureGroupRequest](x: Self) {
    
    inline def setFeatureAdditions(value: FeatureAdditions): Self = StObject.set(x, "FeatureAdditions", value.asInstanceOf[js.Any])
    
    inline def setFeatureAdditionsUndefined: Self = StObject.set(x, "FeatureAdditions", js.undefined)
    
    inline def setFeatureAdditionsVarargs(value: FeatureDefinition*): Self = StObject.set(x, "FeatureAdditions", js.Array(value*))
    
    inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
  }
}
