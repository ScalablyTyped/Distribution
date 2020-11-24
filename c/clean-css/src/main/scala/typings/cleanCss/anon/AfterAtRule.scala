package typings.cleanCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterAtRule extends js.Object {
  
  /**
    * Controls if a line break comes after an at-rule; e.g. `@charset`; defaults to `false`
    */
  var afterAtRule: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls if a line break comes after a block begins; e.g. `@media`; defaults to `false`
    */
  var afterBlockBegins: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls if a line break comes after a block ends, defaults to `false`
    */
  var afterBlockEnds: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls if a line break comes after a comment; defaults to `false`
    */
  var afterComment: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls if a line break comes after a property; defaults to `false`
    */
  var afterProperty: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls if a line break comes after a rule begins; defaults to `false`
    */
  var afterRuleBegins: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls if a line break comes after a rule ends; defaults to `false`
    */
  var afterRuleEnds: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls if a line break comes before a block ends; defaults to `false`
    */
  var beforeBlockEnds: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls if a line break comes between selectors; defaults to `false`
    */
  var betweenSelectors: js.UndefOr[Boolean] = js.native
}
object AfterAtRule {
  
  @scala.inline
  def apply(): AfterAtRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AfterAtRule]
  }
  
  @scala.inline
  implicit class AfterAtRuleOps[Self <: AfterAtRule] (val x: Self) extends AnyVal {
    
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
    def setAfterAtRule(value: Boolean): Self = this.set("afterAtRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterAtRule: Self = this.set("afterAtRule", js.undefined)
    
    @scala.inline
    def setAfterBlockBegins(value: Boolean): Self = this.set("afterBlockBegins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterBlockBegins: Self = this.set("afterBlockBegins", js.undefined)
    
    @scala.inline
    def setAfterBlockEnds(value: Boolean): Self = this.set("afterBlockEnds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterBlockEnds: Self = this.set("afterBlockEnds", js.undefined)
    
    @scala.inline
    def setAfterComment(value: Boolean): Self = this.set("afterComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterComment: Self = this.set("afterComment", js.undefined)
    
    @scala.inline
    def setAfterProperty(value: Boolean): Self = this.set("afterProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterProperty: Self = this.set("afterProperty", js.undefined)
    
    @scala.inline
    def setAfterRuleBegins(value: Boolean): Self = this.set("afterRuleBegins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterRuleBegins: Self = this.set("afterRuleBegins", js.undefined)
    
    @scala.inline
    def setAfterRuleEnds(value: Boolean): Self = this.set("afterRuleEnds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterRuleEnds: Self = this.set("afterRuleEnds", js.undefined)
    
    @scala.inline
    def setBeforeBlockEnds(value: Boolean): Self = this.set("beforeBlockEnds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeBlockEnds: Self = this.set("beforeBlockEnds", js.undefined)
    
    @scala.inline
    def setBetweenSelectors(value: Boolean): Self = this.set("betweenSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBetweenSelectors: Self = this.set("betweenSelectors", js.undefined)
  }
}
