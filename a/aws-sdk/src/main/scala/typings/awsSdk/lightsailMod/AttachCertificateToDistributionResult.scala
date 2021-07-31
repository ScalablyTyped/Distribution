package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachCertificateToDistributionResult extends StObject {
  
  /**
    * An object that describes the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operation: js.UndefOr[Operation] = js.undefined
}
object AttachCertificateToDistributionResult {
  
  @scala.inline
  def apply(): AttachCertificateToDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachCertificateToDistributionResult]
  }
  
  @scala.inline
  implicit class AttachCertificateToDistributionResultMutableBuilder[Self <: AttachCertificateToDistributionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
