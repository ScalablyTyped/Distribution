package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestGridSessionAction extends StObject {
  
  /**
    * The action taken by the session.
    */
  var action: js.UndefOr[String] = js.native
  
  /**
    * The time, in milliseconds, that the action took to complete in the browser.
    */
  var duration: js.UndefOr[Long] = js.native
  
  /**
    * HTTP method that the browser used to make the request.
    */
  var requestMethod: js.UndefOr[String] = js.native
  
  /**
    * The time that the session invoked the action.
    */
  var started: js.UndefOr[DateTime] = js.native
  
  /**
    * HTTP status code returned to the browser when the action was taken.
    */
  var statusCode: js.UndefOr[String] = js.native
}
object TestGridSessionAction {
  
  @scala.inline
  def apply(): TestGridSessionAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestGridSessionAction]
  }
  
  @scala.inline
  implicit class TestGridSessionActionMutableBuilder[Self <: TestGridSessionAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setDuration(value: Long): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setRequestMethod(value: String): Self = StObject.set(x, "requestMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMethodUndefined: Self = StObject.set(x, "requestMethod", js.undefined)
    
    @scala.inline
    def setStarted(value: DateTime): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    @scala.inline
    def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
