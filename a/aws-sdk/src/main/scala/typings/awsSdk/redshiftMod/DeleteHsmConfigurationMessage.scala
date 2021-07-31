package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHsmConfigurationMessage extends StObject {
  
  /**
    * The identifier of the Amazon Redshift HSM configuration to be deleted.
    */
  var HsmConfigurationIdentifier: String
}
object DeleteHsmConfigurationMessage {
  
  @scala.inline
  def apply(HsmConfigurationIdentifier: String): DeleteHsmConfigurationMessage = {
    val __obj = js.Dynamic.literal(HsmConfigurationIdentifier = HsmConfigurationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmConfigurationMessage]
  }
  
  @scala.inline
  implicit class DeleteHsmConfigurationMessageMutableBuilder[Self <: DeleteHsmConfigurationMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsmConfigurationIdentifier(value: String): Self = StObject.set(x, "HsmConfigurationIdentifier", value.asInstanceOf[js.Any])
  }
}
