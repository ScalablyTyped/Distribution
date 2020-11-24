package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxCountRule extends js.Object {
  
  /**
    * Set to true to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes the application version.
    */
  var DeleteSourceFromS3: js.UndefOr[BoxedBoolean] = js.native
  
  /**
    * Specify true to apply the rule, or false to disable it.
    */
  var Enabled: BoxedBoolean = js.native
  
  /**
    * Specify the maximum number of application versions to retain.
    */
  var MaxCount: js.UndefOr[BoxedInt] = js.native
}
object MaxCountRule {
  
  @scala.inline
  def apply(Enabled: BoxedBoolean): MaxCountRule = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxCountRule]
  }
  
  @scala.inline
  implicit class MaxCountRuleOps[Self <: MaxCountRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: BoxedBoolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteSourceFromS3(value: BoxedBoolean): Self = this.set("DeleteSourceFromS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteSourceFromS3: Self = this.set("DeleteSourceFromS3", js.undefined)
    
    @scala.inline
    def setMaxCount(value: BoxedInt): Self = this.set("MaxCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCount: Self = this.set("MaxCount", js.undefined)
  }
}
