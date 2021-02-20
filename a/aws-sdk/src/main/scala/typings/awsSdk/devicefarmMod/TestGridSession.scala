package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestGridSession extends StObject {
  
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
  implicit class TestGridSessionMutableBuilder[Self <: TestGridSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: DeviceFarmArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setBillingMinutes(value: Double): Self = StObject.set(x, "billingMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingMinutesUndefined: Self = StObject.set(x, "billingMinutes", js.undefined)
    
    @scala.inline
    def setCreated(value: DateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setEnded(value: DateTime): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndedUndefined: Self = StObject.set(x, "ended", js.undefined)
    
    @scala.inline
    def setSeleniumProperties(value: String): Self = StObject.set(x, "seleniumProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeleniumPropertiesUndefined: Self = StObject.set(x, "seleniumProperties", js.undefined)
    
    @scala.inline
    def setStatus(value: TestGridSessionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
