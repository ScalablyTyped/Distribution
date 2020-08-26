package typings.cucumber.mod.events

import typings.cucumber.mod.Feature
import typings.cucumber.mod.Step
import typings.cucumber.mod.Tag
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScenarioPayload extends EventPayload {
  var description: String = js.native
  var exception: Error = js.native
  var feature: Feature = js.native
  var keyword: String = js.native
  var line: Double = js.native
  var lines: js.Array[Double] = js.native
  var name: String = js.native
  var steps: js.Array[Step] = js.native
  var tags: js.Array[Tag] = js.native
  var uri: String = js.native
}

object ScenarioPayload {
  @scala.inline
  def apply(
    description: String,
    exception: Error,
    feature: Feature,
    keyword: String,
    line: Double,
    lines: js.Array[Double],
    name: String,
    steps: js.Array[Step],
    tags: js.Array[Tag],
    uri: String
  ): ScenarioPayload = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenarioPayload]
  }
  @scala.inline
  implicit class ScenarioPayloadOps[Self <: ScenarioPayload] (val x: Self) extends AnyVal {
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
    def setException(value: Error): Self = this.set("exception", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeature(value: Feature): Self = this.set("feature", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinesVarargs(value: Double*): Self = this.set("lines", js.Array(value :_*))
    @scala.inline
    def setLines(value: js.Array[Double]): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepsVarargs(value: Step*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[Step]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

