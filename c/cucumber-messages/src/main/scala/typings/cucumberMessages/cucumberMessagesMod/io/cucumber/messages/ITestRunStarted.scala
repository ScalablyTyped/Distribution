package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestRunStarted. */
@js.native
trait ITestRunStarted extends StObject {
  
  /** TestRunStarted timestamp */
  var timestamp: js.UndefOr[ITimestamp | Null] = js.native
}
object ITestRunStarted {
  
  @scala.inline
  def apply(): ITestRunStarted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestRunStarted]
  }
  
  @scala.inline
  implicit class ITestRunStartedMutableBuilder[Self <: ITestRunStarted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: ITimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
