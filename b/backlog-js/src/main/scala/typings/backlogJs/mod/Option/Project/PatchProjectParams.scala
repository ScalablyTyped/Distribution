package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchProjectParams extends StObject {
  
  var archived: js.UndefOr[Boolean] = js.undefined
  
  var chartEnabled: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var projectLeaderCanEditProjectLeader: js.UndefOr[Boolean] = js.undefined
  
  var subtaskingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var textFormattingRule: js.UndefOr[TextFormattingRule] = js.undefined
}
object PatchProjectParams {
  
  inline def apply(): PatchProjectParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchProjectParams]
  }
  
  extension [Self <: PatchProjectParams](x: Self) {
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setChartEnabled(value: Boolean): Self = StObject.set(x, "chartEnabled", value.asInstanceOf[js.Any])
    
    inline def setChartEnabledUndefined: Self = StObject.set(x, "chartEnabled", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectLeaderCanEditProjectLeader(value: Boolean): Self = StObject.set(x, "projectLeaderCanEditProjectLeader", value.asInstanceOf[js.Any])
    
    inline def setProjectLeaderCanEditProjectLeaderUndefined: Self = StObject.set(x, "projectLeaderCanEditProjectLeader", js.undefined)
    
    inline def setSubtaskingEnabled(value: Boolean): Self = StObject.set(x, "subtaskingEnabled", value.asInstanceOf[js.Any])
    
    inline def setSubtaskingEnabledUndefined: Self = StObject.set(x, "subtaskingEnabled", js.undefined)
    
    inline def setTextFormattingRule(value: TextFormattingRule): Self = StObject.set(x, "textFormattingRule", value.asInstanceOf[js.Any])
    
    inline def setTextFormattingRuleUndefined: Self = StObject.set(x, "textFormattingRule", js.undefined)
  }
}
