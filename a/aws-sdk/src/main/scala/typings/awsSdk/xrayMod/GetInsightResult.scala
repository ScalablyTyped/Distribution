package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightResult extends js.Object {
  
  /**
    * The summary information of an insight.
    */
  var Insight: js.UndefOr[typings.awsSdk.xrayMod.Insight] = js.native
}
object GetInsightResult {
  
  @scala.inline
  def apply(): GetInsightResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightResult]
  }
  
  @scala.inline
  implicit class GetInsightResultOps[Self <: GetInsightResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInsight(value: Insight): Self = this.set("Insight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsight: Self = this.set("Insight", js.undefined)
  }
}
