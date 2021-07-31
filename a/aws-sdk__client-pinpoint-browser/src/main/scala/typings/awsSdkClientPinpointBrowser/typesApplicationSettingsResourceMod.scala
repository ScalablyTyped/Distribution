package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.CampaignLimits
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime
import typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.UnmarshalledQuietTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesApplicationSettingsResourceMod {
  
  trait ApplicationSettingsResource extends StObject {
    
    /**
      * The unique ID for the application.
      */
    var ApplicationId: js.UndefOr[String] = js.undefined
    
    /**
      * Default campaign hook.
      */
    var CampaignHook: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook] = js.undefined
    
    /**
      * The date that the settings were last updated in ISO 8601 format.
      */
    var LastModifiedDate: js.UndefOr[String] = js.undefined
    
    /**
      * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own.
      */
    var Limits: js.UndefOr[CampaignLimits] = js.undefined
    
    /**
      * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
      */
    var QuietTime: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime] = js.undefined
  }
  object ApplicationSettingsResource {
    
    @scala.inline
    def apply(): ApplicationSettingsResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationSettingsResource]
    }
    
    @scala.inline
    implicit class ApplicationSettingsResourceMutableBuilder[Self <: ApplicationSettingsResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      @scala.inline
      def setCampaignHook(value: CampaignHook): Self = StObject.set(x, "CampaignHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignHookUndefined: Self = StObject.set(x, "CampaignHook", js.undefined)
      
      @scala.inline
      def setLastModifiedDate(value: String): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      @scala.inline
      def setLimits(value: CampaignLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
      
      @scala.inline
      def setQuietTime(value: QuietTime): Self = StObject.set(x, "QuietTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietTimeUndefined: Self = StObject.set(x, "QuietTime", js.undefined)
    }
  }
  
  trait UnmarshalledApplicationSettingsResource
    extends StObject
       with ApplicationSettingsResource {
    
    /**
      * Default campaign hook.
      */
    @JSName("CampaignHook")
    var CampaignHook_UnmarshalledApplicationSettingsResource: js.UndefOr[UnmarshalledCampaignHook] = js.undefined
    
    /**
      * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own.
      */
    @JSName("Limits")
    var Limits_UnmarshalledApplicationSettingsResource: js.UndefOr[UnmarshalledCampaignLimits] = js.undefined
    
    /**
      * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
      */
    @JSName("QuietTime")
    var QuietTime_UnmarshalledApplicationSettingsResource: js.UndefOr[UnmarshalledQuietTime] = js.undefined
  }
  object UnmarshalledApplicationSettingsResource {
    
    @scala.inline
    def apply(): UnmarshalledApplicationSettingsResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledApplicationSettingsResource]
    }
    
    @scala.inline
    implicit class UnmarshalledApplicationSettingsResourceMutableBuilder[Self <: UnmarshalledApplicationSettingsResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCampaignHook(value: UnmarshalledCampaignHook): Self = StObject.set(x, "CampaignHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignHookUndefined: Self = StObject.set(x, "CampaignHook", js.undefined)
      
      @scala.inline
      def setLimits(value: UnmarshalledCampaignLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
      
      @scala.inline
      def setQuietTime(value: UnmarshalledQuietTime): Self = StObject.set(x, "QuietTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietTimeUndefined: Self = StObject.set(x, "QuietTime", js.undefined)
    }
  }
}
