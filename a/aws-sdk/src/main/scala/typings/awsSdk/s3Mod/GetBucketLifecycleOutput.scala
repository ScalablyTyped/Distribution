package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketLifecycleOutput extends StObject {
  
  /**
    * Container for a lifecycle rule.
    */
  var Rules: js.UndefOr[typings.awsSdk.s3Mod.Rules] = js.native
}
object GetBucketLifecycleOutput {
  
  @scala.inline
  def apply(): GetBucketLifecycleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketLifecycleOutput]
  }
  
  @scala.inline
  implicit class GetBucketLifecycleOutputMutableBuilder[Self <: GetBucketLifecycleOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
