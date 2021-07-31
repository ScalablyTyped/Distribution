package typings.awsSdkClientPinpointBrowser

import typings.std.Iterable
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
    
    @scala.inline
    def apply(): UnmarshalledUpdateAttributesRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledUpdateAttributesRequest]
    }
    
    @scala.inline
    implicit class UnmarshalledUpdateAttributesRequestMutableBuilder[Self <: UnmarshalledUpdateAttributesRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "Blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "Blacklist", js.undefined)
      
      @scala.inline
      def setBlacklistVarargs(value: String*): Self = StObject.set(x, "Blacklist", js.Array(value :_*))
    }
  }
  
  trait UpdateAttributesRequest extends StObject {
    
    /**
      * The GLOB wildcard for removing the attributes in the application
      */
    var Blacklist: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  }
  object UpdateAttributesRequest {
    
    @scala.inline
    def apply(): UpdateAttributesRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAttributesRequest]
    }
    
    @scala.inline
    implicit class UpdateAttributesRequestMutableBuilder[Self <: UpdateAttributesRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "Blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "Blacklist", js.undefined)
      
      @scala.inline
      def setBlacklistVarargs(value: String*): Self = StObject.set(x, "Blacklist", js.Array(value :_*))
    }
  }
}
