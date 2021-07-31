package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestRunFinished. */
trait ITestRunFinished extends StObject {
  
  /** TestRunFinished success */
  var success: js.UndefOr[Boolean | Null] = js.undefined
  
  /** TestRunFinished timestamp */
  var timestamp: js.UndefOr[ITimestamp | Null] = js.undefined
}
object ITestRunFinished {
  
  @scala.inline
  def apply(): ITestRunFinished = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestRunFinished]
  }
  
  @scala.inline
  implicit class ITestRunFinishedMutableBuilder[Self <: ITestRunFinished] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessNull: Self = StObject.set(x, "success", null)
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTimestamp(value: ITimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
