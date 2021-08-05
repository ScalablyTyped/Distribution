package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceIdentity extends StObject {
  
  /**
    * A description of an EC2 instance that is generated when the instance is launched and exposed to the instance via the instance metadata service in the form of a JSON representation of an object.
    */
  var document: js.UndefOr[String] = js.undefined
  
  /**
    * A signature which can be used to verify the accuracy and authenticity of the information provided in the instance identity document.
    */
  var signature: js.UndefOr[String] = js.undefined
}
object InstanceIdentity {
  
  inline def apply(): InstanceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIdentity]
  }
  
  extension [Self <: InstanceIdentity](x: Self) {
    
    inline def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
