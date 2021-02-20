package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterInstanceResponse extends StObject {
  
  /**
    * A value that you can use to determine whether the request completed successfully. For more information, see GetOperation.
    */
  var OperationId: js.UndefOr[typings.awsSdk.servicediscoveryMod.OperationId] = js.native
}
object DeregisterInstanceResponse {
  
  @scala.inline
  def apply(): DeregisterInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterInstanceResponse]
  }
  
  @scala.inline
  implicit class DeregisterInstanceResponseMutableBuilder[Self <: DeregisterInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
