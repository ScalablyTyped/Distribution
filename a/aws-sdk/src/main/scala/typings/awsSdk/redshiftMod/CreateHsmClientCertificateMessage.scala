package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHsmClientCertificateMessage extends StObject {
  
  /**
    * The identifier to be assigned to the new HSM client certificate that the cluster will use to connect to the HSM to use the database encryption keys.
    */
  var HsmClientCertificateIdentifier: String = js.native
  
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateHsmClientCertificateMessage {
  
  @scala.inline
  def apply(HsmClientCertificateIdentifier: String): CreateHsmClientCertificateMessage = {
    val __obj = js.Dynamic.literal(HsmClientCertificateIdentifier = HsmClientCertificateIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmClientCertificateMessage]
  }
  
  @scala.inline
  implicit class CreateHsmClientCertificateMessageMutableBuilder[Self <: CreateHsmClientCertificateMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsmClientCertificateIdentifier(value: String): Self = StObject.set(x, "HsmClientCertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
