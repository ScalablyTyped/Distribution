package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.IBackground
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.IScenario
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RuleChild. */
@js.native
trait IRuleChild extends js.Object {
  
  /** RuleChild background */
  var background: js.UndefOr[IBackground | Null] = js.native
  
  /** RuleChild scenario */
  var scenario: js.UndefOr[IScenario | Null] = js.native
}
object IRuleChild {
  
  @scala.inline
  def apply(): IRuleChild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRuleChild]
  }
  
  @scala.inline
  implicit class IRuleChildOps[Self <: IRuleChild] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: IBackground): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBackgroundNull: Self = this.set("background", null)
    
    @scala.inline
    def setScenario(value: IScenario): Self = this.set("scenario", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScenario: Self = this.set("scenario", js.undefined)
    
    @scala.inline
    def setScenarioNull: Self = this.set("scenario", null)
  }
}
