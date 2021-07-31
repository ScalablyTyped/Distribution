package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateEncryptionKeyMessage extends StObject {
  
  /**
    * The unique identifier of the cluster that you want to rotate the encryption keys for. Constraints: Must be the name of valid cluster that has encryption enabled.
    */
  var ClusterIdentifier: String
}
object RotateEncryptionKeyMessage {
  
  @scala.inline
  def apply(ClusterIdentifier: String): RotateEncryptionKeyMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateEncryptionKeyMessage]
  }
  
  @scala.inline
  implicit class RotateEncryptionKeyMessageMutableBuilder[Self <: RotateEncryptionKeyMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
