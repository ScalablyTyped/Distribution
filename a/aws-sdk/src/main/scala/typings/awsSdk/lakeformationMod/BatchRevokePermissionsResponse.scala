package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchRevokePermissionsResponse extends StObject {
  
  /**
    * A list of failures to revoke permissions to the resources.
    */
  var Failures: js.UndefOr[BatchPermissionsFailureList] = js.native
}
object BatchRevokePermissionsResponse {
  
  @scala.inline
  def apply(): BatchRevokePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRevokePermissionsResponse]
  }
  
  @scala.inline
  implicit class BatchRevokePermissionsResponseMutableBuilder[Self <: BatchRevokePermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailures(value: BatchPermissionsFailureList): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: BatchPermissionsFailureEntry*): Self = StObject.set(x, "Failures", js.Array(value :_*))
  }
}
