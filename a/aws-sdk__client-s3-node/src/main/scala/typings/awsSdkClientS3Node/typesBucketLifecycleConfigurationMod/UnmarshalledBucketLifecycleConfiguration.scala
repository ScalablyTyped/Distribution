package typings.awsSdkClientS3Node.typesBucketLifecycleConfigurationMod

import typings.awsSdkClientS3Node.typesLifecycleRuleMod.UnmarshalledLifecycleRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledBucketLifecycleConfiguration extends BucketLifecycleConfiguration {
  
  /**
    * _LifecycleRules shape
    */
  @JSName("Rules")
  var Rules_UnmarshalledBucketLifecycleConfiguration: js.Array[UnmarshalledLifecycleRule] = js.native
}
object UnmarshalledBucketLifecycleConfiguration {
  
  @scala.inline
  def apply(Rules: js.Array[UnmarshalledLifecycleRule]): UnmarshalledBucketLifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledBucketLifecycleConfiguration]
  }
  
  @scala.inline
  implicit class UnmarshalledBucketLifecycleConfigurationOps[Self <: UnmarshalledBucketLifecycleConfiguration] (val x: Self) extends AnyVal {
    
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
    def setRulesVarargs(value: UnmarshalledLifecycleRule*): Self = this.set("Rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[UnmarshalledLifecycleRule]): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
}
