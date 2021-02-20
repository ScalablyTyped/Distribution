package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTestResult extends StObject {
  
  /**
    * A test condition that is evaluated.
    */
  var test: js.UndefOr[Test] = js.native
}
object GetTestResult {
  
  @scala.inline
  def apply(): GetTestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTestResult]
  }
  
  @scala.inline
  implicit class GetTestResultMutableBuilder[Self <: GetTestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTest(value: Test): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
