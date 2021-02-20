package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchProjectParams extends StObject {
  
  var archived: js.UndefOr[Boolean] = js.native
  
  var chartEnabled: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var projectLeaderCanEditProjectLeader: js.UndefOr[Boolean] = js.native
  
  var subtaskingEnabled: js.UndefOr[Boolean] = js.native
  
  var textFormattingRule: js.UndefOr[TextFormattingRule] = js.native
}
object PatchProjectParams {
  
  @scala.inline
  def apply(): PatchProjectParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchProjectParams]
  }
  
  @scala.inline
  implicit class PatchProjectParamsMutableBuilder[Self <: PatchProjectParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    @scala.inline
    def setChartEnabled(value: Boolean): Self = StObject.set(x, "chartEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartEnabledUndefined: Self = StObject.set(x, "chartEnabled", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProjectLeaderCanEditProjectLeader(value: Boolean): Self = StObject.set(x, "projectLeaderCanEditProjectLeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectLeaderCanEditProjectLeaderUndefined: Self = StObject.set(x, "projectLeaderCanEditProjectLeader", js.undefined)
    
    @scala.inline
    def setSubtaskingEnabled(value: Boolean): Self = StObject.set(x, "subtaskingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtaskingEnabledUndefined: Self = StObject.set(x, "subtaskingEnabled", js.undefined)
    
    @scala.inline
    def setTextFormattingRule(value: TextFormattingRule): Self = StObject.set(x, "textFormattingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFormattingRuleUndefined: Self = StObject.set(x, "textFormattingRule", js.undefined)
  }
}
