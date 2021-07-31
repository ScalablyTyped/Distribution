package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
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
        (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ] = js.undefined
  }
  object DefaultMessage {
    
    @scala.inline
    def apply(): DefaultMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultMessage]
    }
    
    @scala.inline
    implicit class DefaultMessageMutableBuilder[Self <: DefaultMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      @scala.inline
      def setSubstitutions(
        value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
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
    
    @scala.inline
    def apply(): UnmarshalledDefaultMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledDefaultMessage]
    }
    
    @scala.inline
    implicit class UnmarshalledDefaultMessageMutableBuilder[Self <: UnmarshalledDefaultMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubstitutions(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
}
