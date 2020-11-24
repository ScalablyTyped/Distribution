package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketLifecycleOutput extends js.Object {
  
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
  implicit class GetBucketLifecycleOutputOps[Self <: GetBucketLifecycleOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = this.set("Rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: Rules): Self = this.set("Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
  }
}
