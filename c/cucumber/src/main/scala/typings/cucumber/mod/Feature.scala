package typings.cucumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Feature extends js.Object {
  var description: String = js.native
  var keyword: String = js.native
  var line: Double = js.native
  var name: String = js.native
  var scenarios: js.Array[Scenario] = js.native
  var tags: js.Array[Tag] = js.native
  var uri: String = js.native
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
  implicit class FeatureOps[Self <: Feature] (val x: Self) extends AnyVal {
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
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setScenariosVarargs(value: Scenario*): Self = this.set("scenarios", js.Array(value :_*))
    @scala.inline
    def setScenarios(value: js.Array[Scenario]): Self = this.set("scenarios", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

