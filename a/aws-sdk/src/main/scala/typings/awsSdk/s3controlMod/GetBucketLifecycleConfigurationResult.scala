package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketLifecycleConfigurationResult extends StObject {
  
  /**
    * Container for the lifecycle rule of the Outposts bucket.
    */
  var Rules: js.UndefOr[LifecycleRules] = js.undefined
}
object GetBucketLifecycleConfigurationResult {
  
  inline def apply(): GetBucketLifecycleConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketLifecycleConfigurationResult]
  }
  
  extension [Self <: GetBucketLifecycleConfigurationResult](x: Self) {
    
    inline def setRules(value: LifecycleRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: LifecycleRule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
