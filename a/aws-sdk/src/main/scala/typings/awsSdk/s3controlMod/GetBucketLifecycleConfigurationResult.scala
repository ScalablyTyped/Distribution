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
  
  @scala.inline
  def apply(): GetBucketLifecycleConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketLifecycleConfigurationResult]
  }
  
  @scala.inline
  implicit class GetBucketLifecycleConfigurationResultMutableBuilder[Self <: GetBucketLifecycleConfigurationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: LifecycleRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: LifecycleRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
