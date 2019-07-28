package typings.azureDashSb.libApnsserviceMod

import typings.azureDashSb.Anon_Headers
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ListNotificationHubsOptions
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApnsService extends js.Object {
  var notificationHubService: typings.azureDashSb.libNotificationhubserviceMod.^ = js.native
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
  def send(tags: String, payload: String, callback: ResponseCallback): Unit = js.native
  def send(tags: String, payload: String, options: Anon_Headers, callback: ResponseCallback): Unit = js.native
  def send(tags: String, payload: js.Object, callback: ResponseCallback): Unit = js.native
  def send(tags: String, payload: js.Object, options: Anon_Headers, callback: ResponseCallback): Unit = js.native
  def send(tags: js.Array[String], payload: String, callback: ResponseCallback): Unit = js.native
  def send(tags: js.Array[String], payload: String, options: Anon_Headers, callback: ResponseCallback): Unit = js.native
  def send(tags: js.Array[String], payload: js.Object, callback: ResponseCallback): Unit = js.native
  def send(tags: js.Array[String], payload: js.Object, options: Anon_Headers, callback: ResponseCallback): Unit = js.native
  def updateTemplateRegistration(registrationId: String, token: String, tags: String, template: String, callback: ResponseCallback): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    token: String,
    tags: String,
    template: String,
    options: Anon_Headers,
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
    options: Anon_Headers,
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
    options: Anon_Headers,
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
    options: Anon_Headers,
    callback: ResponseCallback
  ): Unit = js.native
}

