package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Background. */
@js.native
trait IBackground extends js.Object {
  
  /** Background description */
  var description: js.UndefOr[String | Null] = js.native
  
  /** Background keyword */
  var keyword: js.UndefOr[String | Null] = js.native
  
  /** Background location */
  var location: js.UndefOr[ILocation | Null] = js.native
  
  /** Background name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** Background steps */
  var steps: js.UndefOr[js.Array[IStep] | Null] = js.native
}
object IBackground {
  
  @scala.inline
  def apply(): IBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBackground]
  }
  
  @scala.inline
  implicit class IBackgroundOps[Self <: IBackground] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setStepsVarargs(value: IStep*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[IStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setStepsNull: Self = this.set("steps", null)
  }
}
