package typings.azureSb.mpnserviceMod

import typings.azureSb.anon.Headers
import typings.azureSb.mod.Azure.ServiceBus.ListNotificationHubsOptions
import typings.azureSb.mod.Azure.ServiceBus.ResponseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MpnsService extends js.Object {
  
  def createNativeRegistration(channel: String, tags: String, callback: ResponseCallback): Unit = js.native
  def createNativeRegistration(channel: String, tags: String, options: js.Object, callback: ResponseCallback): Unit = js.native
  def createNativeRegistration(channel: String, tags: js.Array[String], callback: ResponseCallback): Unit = js.native
  def createNativeRegistration(channel: String, tags: js.Array[String], options: js.Object, callback: ResponseCallback): Unit = js.native
  
  def createOrUpdateNativeRegistration(registrationId: String, channel: String, tags: String, callback: ResponseCallback): Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: String,
    channel: String,
    tags: String,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def createOrUpdateNativeRegistration(registrationId: String, channel: String, tags: js.Array[String], callback: ResponseCallback): Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: String,
    channel: String,
    tags: js.Array[String],
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  
  def createOrUpdateRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: String,
    template: String,
    callback: ResponseCallback
  ): Unit = js.native
  def createOrUpdateRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: String,
    template: String,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def createOrUpdateRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: String,
    template: Template,
    callback: ResponseCallback
  ): Unit = js.native
  def createOrUpdateRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: String,
    template: Template,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def createOrUpdateRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: js.Array[String],
    template: String,
    callback: ResponseCallback
  ): Unit = js.native
  def createOrUpdateRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: js.Array[String],
    template: String,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def createOrUpdateRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: js.Array[String],
    template: Template,
    callback: ResponseCallback
  ): Unit = js.native
  def createOrUpdateRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: js.Array[String],
    template: Template,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  
  def createRawTemplateRegistration(channel: String, tags: String, template: String, callback: ResponseCallback): Unit = js.native
  def createRawTemplateRegistration(channel: String, tags: String, template: String, options: js.Object, callback: ResponseCallback): Unit = js.native
  def createRawTemplateRegistration(channel: String, tags: String, template: Template, callback: ResponseCallback): Unit = js.native
  def createRawTemplateRegistration(channel: String, tags: String, template: Template, options: js.Object, callback: ResponseCallback): Unit = js.native
  def createRawTemplateRegistration(channel: String, tags: js.Array[String], template: String, callback: ResponseCallback): Unit = js.native
  def createRawTemplateRegistration(
    channel: String,
    tags: js.Array[String],
    template: String,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def createRawTemplateRegistration(channel: String, tags: js.Array[String], template: Template, callback: ResponseCallback): Unit = js.native
  def createRawTemplateRegistration(
    channel: String,
    tags: js.Array[String],
    template: Template,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  
  def listRegistrationsByChannel(channel: String, callback: ResponseCallback): Unit = js.native
  def listRegistrationsByChannel(channel: String, options: ListNotificationHubsOptions, callback: ResponseCallback): Unit = js.native
  
  var notificationHubService: typings.azureSb.notificationhubserviceMod.^ = js.native
  
  def send(
    tags: String,
    payload: String,
    targetName: String,
    notificationClass: String,
    callback: ResponseCallback
  ): Unit = js.native
  def send(
    tags: String,
    payload: String,
    targetName: String,
    notificationClass: String,
    options: Headers,
    callback: ResponseCallback
  ): Unit = js.native
  def send(
    tags: String,
    payload: js.Object,
    targetName: String,
    notificationClass: String,
    callback: ResponseCallback
  ): Unit = js.native
  def send(
    tags: String,
    payload: js.Object,
    targetName: String,
    notificationClass: String,
    options: Headers,
    callback: ResponseCallback
  ): Unit = js.native
  def send(
    tags: js.Array[String],
    payload: String,
    targetName: String,
    notificationClass: String,
    callback: ResponseCallback
  ): Unit = js.native
  def send(
    tags: js.Array[String],
    payload: String,
    targetName: String,
    notificationClass: String,
    options: Headers,
    callback: ResponseCallback
  ): Unit = js.native
  def send(
    tags: js.Array[String],
    payload: js.Object,
    targetName: String,
    notificationClass: String,
    callback: ResponseCallback
  ): Unit = js.native
  def send(
    tags: js.Array[String],
    payload: js.Object,
    targetName: String,
    notificationClass: String,
    options: Headers,
    callback: ResponseCallback
  ): Unit = js.native
  
  def updatesRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: String,
    template: String,
    callback: ResponseCallback
  ): Unit = js.native
  def updatesRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: String,
    template: String,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def updatesRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: String,
    template: Template,
    callback: ResponseCallback
  ): Unit = js.native
  def updatesRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: String,
    template: Template,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def updatesRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: js.Array[String],
    template: String,
    callback: ResponseCallback
  ): Unit = js.native
  def updatesRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: js.Array[String],
    template: String,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def updatesRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: js.Array[String],
    template: Template,
    callback: ResponseCallback
  ): Unit = js.native
  def updatesRawTemplateRegistration(
    registrationId: String,
    channel: String,
    tags: js.Array[String],
    template: Template,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
}
