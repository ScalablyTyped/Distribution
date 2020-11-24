package typings.cleanCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AroundSelectorRelation extends js.Object {
  
  /**
    * Controls if spaces come around selector relations; e.g. `div > a`; defaults to `false`
    */
  var aroundSelectorRelation: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls if a space comes before a block begins; e.g. `.block {`; defaults to `false`
    */
  var beforeBlockBegins: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls if a space comes before a value; e.g. `width: 1rem`; defaults to `false`
    */
  var beforeValue: js.UndefOr[Boolean] = js.native
}
object AroundSelectorRelation {
  
  @scala.inline
  def apply(): AroundSelectorRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AroundSelectorRelation]
  }
  
  @scala.inline
  implicit class AroundSelectorRelationOps[Self <: AroundSelectorRelation] (val x: Self) extends AnyVal {
    
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
    def setAroundSelectorRelation(value: Boolean): Self = this.set("aroundSelectorRelation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAroundSelectorRelation: Self = this.set("aroundSelectorRelation", js.undefined)
    
    @scala.inline
    def setBeforeBlockBegins(value: Boolean): Self = this.set("beforeBlockBegins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeBlockBegins: Self = this.set("beforeBlockBegins", js.undefined)
    
    @scala.inline
    def setBeforeValue(value: Boolean): Self = this.set("beforeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeValue: Self = this.set("beforeValue", js.undefined)
  }
}
