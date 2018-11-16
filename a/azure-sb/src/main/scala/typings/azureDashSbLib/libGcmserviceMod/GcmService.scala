package typings
package azureDashSbLib.libGcmserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GcmService extends js.Object {
  var notificationHubService: azureDashSbLib.libNotificationhubserviceMod.namespaced = js.native
  def createNativeRegistration(
    gcmRegistrationId: java.lang.String,
    tags: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createNativeRegistration(
    gcmRegistrationId: java.lang.String,
    tags: js.Array[java.lang.String],
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createNativeRegistration(
    token: java.lang.String,
    tags: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createNativeRegistration(
    token: java.lang.String,
    tags: js.Array[java.lang.String],
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: java.lang.String,
    gcmRegistrationId: java.lang.String,
    tags: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: java.lang.String,
    gcmRegistrationId: java.lang.String,
    tags: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: java.lang.String,
    gcmRegistrationId: java.lang.String,
    tags: js.Array[java.lang.String],
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: java.lang.String,
    gcmRegistrationId: java.lang.String,
    tags: js.Array[java.lang.String],
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    gcmRegistrationId: java.lang.String,
    tags: java.lang.String,
    template: Template,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    gcmRegistrationId: java.lang.String,
    tags: java.lang.String,
    template: Template,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    gcmRegistrationId: java.lang.String,
    tags: java.lang.String,
    template: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    gcmRegistrationId: java.lang.String,
    tags: java.lang.String,
    template: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    gcmRegistrationId: java.lang.String,
    tags: js.Array[java.lang.String],
    template: Template,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    gcmRegistrationId: java.lang.String,
    tags: js.Array[java.lang.String],
    template: Template,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    gcmRegistrationId: java.lang.String,
    tags: js.Array[java.lang.String],
    template: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    gcmRegistrationId: java.lang.String,
    tags: js.Array[java.lang.String],
    template: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def listRegistrationsByGcmRegistrationId(
    gcmRegistrationId: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def listRegistrationsByGcmRegistrationId(
    gcmRegistrationId: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ListNotificationHubsOptions,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: js.Array[java.lang.String],
    payload: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: js.Array[java.lang.String],
    payload: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    gcmRegistrationId: java.lang.String,
    tags: java.lang.String,
    template: Template,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    gcmRegistrationId: java.lang.String,
    tags: java.lang.String,
    template: Template,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    gcmRegistrationId: java.lang.String,
    tags: java.lang.String,
    template: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    gcmRegistrationId: java.lang.String,
    tags: java.lang.String,
    template: java.lang.String,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    gcmRegistrationId: java.lang.String,
    tags: js.Array[java.lang.String],
    template: Template,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    gcmRegistrationId: java.lang.String,
    tags: js.Array[java.lang.String],
    template: Template,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    gcmRegistrationId: java.lang.String,
    tags: js.Array[java.lang.String],
    template: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    gcmRegistrationId: java.lang.String,
    tags: js.Array[java.lang.String],
    template: java.lang.String,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
}

