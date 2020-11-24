package typings.awsSdkClientS3Browser.typesLifecycleRuleFilterMod

import typings.awsSdkClientS3Browser.typesLifecycleRuleAndOperatorMod.LifecycleRuleAndOperator
import typings.awsSdkClientS3Browser.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleRuleFilter extends js.Object {
  
  /**
    * <p>This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates. The Lifecycle Rule will apply to any object matching all of the predicates configured inside the And operator.</p>
    */
  var And: js.UndefOr[LifecycleRuleAndOperator] = js.native
  
  /**
    * <p>Prefix identifying one or more objects to which the rule applies.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  
  /**
    * <p>This tag must exist in the object's tag set in order for the rule to apply.</p>
    */
  var Tag: js.UndefOr[typings.awsSdkClientS3Browser.typesTagMod.Tag] = js.native
}
object LifecycleRuleFilter {
  
  @scala.inline
  def apply(): LifecycleRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleRuleFilter]
  }
  
  @scala.inline
  implicit class LifecycleRuleFilterOps[Self <: LifecycleRuleFilter] (val x: Self) extends AnyVal {
    
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
    def setAnd(value: LifecycleRuleAndOperator): Self = this.set("And", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnd: Self = this.set("And", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    
    @scala.inline
    def setTag(value: Tag): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
}
