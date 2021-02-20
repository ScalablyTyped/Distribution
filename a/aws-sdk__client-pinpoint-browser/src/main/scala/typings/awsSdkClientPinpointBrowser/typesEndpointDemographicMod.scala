package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEndpointDemographicMod {
  
  @js.native
  trait EndpointDemographic extends StObject {
    
    /**
      * The version of the application associated with the endpoint.
      */
    var AppVersion: js.UndefOr[String] = js.native
    
    /**
      * The endpoint locale in the following format: The ISO 639-1 alpha-2 code, followed by an underscore, followed by an ISO 3166-1 alpha-2 value.
      *
      */
    var Locale: js.UndefOr[String] = js.native
    
    /**
      * The manufacturer of the endpoint device, such as Apple or Samsung.
      */
    var Make: js.UndefOr[String] = js.native
    
    /**
      * The model name or number of the endpoint device, such as iPhone.
      */
    var Model: js.UndefOr[String] = js.native
    
    /**
      * The model version of the endpoint device.
      */
    var ModelVersion: js.UndefOr[String] = js.native
    
    /**
      * The platform of the endpoint device, such as iOS or Android.
      */
    var Platform: js.UndefOr[String] = js.native
    
    /**
      * The platform version of the endpoint device.
      */
    var PlatformVersion: js.UndefOr[String] = js.native
    
    /**
      * The timezone of the endpoint. Specified as a tz database value, such as Americas/Los_Angeles.
      */
    var Timezone: js.UndefOr[String] = js.native
  }
  object EndpointDemographic {
    
    @scala.inline
    def apply(): EndpointDemographic = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointDemographic]
    }
    
    @scala.inline
    implicit class EndpointDemographicMutableBuilder[Self <: EndpointDemographic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppVersion(value: String): Self = StObject.set(x, "AppVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppVersionUndefined: Self = StObject.set(x, "AppVersion", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
      
      @scala.inline
      def setMake(value: String): Self = StObject.set(x, "Make", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMakeUndefined: Self = StObject.set(x, "Make", js.undefined)
      
      @scala.inline
      def setModel(value: String): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
      
      @scala.inline
      def setModelVersion(value: String): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
      
      @scala.inline
      def setPlatformVersion(value: String): Self = StObject.set(x, "PlatformVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformVersionUndefined: Self = StObject.set(x, "PlatformVersion", js.undefined)
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    }
  }
  
  type UnmarshalledEndpointDemographic = EndpointDemographic
}
