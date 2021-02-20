package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateApplicationRequestMod {
  
  @js.native
  trait CreateApplicationRequest extends StObject {
    
    /**
      * The display name of the application. Used in the Amazon Pinpoint console.
      */
    var Name: js.UndefOr[String] = js.native
  }
  object CreateApplicationRequest {
    
    @scala.inline
    def apply(): CreateApplicationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateApplicationRequest]
    }
    
    @scala.inline
    implicit class CreateApplicationRequestMutableBuilder[Self <: CreateApplicationRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    }
  }
  
  type UnmarshalledCreateApplicationRequest = CreateApplicationRequest
}
