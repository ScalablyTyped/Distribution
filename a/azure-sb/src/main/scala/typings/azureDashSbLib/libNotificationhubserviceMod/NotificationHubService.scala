package typings
package azureDashSbLib.libNotificationhubserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationHubService extends js.Object {
  var apns: azureDashSbLib.libApnsserviceMod.^ = js.native
  var gcm: azureDashSbLib.libGcmserviceMod.^ = js.native
  var hubName: java.lang.String = js.native
  var mpns: azureDashSbLib.libMpnserviceMod.^ = js.native
  var wns: azureDashSbLib.libWnsserviceMod.^ = js.native
  def createOrUpdateInstallation(
    installation: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.NotificationHubInstallation,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def createOrUpdateInstallation(
    installation: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.NotificationHubInstallation,
    options: js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def createOrUpdateRegistration(
    registration: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.NotificationHubRegistration,
    options: azureDashSbLib.Anon_Etag,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def createRegistrationId(
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def deleteInstallation(
    installationId: java.lang.String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def deleteInstallation(
    installationId: java.lang.String,
    options: js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def deleteRegistration(
    registrationId: java.lang.String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def deleteRegistration(
    registrationId: java.lang.String,
    options: azureDashSbLib.Anon_Etag,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def getInstallation(
    installationId: java.lang.String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def getInstallation(
    installationId: java.lang.String,
    options: js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def getRegistration(
    registrationId: java.lang.String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def getRegistration(
    registrationId: java.lang.String,
    options: js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def listRegistrations(
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def listRegistrations(
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ListNotificationHubsOptions,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def listRegistrationsByTag(
    tag: java.lang.String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def listRegistrationsByTag(
    tag: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ListNotificationHubsOptions,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def patchInstallation(
    installationId: java.lang.String,
    partialUpdateOperations: js.Array[_],
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def patchInstallation(
    installationId: java.lang.String,
    partialUpdateOperations: js.Array[_],
    options: js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: java.lang.String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: java.lang.String,
    options: azureDashSbLib.Anon_HeadersObject,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: js.Object,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: js.Object,
    options: azureDashSbLib.Anon_HeadersObject,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def updateRegistration(
    registration: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.NotificationHubRegistration,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def updateRegistration(
    registration: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.NotificationHubRegistration,
    options: azureDashSbLib.Anon_Etag,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
}

