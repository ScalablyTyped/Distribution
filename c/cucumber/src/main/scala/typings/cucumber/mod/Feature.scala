package typings.cucumber.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  var description: String
  
  var keyword: String
  
  var line: Double
  
  var name: String
  
  var scenarios: js.Array[Scenario]
  
  var tags: js.Array[Tag]
  
  var uri: String
}
object Feature {
  
  @scala.inline
  def apply(
    description: String,
    keyword: String,
    line: Double,
    name: String,
    scenarios: js.Array[Scenario],
    tags: js.Array[Tag],
    uri: String
  ): Feature = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  
  @scala.inline
  implicit class FeatureMutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenarios(value: js.Array[Scenario]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenariosVarargs(value: Scenario*): Self = StObject.set(x, "scenarios", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
