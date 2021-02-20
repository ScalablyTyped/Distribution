package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCACertificateParams extends StObject {
  
  /**
    * The action that you want to apply to the CA cerrtificate. The only supported value is DEACTIVATE.
    */
  var action: CACertificateUpdateAction = js.native
}
object UpdateCACertificateParams {
  
  @scala.inline
  def apply(action: CACertificateUpdateAction): UpdateCACertificateParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCACertificateParams]
  }
  
  @scala.inline
  implicit class UpdateCACertificateParamsMutableBuilder[Self <: UpdateCACertificateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: CACertificateUpdateAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
