package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxAgeRule extends StObject {
  
  /**
    * Set to true to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes the application version.
    */
  var DeleteSourceFromS3: js.UndefOr[BoxedBoolean] = js.native
  
  /**
    * Specify true to apply the rule, or false to disable it.
    */
  var Enabled: BoxedBoolean = js.native
  
  /**
    * Specify the number of days to retain an application versions.
    */
  var MaxAgeInDays: js.UndefOr[BoxedInt] = js.native
}
object MaxAgeRule {
  
  @scala.inline
  def apply(Enabled: BoxedBoolean): MaxAgeRule = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAgeRule]
  }
  
  @scala.inline
  implicit class MaxAgeRuleMutableBuilder[Self <: MaxAgeRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteSourceFromS3(value: BoxedBoolean): Self = StObject.set(x, "DeleteSourceFromS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteSourceFromS3Undefined: Self = StObject.set(x, "DeleteSourceFromS3", js.undefined)
    
    @scala.inline
    def setEnabled(value: BoxedBoolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeInDays(value: BoxedInt): Self = StObject.set(x, "MaxAgeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeInDaysUndefined: Self = StObject.set(x, "MaxAgeInDays", js.undefined)
  }
}
