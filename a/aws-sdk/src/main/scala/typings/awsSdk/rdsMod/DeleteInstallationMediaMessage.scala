package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInstallationMediaMessage extends StObject {
  
  /**
    * The installation medium ID.
    */
  var InstallationMediaId: String
}
object DeleteInstallationMediaMessage {
  
  @scala.inline
  def apply(InstallationMediaId: String): DeleteInstallationMediaMessage = {
    val __obj = js.Dynamic.literal(InstallationMediaId = InstallationMediaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstallationMediaMessage]
  }
  
  @scala.inline
  implicit class DeleteInstallationMediaMessageMutableBuilder[Self <: DeleteInstallationMediaMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallationMediaId(value: String): Self = StObject.set(x, "InstallationMediaId", value.asInstanceOf[js.Any])
  }
}
