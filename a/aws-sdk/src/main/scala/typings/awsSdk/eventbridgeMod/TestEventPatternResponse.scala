package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestEventPatternResponse extends js.Object {
  
  /**
    * Indicates whether the event matches the event pattern.
    */
  var Result: js.UndefOr[Boolean] = js.native
}
object TestEventPatternResponse {
  
  @scala.inline
  def apply(): TestEventPatternResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestEventPatternResponse]
  }
  
  @scala.inline
  implicit class TestEventPatternResponseOps[Self <: TestEventPatternResponse] (val x: Self) extends AnyVal {
    
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
    def setResult(value: Boolean): Self = this.set("Result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("Result", js.undefined)
  }
}
