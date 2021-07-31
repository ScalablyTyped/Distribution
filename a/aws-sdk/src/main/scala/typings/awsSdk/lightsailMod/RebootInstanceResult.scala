package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootInstanceResult extends StObject {
  
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}
object RebootInstanceResult {
  
  @scala.inline
  def apply(): RebootInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootInstanceResult]
  }
  
  @scala.inline
  implicit class RebootInstanceResultMutableBuilder[Self <: RebootInstanceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperations(value: OperationList): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value :_*))
  }
}
