package typings.awsSdkClientS3Node.typesLifecycleConfigurationMod

import typings.awsSdkClientS3Node.typesRuleMod.UnmarshalledRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledLifecycleConfiguration extends LifecycleConfiguration {
  
  /**
    * _Rules shape
    */
  @JSName("Rules")
  var Rules_UnmarshalledLifecycleConfiguration: js.Array[UnmarshalledRule] = js.native
}
object UnmarshalledLifecycleConfiguration {
  
  @scala.inline
  def apply(Rules: js.Array[UnmarshalledRule]): UnmarshalledLifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledLifecycleConfiguration]
  }
  
  @scala.inline
  implicit class UnmarshalledLifecycleConfigurationOps[Self <: UnmarshalledLifecycleConfiguration] (val x: Self) extends AnyVal {
    
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
    def setRulesVarargs(value: UnmarshalledRule*): Self = this.set("Rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[UnmarshalledRule]): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
}
