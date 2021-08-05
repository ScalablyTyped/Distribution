package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEndpointSendConfigurationMod {
  
  trait EndpointSendConfiguration extends StObject {
    
    /**
      * Body override. If specified will override default body.
      */
    var BodyOverride: js.UndefOr[String] = js.undefined
    
    /**
      * A map of custom attributes to attributes to be attached to the message for this address. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
      */
    var Context: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
    
    /**
      * The Raw JSON formatted string to be used as the payload. This value overrides the message.
      */
    var RawContent: js.UndefOr[String] = js.undefined
    
    /**
      * A map of substitution values for the message to be merged with the DefaultMessage's substitutions. Substitutions on this map take precedence over the all other substitutions.
      */
    var Substitutions: js.UndefOr[
        (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ] = js.undefined
    
    /**
      * Title override. If specified will override default title if applicable.
      */
    var TitleOverride: js.UndefOr[String] = js.undefined
  }
  object EndpointSendConfiguration {
    
    inline def apply(): EndpointSendConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointSendConfiguration]
    }
    
    extension [Self <: EndpointSendConfiguration](x: Self) {
      
      inline def setBodyOverride(value: String): Self = StObject.set(x, "BodyOverride", value.asInstanceOf[js.Any])
      
      inline def setBodyOverrideUndefined: Self = StObject.set(x, "BodyOverride", js.undefined)
      
      inline def setContext(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
      
      inline def setRawContent(value: String): Self = StObject.set(x, "RawContent", value.asInstanceOf[js.Any])
      
      inline def setRawContentUndefined: Self = StObject.set(x, "RawContent", js.undefined)
      
      inline def setSubstitutions(
        value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
      
      inline def setTitleOverride(value: String): Self = StObject.set(x, "TitleOverride", value.asInstanceOf[js.Any])
      
      inline def setTitleOverrideUndefined: Self = StObject.set(x, "TitleOverride", js.undefined)
    }
  }
  
  trait UnmarshalledEndpointSendConfiguration
    extends StObject
       with EndpointSendConfiguration {
    
    /**
      * A map of custom attributes to attributes to be attached to the message for this address. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
      */
    @JSName("Context")
    var Context_UnmarshalledEndpointSendConfiguration: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * A map of substitution values for the message to be merged with the DefaultMessage's substitutions. Substitutions on this map take precedence over the all other substitutions.
      */
    @JSName("Substitutions")
    var Substitutions_UnmarshalledEndpointSendConfiguration: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  }
  object UnmarshalledEndpointSendConfiguration {
    
    inline def apply(): UnmarshalledEndpointSendConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEndpointSendConfiguration]
    }
    
    extension [Self <: UnmarshalledEndpointSendConfiguration](x: Self) {
      
      inline def setContext(value: StringDictionary[String]): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
      
      inline def setSubstitutions(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
}
