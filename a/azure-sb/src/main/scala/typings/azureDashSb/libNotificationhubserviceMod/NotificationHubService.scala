package typings.azureDashSb.libNotificationhubserviceMod

import typings.azureDashSb.Anon_Etag
import typings.azureDashSb.Anon_HeadersObject
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.ListNotificationHubsOptions
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.NotificationHubInstallation
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.NotificationHubRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationHubService extends js.Object {
  var apns: typings.azureDashSb.libApnsserviceMod.^ = js.native
  var gcm: typings.azureDashSb.libGcmserviceMod.^ = js.native
  var hubName: String = js.native
  var mpns: typings.azureDashSb.libMpnserviceMod.^ = js.native
  var wns: typings.azureDashSb.libWnsserviceMod.^ = js.native
  def createOrUpdateInstallation(
    installation: NotificationHubInstallation,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def createOrUpdateInstallation(
    installation: NotificationHubInstallation,
    options: js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def createOrUpdateRegistration(
    registration: NotificationHubRegistration,
    options: Anon_Etag,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def createRegistrationId(
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def deleteInstallation(
    installationId: String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def deleteInstallation(
    installationId: String,
    options: js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def deleteRegistration(
    registrationId: String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def deleteRegistration(
    registrationId: String,
    options: Anon_Etag,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def getInstallation(
    installationId: String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def getInstallation(
    installationId: String,
    options: js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def getRegistration(
    registrationId: String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def getRegistration(
    registrationId: String,
    options: js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def listRegistrations(
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def listRegistrations(
    options: ListNotificationHubsOptions,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def listRegistrationsByTag(
    tag: String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def listRegistrationsByTag(
    tag: String,
    options: ListNotificationHubsOptions,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def patchInstallation(
    installationId: String,
    partialUpdateOperations: js.Array[_],
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def patchInstallation(
    installationId: String,
    partialUpdateOperations: js.Array[_],
    options: js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def send(
    tags: String,
    payload: String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def send(
    tags: String,
    payload: String,
    options: Anon_HeadersObject,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def send(
    tags: String,
    payload: js.Object,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def send(
    tags: String,
    payload: js.Object,
    options: Anon_HeadersObject,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def updateRegistration(
    registration: NotificationHubRegistration,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def updateRegistration(
    registration: NotificationHubRegistration,
    options: Anon_Etag,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
}

