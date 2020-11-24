package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestMetricFilterResponse extends js.Object {
  
  /**
    * The matched events.
    */
  var matches: js.UndefOr[MetricFilterMatches] = js.native
}
object TestMetricFilterResponse {
  
  @scala.inline
  def apply(): TestMetricFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestMetricFilterResponse]
  }
  
  @scala.inline
  implicit class TestMetricFilterResponseOps[Self <: TestMetricFilterResponse] (val x: Self) extends AnyVal {
    
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
    def setMatchesVarargs(value: MetricFilterMatchRecord*): Self = this.set("matches", js.Array(value :_*))
    
    @scala.inline
    def setMatches(value: MetricFilterMatches): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
  }
}
