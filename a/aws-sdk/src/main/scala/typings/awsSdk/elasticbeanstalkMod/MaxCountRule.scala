package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxCountRule extends StObject {
  
  /**
    * Set to true to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes the application version.
    */
  var DeleteSourceFromS3: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Specify true to apply the rule, or false to disable it.
    */
  var Enabled: BoxedBoolean
  
  /**
    * Specify the maximum number of application versions to retain.
    */
  var MaxCount: js.UndefOr[BoxedInt] = js.undefined
}
object MaxCountRule {
  
  @scala.inline
  def apply(Enabled: BoxedBoolean): MaxCountRule = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxCountRule]
  }
  
  @scala.inline
  implicit class MaxCountRuleMutableBuilder[Self <: MaxCountRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteSourceFromS3(value: BoxedBoolean): Self = StObject.set(x, "DeleteSourceFromS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteSourceFromS3Undefined: Self = StObject.set(x, "DeleteSourceFromS3", js.undefined)
    
    @scala.inline
    def setEnabled(value: BoxedBoolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCount(value: BoxedInt): Self = StObject.set(x, "MaxCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCountUndefined: Self = StObject.set(x, "MaxCount", js.undefined)
  }
}
