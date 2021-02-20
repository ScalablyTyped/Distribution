package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAMLIdp extends StObject {
  
  /**
    * The unique Entity ID of the application in SAML Identity Provider.
    */
  var EntityId: SAMLEntityId = js.native
  
  /**
    * The Metadata of the SAML application in xml format.
    */
  var MetadataContent: SAMLMetadata = js.native
}
object SAMLIdp {
  
  @scala.inline
  def apply(EntityId: SAMLEntityId, MetadataContent: SAMLMetadata): SAMLIdp = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], MetadataContent = MetadataContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAMLIdp]
  }
  
  @scala.inline
  implicit class SAMLIdpMutableBuilder[Self <: SAMLIdp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityId(value: SAMLEntityId): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataContent(value: SAMLMetadata): Self = StObject.set(x, "MetadataContent", value.asInstanceOf[js.Any])
  }
}
