package typings
package azureDashSbLib.libMpnserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MpnsService extends js.Object {
  var notificationHubService: azureDashSbLib.libNotificationhubserviceMod.namespaced = js.native
  def createNativeRegistration(
    channel: java.lang.String,
    tags: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createNativeRegistration(
    channel: java.lang.String,
    tags: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createNativeRegistration(
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createNativeRegistration(
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: java.lang.String,
    template: Template,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: java.lang.String,
    template: Template,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: java.lang.String,
    template: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: java.lang.String,
    template: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    template: Template,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    template: Template,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    template: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    template: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createRawTemplateRegistration(
    channel: java.lang.String,
    tags: java.lang.String,
    template: Template,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createRawTemplateRegistration(
    channel: java.lang.String,
    tags: java.lang.String,
    template: Template,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createRawTemplateRegistration(
    channel: java.lang.String,
    tags: java.lang.String,
    template: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createRawTemplateRegistration(
    channel: java.lang.String,
    tags: java.lang.String,
    template: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createRawTemplateRegistration(
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    template: Template,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createRawTemplateRegistration(
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    template: Template,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createRawTemplateRegistration(
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    template: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createRawTemplateRegistration(
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    template: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def listRegistrationsByChannel(
    channel: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def listRegistrationsByChannel(
    channel: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ListNotificationHubsOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: java.lang.String,
    targetName: java.lang.String,
    notificationClass: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: java.lang.String,
    targetName: java.lang.String,
    notificationClass: java.lang.String,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: js.Object,
    targetName: java.lang.String,
    notificationClass: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: js.Object,
    targetName: java.lang.String,
    notificationClass: java.lang.String,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: js.Array[java.lang.String],
    payload: java.lang.String,
    targetName: java.lang.String,
    notificationClass: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: js.Array[java.lang.String],
    payload: java.lang.String,
    targetName: java.lang.String,
    notificationClass: java.lang.String,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: js.Array[java.lang.String],
    payload: js.Object,
    targetName: java.lang.String,
    notificationClass: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: js.Array[java.lang.String],
    payload: js.Object,
    targetName: java.lang.String,
    notificationClass: java.lang.String,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updatesRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: java.lang.String,
    template: Template,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updatesRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: java.lang.String,
    template: Template,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updatesRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: java.lang.String,
    template: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updatesRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: java.lang.String,
    template: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updatesRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    template: Template,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updatesRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    template: Template,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updatesRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    template: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updatesRawTemplateRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    template: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
}

