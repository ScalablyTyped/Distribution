package typings.azureSb

import typings.azureSb.anon.Headers
import typings.azureSb.mod.Azure.ServiceBus.ListNotificationHubsOptions
import typings.azureSb.mod.Azure.ServiceBus.ResponseCallback
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apnsserviceMod {
  
  @JSImport("azure-sb/lib/apnsservice", JSImport.Namespace)
  @js.native
  class ^ protected () extends ApnsService {
    def this(notificationHubService: typings.azureSb.notificationhubserviceMod.^) = this()
  }
  
  @js.native
  trait ApnsService extends StObject {
    
    def createNativeRegistration(token: String, tags: String, callback: ResponseCallback): Unit = js.native
    def createNativeRegistration(token: String, tags: String, options: js.Object, callback: ResponseCallback): Unit = js.native
    def createNativeRegistration(token: String, tags: js.Array[String], callback: ResponseCallback): Unit = js.native
    def createNativeRegistration(token: String, tags: js.Array[String], options: js.Object, callback: ResponseCallback): Unit = js.native
    
    def createOrUpdateNativeRegistration(registrationId: String, token: String, tags: String, callback: ResponseCallback): Unit = js.native
    def createOrUpdateNativeRegistration(
      registrationId: String,
      token: String,
      tags: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createOrUpdateNativeRegistration(registrationId: String, token: String, tags: js.Array[String], callback: ResponseCallback): Unit = js.native
    def createOrUpdateNativeRegistration(
      registrationId: String,
      token: String,
      tags: js.Array[String],
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    
    def createTemplateRegistration(token: String, tags: String, template: String, callback: ResponseCallback): Unit = js.native
    def createTemplateRegistration(token: String, tags: String, template: String, options: js.Object, callback: ResponseCallback): Unit = js.native
    def createTemplateRegistration(token: String, tags: String, template: Template, callback: ResponseCallback): Unit = js.native
    def createTemplateRegistration(token: String, tags: String, template: Template, options: js.Object, callback: ResponseCallback): Unit = js.native
    def createTemplateRegistration(token: String, tags: js.Array[String], template: String, callback: ResponseCallback): Unit = js.native
    def createTemplateRegistration(
      token: String,
      tags: js.Array[String],
      template: String,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    def createTemplateRegistration(token: String, tags: js.Array[String], template: Template, callback: ResponseCallback): Unit = js.native
    def createTemplateRegistration(
      token: String,
      tags: js.Array[String],
      template: Template,
      options: js.Object,
      callback: ResponseCallback
    ): Unit = js.native
    
    def listRegistrationsByToken(token: String, callback: ResponseCallback): Unit = js.native
    def listRegistrationsByToken(token: String, options: ListNotificationHubsOptions, callback: ResponseCallback): Unit = js.native
    
    var notificationHubService: typings.azureSb.notificationhubserviceMod.^ = js.native
    
    def send(tags: String, payload: String, callback: ResponseCallback): Unit = js.native
    def send(tags: String, payload: String, options: Headers, callback: ResponseCallback): Unit = js.native
    def send(tags: String, payload: js.Object, callback: ResponseCallback): Unit = js.native
    def send(tags: String, payload: js.Object, options: Headers, callback: ResponseCallback): Unit = js.native
    def send(tags: js.Array[String], payload: String, callback: ResponseCallback): Unit = js.native
    def send(tags: js.Array[String], payload: String, options: Headers, callback: ResponseCallback): Unit = js.native
    def send(tags: js.Array[String], payload: js.Object, callback: ResponseCallback): Unit = js.native
    def send(tags: js.Array[String], payload: js.Object, options: Headers, callback: ResponseCallback): Unit = js.native
    
    def updateTemplateRegistration(registrationId: String, token: String, tags: String, template: String, callback: ResponseCallback): Unit = js.native
    def updateTemplateRegistration(
      registrationId: String,
      token: String,
      tags: String,
      template: String,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
    def updateTemplateRegistration(
      registrationId: String,
      token: String,
      tags: String,
      template: Template,
      callback: ResponseCallback
    ): Unit = js.native
    def updateTemplateRegistration(
      registrationId: String,
      token: String,
      tags: String,
      template: Template,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
    def updateTemplateRegistration(
      registrationId: String,
      token: String,
      tags: js.Array[String],
      template: String,
      callback: ResponseCallback
    ): Unit = js.native
    def updateTemplateRegistration(
      registrationId: String,
      token: String,
      tags: js.Array[String],
      template: String,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
    def updateTemplateRegistration(
      registrationId: String,
      token: String,
      tags: js.Array[String],
      template: Template,
      callback: ResponseCallback
    ): Unit = js.native
    def updateTemplateRegistration(
      registrationId: String,
      token: String,
      tags: js.Array[String],
      template: Template,
      options: Headers,
      callback: ResponseCallback
    ): Unit = js.native
  }
  
  /* Inlined std.Partial<{  expiry :std.Date,   aps :object,   badge :number,   alert :string,   sound :string,   payload :object}> */
  @js.native
  trait Template extends StObject {
    
    var alert: js.UndefOr[String] = js.native
    
    var aps: js.UndefOr[js.Object] = js.native
    
    var badge: js.UndefOr[Double] = js.native
    
    var expiry: js.UndefOr[Date] = js.native
    
    var payload: js.UndefOr[js.Object] = js.native
    
    var sound: js.UndefOr[String] = js.native
  }
  object Template {
    
    @scala.inline
    def apply(): Template = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Template]
    }
    
    @scala.inline
    implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlert(value: String): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      @scala.inline
      def setAps(value: js.Object): Self = StObject.set(x, "aps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApsUndefined: Self = StObject.set(x, "aps", js.undefined)
      
      @scala.inline
      def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setExpiry(value: Date): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
      
      @scala.inline
      def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    }
  }
}
