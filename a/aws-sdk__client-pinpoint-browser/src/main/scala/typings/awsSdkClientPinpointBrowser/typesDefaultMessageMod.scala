package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDefaultMessageMod {
  
  trait DefaultMessage extends StObject {
    
    /**
      * The message body of the notification, the email body or the text message.
      */
    var Body: js.UndefOr[String] = js.undefined
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[
        (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
      ] = js.undefined
  }
  object DefaultMessage {
    
    inline def apply(): DefaultMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultMessage] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      inline def setSubstitutions(
        value: (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
      ): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
  
  trait UnmarshalledDefaultMessage
    extends StObject
       with DefaultMessage {
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    @JSName("Substitutions")
    var Substitutions_UnmarshalledDefaultMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  }
  object UnmarshalledDefaultMessage {
    
    inline def apply(): UnmarshalledDefaultMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledDefaultMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledDefaultMessage] (val x: Self) extends AnyVal {
      
      inline def setSubstitutions(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
}
