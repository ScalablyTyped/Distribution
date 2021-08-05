package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestRunStarted. */
trait ITestRunStarted extends StObject {
  
  /** TestRunStarted timestamp */
  var timestamp: js.UndefOr[ITimestamp | Null] = js.undefined
}
object ITestRunStarted {
  
  inline def apply(): ITestRunStarted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestRunStarted]
  }
  
  extension [Self <: ITestRunStarted](x: Self) {
    
    inline def setTimestamp(value: ITimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
