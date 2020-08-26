package typings.axeWebdriverjs.mod

import typings.axeCore.mod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxeAnalysis extends js.Object {
  var inapplicable: js.Array[Result] = js.native
  var incomplete: js.Array[Result] = js.native
  var passes: js.Array[Result] = js.native
  var timestamp: String = js.native
  var url: String = js.native
  var violations: js.Array[Result] = js.native
}

object AxeAnalysis {
  @scala.inline
  def apply(
    inapplicable: js.Array[Result],
    incomplete: js.Array[Result],
    passes: js.Array[Result],
    timestamp: String,
    url: String,
    violations: js.Array[Result]
  ): AxeAnalysis = {
    val __obj = js.Dynamic.literal(inapplicable = inapplicable.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxeAnalysis]
  }
  @scala.inline
  implicit class AxeAnalysisOps[Self <: AxeAnalysis] (val x: Self) extends AnyVal {
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
    def setInapplicableVarargs(value: Result*): Self = this.set("inapplicable", js.Array(value :_*))
    @scala.inline
    def setInapplicable(value: js.Array[Result]): Self = this.set("inapplicable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncompleteVarargs(value: Result*): Self = this.set("incomplete", js.Array(value :_*))
    @scala.inline
    def setIncomplete(value: js.Array[Result]): Self = this.set("incomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassesVarargs(value: Result*): Self = this.set("passes", js.Array(value :_*))
    @scala.inline
    def setPasses(value: js.Array[Result]): Self = this.set("passes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setViolationsVarargs(value: Result*): Self = this.set("violations", js.Array(value :_*))
    @scala.inline
    def setViolations(value: js.Array[Result]): Self = this.set("violations", value.asInstanceOf[js.Any])
  }
  
}

