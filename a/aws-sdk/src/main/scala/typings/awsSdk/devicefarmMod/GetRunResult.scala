package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRunResult extends StObject {
  
  /**
    * The run to get results from.
    */
  var run: js.UndefOr[Run] = js.undefined
}
object GetRunResult {
  
  @scala.inline
  def apply(): GetRunResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRunResult]
  }
  
  @scala.inline
  implicit class GetRunResultMutableBuilder[Self <: GetRunResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRun(value: Run): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
  }
}
