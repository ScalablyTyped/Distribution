package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostProjectParams extends StObject {
  
  var chartEnabled: Boolean = js.native
  
  var key: String = js.native
  
  var name: String = js.native
  
  var projectLeaderCanEditProjectLeader: js.UndefOr[Boolean] = js.native
  
  var subtaskingEnabled: Boolean = js.native
  
  var textFormattingRule: TextFormattingRule = js.native
}
object PostProjectParams {
  
  @scala.inline
  def apply(
    chartEnabled: Boolean,
    key: String,
    name: String,
    subtaskingEnabled: Boolean,
    textFormattingRule: TextFormattingRule
  ): PostProjectParams = {
    val __obj = js.Dynamic.literal(chartEnabled = chartEnabled.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtaskingEnabled = subtaskingEnabled.asInstanceOf[js.Any], textFormattingRule = textFormattingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostProjectParams]
  }
  
  @scala.inline
  implicit class PostProjectParamsMutableBuilder[Self <: PostProjectParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartEnabled(value: Boolean): Self = StObject.set(x, "chartEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectLeaderCanEditProjectLeader(value: Boolean): Self = StObject.set(x, "projectLeaderCanEditProjectLeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectLeaderCanEditProjectLeaderUndefined: Self = StObject.set(x, "projectLeaderCanEditProjectLeader", js.undefined)
    
    @scala.inline
    def setSubtaskingEnabled(value: Boolean): Self = StObject.set(x, "subtaskingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFormattingRule(value: TextFormattingRule): Self = StObject.set(x, "textFormattingRule", value.asInstanceOf[js.Any])
  }
}
