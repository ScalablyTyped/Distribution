package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnprocessedStatistics extends js.Object {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  
  /**
    * The error message.
    */
  var Message: js.UndefOr[String] = js.native
  
  /**
    * The name of the sampling rule.
    */
  var RuleName: js.UndefOr[String] = js.native
}
object UnprocessedStatistics {
  
  @scala.inline
  def apply(): UnprocessedStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedStatistics]
  }
  
  @scala.inline
  implicit class UnprocessedStatisticsOps[Self <: UnprocessedStatistics] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: String): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setRuleName(value: String): Self = this.set("RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleName: Self = this.set("RuleName", js.undefined)
  }
}
