package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Rule. */
@js.native
trait IRule extends js.Object {
  
  /** Rule children */
  var children: js.UndefOr[js.Array[IRuleChild] | Null] = js.native
  
  /** Rule description */
  var description: js.UndefOr[String | Null] = js.native
  
  /** Rule keyword */
  var keyword: js.UndefOr[String | Null] = js.native
  
  /** Rule location */
  var location: js.UndefOr[ILocation | Null] = js.native
  
  /** Rule name */
  var name: js.UndefOr[String | Null] = js.native
}
object IRule {
  
  @scala.inline
  def apply(): IRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRule]
  }
  
  @scala.inline
  implicit class IRuleOps[Self <: IRule] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: IRuleChild*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[IRuleChild]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyword: Self = this.set("keyword", js.undefined)
    
    @scala.inline
    def setKeywordNull: Self = this.set("keyword", null)
    
    @scala.inline
    def setLocation(value: ILocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
  }
}
