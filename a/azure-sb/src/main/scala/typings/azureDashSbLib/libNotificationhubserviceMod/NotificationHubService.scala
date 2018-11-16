package typings
package azureDashSbLib.libNotificationhubserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationHubService extends js.Object {
  var apns: azureDashSbLib.libApnsserviceMod.namespaced = js.native
  var gcm: azureDashSbLib.libGcmserviceMod.namespaced = js.native
  var hubName: java.lang.String = js.native
  var mpns: azureDashSbLib.libMpnserviceMod.namespaced = js.native
  var wns: azureDashSbLib.libWnsserviceMod.namespaced = js.native
  def createOrUpdateInstallation(installation: java.lang.String, callback: js.Any): scala.Unit = js.native
  def createOrUpdateInstallation(installation: java.lang.String, options: js.Any, callback: js.Any): scala.Unit = js.native
  def createOrUpdateRegistration(
    registration: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.NotificationHubRegistration,
    options: azureDashSbLib.Anon_Etag,
    callback: js.Any
  ): scala.Unit = js.native
  def createRegistrationId(callback: js.Any): scala.Unit = js.native
  def deleteInstallation(installationId: java.lang.String, callback: js.Any): scala.Unit = js.native
  def deleteInstallation(installationId: java.lang.String, options: js.Any, callback: js.Any): scala.Unit = js.native
  def deleteRegistration(registrationId: java.lang.String, callback: js.Any): scala.Unit = js.native
  def deleteRegistration(registrationId: java.lang.String, options: azureDashSbLib.Anon_Etag, callback: js.Any): scala.Unit = js.native
  def getInstallation(installationId: java.lang.String, callback: js.Any): scala.Unit = js.native
  def getInstallation(installationId: java.lang.String, options: js.Any, callback: js.Any): scala.Unit = js.native
  def getRegistration(registrationId: java.lang.String, callback: js.Any): scala.Unit = js.native
  def getRegistration(registrationId: java.lang.String, options: js.Any, callback: js.Any): scala.Unit = js.native
  def listRegistrations(callback: js.Any): scala.Unit = js.native
  def listRegistrations(
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ListNotificationHubsOptions,
    callback: js.Any
  ): scala.Unit = js.native
  def listRegistrationsByTag(tag: java.lang.String, callback: js.Any): scala.Unit = js.native
  def listRegistrationsByTag(
    tag: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ListNotificationHubsOptions,
    callback: js.Any
  ): scala.Unit = js.native
  def patchInstallation(installationId: java.lang.String, partialUpdateOperations: js.Array[_], callback: js.Any): scala.Unit = js.native
  def patchInstallation(
    installationId: java.lang.String,
    partialUpdateOperations: js.Array[_],
    options: js.Any,
    callback: js.Any
  ): scala.Unit = js.native
  def send(tags: java.lang.String, payload: java.lang.String, callback: js.Any): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: java.lang.String,
    options: azureDashSbLib.Anon_HeadersObject,
    callback: js.Any
  ): scala.Unit = js.native
  def send(tags: java.lang.String, payload: js.Object, callback: js.Any): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: js.Object,
    options: azureDashSbLib.Anon_HeadersObject,
    callback: js.Any
  ): scala.Unit = js.native
  def updateRegistration(
    registration: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.NotificationHubRegistration,
    callback: js.Any
  ): scala.Unit = js.native
  def updateRegistration(
    registration: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.NotificationHubRegistration,
    options: azureDashSbLib.Anon_Etag,
    callback: js.Any
  ): scala.Unit = js.native
}

