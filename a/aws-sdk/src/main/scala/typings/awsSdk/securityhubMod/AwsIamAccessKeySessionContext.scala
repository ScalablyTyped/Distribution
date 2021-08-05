package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamAccessKeySessionContext extends StObject {
  
  /**
    * Attributes of the session that the key was used for.
    */
  var Attributes: js.UndefOr[AwsIamAccessKeySessionContextAttributes] = js.undefined
  
  /**
    * Information about the entity that created the session.
    */
  var SessionIssuer: js.UndefOr[AwsIamAccessKeySessionContextSessionIssuer] = js.undefined
}
object AwsIamAccessKeySessionContext {
  
  inline def apply(): AwsIamAccessKeySessionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamAccessKeySessionContext]
  }
  
  extension [Self <: AwsIamAccessKeySessionContext](x: Self) {
    
    inline def setAttributes(value: AwsIamAccessKeySessionContextAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setSessionIssuer(value: AwsIamAccessKeySessionContextSessionIssuer): Self = StObject.set(x, "SessionIssuer", value.asInstanceOf[js.Any])
    
    inline def setSessionIssuerUndefined: Self = StObject.set(x, "SessionIssuer", js.undefined)
  }
}
