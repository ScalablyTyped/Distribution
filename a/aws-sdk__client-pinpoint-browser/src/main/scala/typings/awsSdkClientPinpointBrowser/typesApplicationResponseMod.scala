package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesApplicationResponseMod {
  
  trait ApplicationResponse extends StObject {
    
    /**
      * The unique application ID.
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * The display name of the application.
      */
    var Name: js.UndefOr[String] = js.undefined
  }
  object ApplicationResponse {
    
    inline def apply(): ApplicationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplicationResponse] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    }
  }
  
  type UnmarshalledApplicationResponse = ApplicationResponse
}
