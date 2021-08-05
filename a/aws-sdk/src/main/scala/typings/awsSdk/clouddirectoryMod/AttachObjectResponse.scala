package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachObjectResponse extends StObject {
  
  /**
    * The attached ObjectIdentifier, which is the child ObjectIdentifier.
    */
  var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}
object AttachObjectResponse {
  
  inline def apply(): AttachObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachObjectResponse]
  }
  
  extension [Self <: AttachObjectResponse](x: Self) {
    
    inline def setAttachedObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "AttachedObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAttachedObjectIdentifierUndefined: Self = StObject.set(x, "AttachedObjectIdentifier", js.undefined)
  }
}
