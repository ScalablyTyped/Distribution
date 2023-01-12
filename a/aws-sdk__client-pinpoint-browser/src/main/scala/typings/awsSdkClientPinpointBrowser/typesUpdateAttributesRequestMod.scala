package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateAttributesRequestMod {
  
  trait UnmarshalledUpdateAttributesRequest
    extends StObject
       with UpdateAttributesRequest {
    
    /**
      * The GLOB wildcard for removing the attributes in the application
      */
    @JSName("Blacklist")
    var Blacklist_UnmarshalledUpdateAttributesRequest: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnmarshalledUpdateAttributesRequest {
    
    inline def apply(): UnmarshalledUpdateAttributesRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledUpdateAttributesRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledUpdateAttributesRequest] (val x: Self) extends AnyVal {
      
      inline def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "Blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "Blacklist", js.undefined)
      
      inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "Blacklist", js.Array(value*))
    }
  }
  
  trait UpdateAttributesRequest extends StObject {
    
    /**
      * The GLOB wildcard for removing the attributes in the application
      */
    var Blacklist: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
  }
  object UpdateAttributesRequest {
    
    inline def apply(): UpdateAttributesRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAttributesRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateAttributesRequest] (val x: Self) extends AnyVal {
      
      inline def setBlacklist(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "Blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "Blacklist", js.undefined)
      
      inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "Blacklist", js.Array(value*))
    }
  }
}
