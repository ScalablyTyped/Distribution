package typings.awsSdkClientS3Node.typesLifecycleConfigurationMod

import typings.awsSdkClientS3Node.typesRuleMod.Rule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleConfiguration extends js.Object {
  
  /**
    * _Rules shape
    */
  var Rules: js.Array[Rule] | Iterable[Rule] = js.native
}
object LifecycleConfiguration {
  
  @scala.inline
  def apply(Rules: js.Array[Rule] | Iterable[Rule]): LifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleConfiguration]
  }
  
  @scala.inline
  implicit class LifecycleConfigurationOps[Self <: LifecycleConfiguration] (val x: Self) extends AnyVal {
    
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
    def setRules(value: js.Array[Rule] | Iterable[Rule]): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
}
