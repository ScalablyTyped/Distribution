package typings
package azureDashSbLib.libApnsserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApnsService extends js.Object {
  var notificationHubService: azureDashSbLib.libNotificationhubserviceMod.^ = js.native
  def createNativeRegistration(
    token: java.lang.String,
    tags: java.lang.String,
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
    token: java.lang.String,
    tags: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: java.lang.String,
    token: java.lang.String,
    tags: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: java.lang.String,
    token: java.lang.String,
    tags: js.Array[java.lang.String],
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: java.lang.String,
    token: java.lang.String,
    tags: js.Array[java.lang.String],
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    token: java.lang.String,
    tags: java.lang.String,
    template: Template,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    token: java.lang.String,
    tags: java.lang.String,
    template: Template,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    token: java.lang.String,
    tags: java.lang.String,
    template: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    token: java.lang.String,
    tags: java.lang.String,
    template: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    token: java.lang.String,
    tags: js.Array[java.lang.String],
    template: Template,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    token: java.lang.String,
    tags: js.Array[java.lang.String],
    template: Template,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    token: java.lang.String,
    tags: js.Array[java.lang.String],
    template: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def createTemplateRegistration(
    token: java.lang.String,
    tags: js.Array[java.lang.String],
    template: java.lang.String,
    options: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def listRegistrationsByToken(
    token: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def listRegistrationsByToken(
    token: java.lang.String,
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
    payload: java.lang.String,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: js.Object,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: js.Array[java.lang.String],
    payload: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: js.Array[java.lang.String],
    payload: java.lang.String,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: js.Array[java.lang.String],
    payload: js.Object,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def send(
    tags: js.Array[java.lang.String],
    payload: js.Object,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    token: java.lang.String,
    tags: java.lang.String,
    template: Template,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    token: java.lang.String,
    tags: java.lang.String,
    template: Template,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    token: java.lang.String,
    tags: java.lang.String,
    template: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    token: java.lang.String,
    tags: java.lang.String,
    template: java.lang.String,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    token: java.lang.String,
    tags: js.Array[java.lang.String],
    template: Template,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    token: java.lang.String,
    tags: js.Array[java.lang.String],
    template: Template,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    token: java.lang.String,
    tags: js.Array[java.lang.String],
    template: java.lang.String,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
  def updateTemplateRegistration(
    registrationId: java.lang.String,
    token: java.lang.String,
    tags: js.Array[java.lang.String],
    template: java.lang.String,
    options: azureDashSbLib.Anon_Headers,
    callback: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ResponseCallback
  ): scala.Unit = js.native
}

