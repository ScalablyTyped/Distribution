package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild.IRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a FeatureChild. */
@js.native
trait IFeatureChild extends js.Object {
  
  /** FeatureChild background */
  var background: js.UndefOr[IBackground | Null] = js.native
  
  /** FeatureChild rule */
  var rule: js.UndefOr[IRule | Null] = js.native
  
  /** FeatureChild scenario */
  var scenario: js.UndefOr[IScenario | Null] = js.native
}
object IFeatureChild {
  
  @scala.inline
  def apply(): IFeatureChild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFeatureChild]
  }
  
  @scala.inline
  implicit class IFeatureChildOps[Self <: IFeatureChild] (val x: Self) extends AnyVal {
    
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
    def setRule(value: IRule): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    
    @scala.inline
    def setRuleNull: Self = this.set("rule", null)
    
    @scala.inline
    def setScenario(value: IScenario): Self = this.set("scenario", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScenario: Self = this.set("scenario", js.undefined)
    
    @scala.inline
    def setScenarioNull: Self = this.set("scenario", null)
  }
}
