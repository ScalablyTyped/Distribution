package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceIdentity extends StObject {
  
  /**
    * A JSON document that contains the metadata.
    */
  var Document: js.UndefOr[String] = js.undefined
  
  /**
    * A signature that can be used to verify the document's accuracy and authenticity.
    */
  var Signature: js.UndefOr[String] = js.undefined
}
object InstanceIdentity {
  
  @scala.inline
  def apply(): InstanceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIdentity]
  }
  
  @scala.inline
  implicit class InstanceIdentityMutableBuilder[Self <: InstanceIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: String): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "Document", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "Signature", js.undefined)
  }
}
