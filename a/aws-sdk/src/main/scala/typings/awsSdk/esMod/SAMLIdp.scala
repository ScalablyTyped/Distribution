package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAMLIdp extends js.Object {
  
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
  implicit class SAMLIdpOps[Self <: SAMLIdp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntityId(value: SAMLEntityId): Self = this.set("EntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataContent(value: SAMLMetadata): Self = this.set("MetadataContent", value.asInstanceOf[js.Any])
  }
}
