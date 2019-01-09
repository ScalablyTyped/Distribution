package typings
package azureDashSbLib.libWnsserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WnsService extends js.Object {
  var notificationHubService: azureDashSbLib.libNotificationhubserviceMod.namespaced = js.native
  def createNativeRegistration(
    channel: java.lang.String,
    tags: java.lang.String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def createNativeRegistration(
    channel: java.lang.String,
    tags: java.lang.String,
    options: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def createNativeRegistration(
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def createNativeRegistration(
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    options: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: java.lang.String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: java.lang.String,
    options: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: java.lang.String,
    channel: java.lang.String,
    tags: js.Array[java.lang.String],
    options: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def listRegistrationsByChannel(
    channel: java.lang.String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def listRegistrationsByChannel(
    channel: java.lang.String,
    options: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.ListNotificationHubsOptions,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def send(tags: java.lang.String, payload: java.lang.String, `type`: types): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: java.lang.String,
    `type`: types,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def send(
    tags: java.lang.String,
    payload: java.lang.String,
    `type`: types,
    options: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def send(tags: js.Array[java.lang.String], payload: java.lang.String, `type`: types): scala.Unit = js.native
  def send(
    tags: js.Array[java.lang.String],
    payload: java.lang.String,
    `type`: types,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def send(
    tags: js.Array[java.lang.String],
    payload: java.lang.String,
    `type`: types,
    options: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendBadge(tags: badges, value: java.lang.String): scala.Unit = js.native
  def sendBadge(
    tags: badges,
    value: java.lang.String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendBadge(tags: badges, value: java.lang.String, options: Options): scala.Unit = js.native
  def sendBadge(
    tags: badges,
    value: java.lang.String,
    options: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendBadge(tags: badges, value: scala.Double): scala.Unit = js.native
  def sendBadge(
    tags: badges,
    value: scala.Double,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendBadge(tags: badges, value: scala.Double, options: Options): scala.Unit = js.native
  def sendBadge(
    tags: badges,
    value: scala.Double,
    options: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendBadge(tags: js.Array[badges], value: java.lang.String): scala.Unit = js.native
  def sendBadge(
    tags: js.Array[badges],
    value: java.lang.String,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendBadge(tags: js.Array[badges], value: java.lang.String, options: Options): scala.Unit = js.native
  def sendBadge(
    tags: js.Array[badges],
    value: java.lang.String,
    options: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendBadge(tags: js.Array[badges], value: scala.Double): scala.Unit = js.native
  def sendBadge(
    tags: js.Array[badges],
    value: scala.Double,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendBadge(tags: js.Array[badges], value: scala.Double, options: Options): scala.Unit = js.native
  def sendBadge(
    tags: js.Array[badges],
    value: scala.Double,
    options: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendRaw(tags: java.lang.String, payload: js.Any): scala.Unit = js.native
  def sendRaw(
    tags: java.lang.String,
    payload: js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendRaw(tags: java.lang.String, payload: js.Any, options: Options): scala.Unit = js.native
  def sendRaw(
    tags: java.lang.String,
    payload: js.Any,
    options: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendRaw(tags: js.Array[java.lang.String], payload: js.Any): scala.Unit = js.native
  def sendRaw(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendRaw(tags: js.Array[java.lang.String], payload: js.Any, options: Options): scala.Unit = js.native
  def sendRaw(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    options: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareBlock(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquareBlock(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareBlock(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareBlock(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareBlock(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquareBlock(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareBlock(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareBlock(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareImage(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquareImage(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareImage(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareImage(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareImage(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquareImage(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareImage(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareImage(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText01(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquarePeekImageAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText01(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquarePeekImageAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText02(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquarePeekImageAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText02(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquarePeekImageAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText03(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquarePeekImageAndText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText03(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquarePeekImageAndText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText04(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquarePeekImageAndText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText04(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquarePeekImageAndText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquarePeekImageAndText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText01(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquareText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText01(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquareText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText02(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquareText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText02(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquareText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText03(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquareText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText03(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquareText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText04(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquareText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText04(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileSquareText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileSquareText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideBlockAndText01(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideBlockAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideBlockAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideBlockAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideBlockAndText01(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideBlockAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideBlockAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideBlockAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideBlockAndText02(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideBlockAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideBlockAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideBlockAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideBlockAndText02(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideBlockAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideBlockAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideBlockAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImage(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideImage(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImage(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImage(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImage(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideImage(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImage(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImage(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageAndText01(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideImageAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageAndText01(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideImageAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageAndText02(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideImageAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageAndText02(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideImageAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageCollection(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideImageCollection(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageCollection(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageCollection(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageCollection(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideImageCollection(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageCollection(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideImageCollection(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage01(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImage01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage01(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImage01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage02(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImage02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage02(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImage02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage03(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImage03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage03(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImage03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage04(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImage04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage04(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImage04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage05(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImage05(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage05(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage05(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage05(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImage05(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage05(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage05(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage06(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImage06(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage06(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage06(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage06(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImage06(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage06(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImage06(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageAndText01(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageAndText01(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageAndText02(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageAndText02(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection01(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageCollection01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection01(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageCollection01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection02(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageCollection02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection02(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageCollection02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection03(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageCollection03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection03(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageCollection03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection04(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageCollection04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection04(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageCollection04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection05(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageCollection05(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection05(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection05(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection05(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageCollection05(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection05(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection05(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection06(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageCollection06(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection06(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection06(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection06(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWidePeekImageCollection06(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection06(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWidePeekImageCollection06(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText01(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideSmallImageAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText01(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideSmallImageAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText02(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideSmallImageAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText02(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideSmallImageAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText03(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideSmallImageAndText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText03(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideSmallImageAndText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText04(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideSmallImageAndText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText04(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideSmallImageAndText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText05(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideSmallImageAndText05(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText05(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText05(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText05(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideSmallImageAndText05(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText05(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideSmallImageAndText05(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText01(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText01(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText02(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText02(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText03(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText03(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText04(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText04(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText05(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText05(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText05(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText05(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText05(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText05(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText05(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText05(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText06(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText06(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText06(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText06(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText06(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText06(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText06(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText06(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText07(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText07(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText07(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText07(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText07(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText07(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText07(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText07(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText08(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText08(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText08(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText08(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText08(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText08(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText08(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText08(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText09(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText09(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText09(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText09(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText09(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText09(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText09(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText09(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText10(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText10(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText10(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText10(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText10(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText10(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText10(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText10(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText11(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText11(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText11(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText11(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText11(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendTileWideText11(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText11(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendTileWideText11(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText01(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastImageAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText01(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastImageAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText02(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastImageAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText02(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastImageAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText03(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastImageAndText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText03(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastImageAndText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText04(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastImageAndText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText04(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastImageAndText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastImageAndText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText01(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText01(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText01(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText01(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText02(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText02(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText02(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText02(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText03(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText03(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText03(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText03(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText04(tags: java.lang.String, payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText04(
    tags: java.lang.String,
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText04(tags: js.Array[java.lang.String], payload: js.Any, optionsOrCallback: Options): scala.Unit = js.native
  def sendToastText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
  def sendToastText04(
    tags: js.Array[java.lang.String],
    payload: js.Any,
    optionsOrCallback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): scala.Unit = js.native
}

