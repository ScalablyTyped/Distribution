package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketLifecycleConfigurationOutput extends StObject {
  
  /**
    * Container for a lifecycle rule.
    */
  var Rules: js.UndefOr[LifecycleRules] = js.native
}
object GetBucketLifecycleConfigurationOutput {
  
  @scala.inline
  def apply(): GetBucketLifecycleConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketLifecycleConfigurationOutput]
  }
  
  @scala.inline
  implicit class GetBucketLifecycleConfigurationOutputMutableBuilder[Self <: GetBucketLifecycleConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: LifecycleRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: LifecycleRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
