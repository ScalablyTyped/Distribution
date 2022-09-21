package typings.backlogJs.optionMod.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostProjectParams extends StObject {
  
  var chartEnabled: Boolean
  
  var key: String
  
  var name: String
  
  var projectLeaderCanEditProjectLeader: js.UndefOr[Boolean] = js.undefined
  
  var subtaskingEnabled: Boolean
  
  var textFormattingRule: TextFormattingRule
}
object PostProjectParams {
  
  inline def apply(
    chartEnabled: Boolean,
    key: String,
    name: String,
    subtaskingEnabled: Boolean,
    textFormattingRule: TextFormattingRule
  ): PostProjectParams = {
    val __obj = js.Dynamic.literal(chartEnabled = chartEnabled.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtaskingEnabled = subtaskingEnabled.asInstanceOf[js.Any], textFormattingRule = textFormattingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostProjectParams]
  }
  
  extension [Self <: PostProjectParams](x: Self) {
    
    inline def setChartEnabled(value: Boolean): Self = StObject.set(x, "chartEnabled", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProjectLeaderCanEditProjectLeader(value: Boolean): Self = StObject.set(x, "projectLeaderCanEditProjectLeader", value.asInstanceOf[js.Any])
    
    inline def setProjectLeaderCanEditProjectLeaderUndefined: Self = StObject.set(x, "projectLeaderCanEditProjectLeader", js.undefined)
    
    inline def setSubtaskingEnabled(value: Boolean): Self = StObject.set(x, "subtaskingEnabled", value.asInstanceOf[js.Any])
    
    inline def setTextFormattingRule(value: TextFormattingRule): Self = StObject.set(x, "textFormattingRule", value.asInstanceOf[js.Any])
  }
}
