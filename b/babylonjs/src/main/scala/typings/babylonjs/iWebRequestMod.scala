package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iWebRequestMod {
  
  @js.native
  trait IWebRequest extends StObject {
    
    /**
      * Returns client's response url
      */
    var responseURL: String = js.native
    
    /**
      * Returns client's status
      */
    var status: Double = js.native
    
    /**
      * Returns client's status as a text
      */
    var statusText: String = js.native
  }
  object IWebRequest {
    
    @scala.inline
    def apply(responseURL: String, status: Double, statusText: String): IWebRequest = {
      val __obj = js.Dynamic.literal(responseURL = responseURL.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebRequest]
    }
    
    @scala.inline
    implicit class IWebRequestMutableBuilder[Self <: IWebRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponseURL(value: String): Self = StObject.set(x, "responseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
}
