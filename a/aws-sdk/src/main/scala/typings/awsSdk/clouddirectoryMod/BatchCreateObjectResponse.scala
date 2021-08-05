package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateObjectResponse extends StObject {
  
  /**
    * The ID that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.undefined
}
object BatchCreateObjectResponse {
  
  inline def apply(): BatchCreateObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateObjectResponse]
  }
  
  extension [Self <: BatchCreateObjectResponse](x: Self) {
    
    inline def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
  }
}
