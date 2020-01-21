package typings.azureSb.apnsserviceMod

import typings.azureSb.AnonHeaders
import typings.azureSb.mod.Azure.ServiceBus.ListNotificationHubsOptions
import typings.azureSb.mod.Azure.ServiceBus.ResponseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApnsService extends js.Object {
  var notificationHubService: typings.azureSb.notificationhubserviceMod.^ = js.native
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
  def send(tags: String, payload: String, options: AnonHeaders, callback: ResponseCallback): Unit = js.native
  def send(tags: String, payload: js.Object, callback: ResponseCallback): Unit = js.native
  def send(tags: String, payload: js.Object, options: AnonHeaders, callback: ResponseCallback): Unit = js.native
  def send(tags: js.Array[String], payload: String, callback: ResponseCallback): Unit = js.native
  def send(tags: js.Array[String], payload: String, options: AnonHeaders, callback: ResponseCallback): Unit = js.native
  def send(tags: js.Array[String], payload: js.Object, callback: ResponseCallback): Unit = js.native
  def send(tags: js.Array[String], payload: js.Object, options: AnonHeaders, callback: ResponseCallback): Unit = js.native
  def updateTemplateRegistration(registrationId: String, token: String, tags: String, template: String, callback: ResponseCallback): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    token: String,
    tags: String,
    template: String,
    options: AnonHeaders,
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
    options: AnonHeaders,
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
    options: AnonHeaders,
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
    options: AnonHeaders,
    callback: ResponseCallback
  ): Unit = js.native
}

