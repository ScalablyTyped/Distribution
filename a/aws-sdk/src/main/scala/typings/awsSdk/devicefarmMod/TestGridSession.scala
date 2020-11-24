package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestGridSession extends js.Object {
  
  /**
    * The ARN of the session.
    */
  var arn: js.UndefOr[DeviceFarmArn] = js.native
  
  /**
    * The number of billed minutes that were used for this session. 
    */
  var billingMinutes: js.UndefOr[Double] = js.native
  
  /**
    * The time that the session was started.
    */
  var created: js.UndefOr[DateTime] = js.native
  
  /**
    * The time the session ended.
    */
  var ended: js.UndefOr[DateTime] = js.native
  
  /**
    * A JSON object of options and parameters passed to the Selenium WebDriver.
    */
  var seleniumProperties: js.UndefOr[String] = js.native
  
  /**
    * The state of the session.
    */
  var status: js.UndefOr[TestGridSessionStatus] = js.native
}
object TestGridSession {
  
  @scala.inline
  def apply(): TestGridSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestGridSession]
  }
  
  @scala.inline
  implicit class TestGridSessionOps[Self <: TestGridSession] (val x: Self) extends AnyVal {
    
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
    def setArn(value: DeviceFarmArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setBillingMinutes(value: Double): Self = this.set("billingMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingMinutes: Self = this.set("billingMinutes", js.undefined)
    
    @scala.inline
    def setCreated(value: DateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setEnded(value: DateTime): Self = this.set("ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnded: Self = this.set("ended", js.undefined)
    
    @scala.inline
    def setSeleniumProperties(value: String): Self = this.set("seleniumProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeleniumProperties: Self = this.set("seleniumProperties", js.undefined)
    
    @scala.inline
    def setStatus(value: TestGridSessionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
