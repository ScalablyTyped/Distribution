package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTestGridSessionResult extends StObject {
  
  /**
    * The TestGridSession that was requested.
    */
  var testGridSession: js.UndefOr[TestGridSession] = js.native
}
object GetTestGridSessionResult {
  
  @scala.inline
  def apply(): GetTestGridSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTestGridSessionResult]
  }
  
  @scala.inline
  implicit class GetTestGridSessionResultMutableBuilder[Self <: GetTestGridSessionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestGridSession(value: TestGridSession): Self = StObject.set(x, "testGridSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestGridSessionUndefined: Self = StObject.set(x, "testGridSession", js.undefined)
  }
}
