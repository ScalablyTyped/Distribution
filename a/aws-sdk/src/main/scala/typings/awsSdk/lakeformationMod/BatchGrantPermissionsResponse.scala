package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGrantPermissionsResponse extends StObject {
  
  /**
    * A list of failures to grant permissions to the resources.
    */
  var Failures: js.UndefOr[BatchPermissionsFailureList] = js.undefined
}
object BatchGrantPermissionsResponse {
  
  @scala.inline
  def apply(): BatchGrantPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGrantPermissionsResponse]
  }
  
  @scala.inline
  implicit class BatchGrantPermissionsResponseMutableBuilder[Self <: BatchGrantPermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailures(value: BatchPermissionsFailureList): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: BatchPermissionsFailureEntry*): Self = StObject.set(x, "Failures", js.Array(value :_*))
  }
}
