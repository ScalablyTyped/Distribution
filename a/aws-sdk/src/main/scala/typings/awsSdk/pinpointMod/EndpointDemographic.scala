package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointDemographic extends StObject {
  
  /**
    * The version of the app that's associated with the endpoint.
    */
  var AppVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The locale of the endpoint, in the following format: the ISO 639-1 alpha-2 code, followed by an underscore (_), followed by an ISO 3166-1 alpha-2 value.
    */
  var Locale: js.UndefOr[string] = js.undefined
  
  /**
    * The manufacturer of the endpoint device, such as apple or samsung.
    */
  var Make: js.UndefOr[string] = js.undefined
  
  /**
    * The model name or number of the endpoint device, such as iPhone or SM-G900F.
    */
  var Model: js.UndefOr[string] = js.undefined
  
  /**
    * The model version of the endpoint device.
    */
  var ModelVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The platform of the endpoint device, such as ios.
    */
  var Platform: js.UndefOr[string] = js.undefined
  
  /**
    * The platform version of the endpoint device.
    */
  var PlatformVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The time zone of the endpoint, specified as a tz database name value, such as America/Los_Angeles.
    */
  var Timezone: js.UndefOr[string] = js.undefined
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
    def setAppVersion(value: string): Self = StObject.set(x, "AppVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersionUndefined: Self = StObject.set(x, "AppVersion", js.undefined)
    
    @scala.inline
    def setLocale(value: string): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    @scala.inline
    def setMake(value: string): Self = StObject.set(x, "Make", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeUndefined: Self = StObject.set(x, "Make", js.undefined)
    
    @scala.inline
    def setModel(value: string): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
    
    @scala.inline
    def setModelVersion(value: string): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
    
    @scala.inline
    def setPlatform(value: string): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: string): Self = StObject.set(x, "PlatformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersionUndefined: Self = StObject.set(x, "PlatformVersion", js.undefined)
    
    @scala.inline
    def setTimezone(value: string): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
  }
}
