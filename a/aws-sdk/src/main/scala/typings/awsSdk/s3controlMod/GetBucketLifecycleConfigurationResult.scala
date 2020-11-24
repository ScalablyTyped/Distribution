package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketLifecycleConfigurationResult extends js.Object {
  
  /**
    * Container for the lifecycle rule of the Outposts bucket.
    */
  var Rules: js.UndefOr[LifecycleRules] = js.native
}
object GetBucketLifecycleConfigurationResult {
  
  @scala.inline
  def apply(): GetBucketLifecycleConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketLifecycleConfigurationResult]
  }
  
  @scala.inline
  implicit class GetBucketLifecycleConfigurationResultOps[Self <: GetBucketLifecycleConfigurationResult] (val x: Self) extends AnyVal {
    
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
    def setRulesVarargs(value: LifecycleRule*): Self = this.set("Rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: LifecycleRules): Self = this.set("Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
  }
}
