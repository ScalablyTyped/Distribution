package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

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
  
  inline def apply(): ITestRunFinished = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestRunFinished]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITestRunFinished] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessNull: Self = StObject.set(x, "success", null)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimestamp(value: ITimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
