package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEndpointUserMod {
  
  trait EndpointUser extends StObject {
    
    /**
      * Custom attributes that describe the user by associating a name with an array of values. For example, an attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create segments.
      *
      * The Amazon Pinpoint console can't display attribute names that include the following characters: hash/pound sign (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason, you should avoid using these characters in the names of custom attributes.
      */
    var UserAttributes: js.UndefOr[
        (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ] = js.undefined
    
    /**
      * The unique ID of the user.
      */
    var UserId: js.UndefOr[String] = js.undefined
  }
  object EndpointUser {
    
    inline def apply(): EndpointUser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointUser]
    }
    
    extension [Self <: EndpointUser](x: Self) {
      
      inline def setUserAttributes(
        value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ): Self = StObject.set(x, "UserAttributes", value.asInstanceOf[js.Any])
      
      inline def setUserAttributesUndefined: Self = StObject.set(x, "UserAttributes", js.undefined)
      
      inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
    }
  }
  
  trait UnmarshalledEndpointUser
    extends StObject
       with EndpointUser {
    
    /**
      * Custom attributes that describe the user by associating a name with an array of values. For example, an attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create segments.
      *
      * The Amazon Pinpoint console can't display attribute names that include the following characters: hash/pound sign (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason, you should avoid using these characters in the names of custom attributes.
      */
    @JSName("UserAttributes")
    var UserAttributes_UnmarshalledEndpointUser: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  }
  object UnmarshalledEndpointUser {
    
    inline def apply(): UnmarshalledEndpointUser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEndpointUser]
    }
    
    extension [Self <: UnmarshalledEndpointUser](x: Self) {
      
      inline def setUserAttributes(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "UserAttributes", value.asInstanceOf[js.Any])
      
      inline def setUserAttributesUndefined: Self = StObject.set(x, "UserAttributes", js.undefined)
    }
  }
}
