package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachCertificateFromDistributionResult extends StObject {
  
  /**
    * An object that describes the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operation: js.UndefOr[Operation] = js.native
}
object DetachCertificateFromDistributionResult {
  
  @scala.inline
  def apply(): DetachCertificateFromDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachCertificateFromDistributionResult]
  }
  
  @scala.inline
  implicit class DetachCertificateFromDistributionResultMutableBuilder[Self <: DetachCertificateFromDistributionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
