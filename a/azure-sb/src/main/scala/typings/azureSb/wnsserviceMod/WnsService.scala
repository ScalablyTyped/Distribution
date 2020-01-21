package typings.azureSb.wnsserviceMod

import typings.azureSb.mod.Azure.ServiceBus.ListNotificationHubsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WnsService extends js.Object {
  var notificationHubService: typings.azureSb.notificationhubserviceMod.^ = js.native
  def createNativeRegistration(
    channel: String,
    tags: String,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def createNativeRegistration(
    channel: String,
    tags: String,
    options: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def createNativeRegistration(
    channel: String,
    tags: js.Array[String],
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def createNativeRegistration(
    channel: String,
    tags: js.Array[String],
    options: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: String,
    channel: String,
    tags: String,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: String,
    channel: String,
    tags: String,
    options: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: String,
    channel: String,
    tags: js.Array[String],
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: String,
    channel: String,
    tags: js.Array[String],
    options: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def listRegistrationsByChannel(
    channel: String,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def listRegistrationsByChannel(
    channel: String,
    options: ListNotificationHubsOptions,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def send(tags: String, payload: String, `type`: types): Unit = js.native
  def send(
    tags: String,
    payload: String,
    `type`: types,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def send(
    tags: String,
    payload: String,
    `type`: types,
    options: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def send(tags: js.Array[String], payload: String, `type`: types): Unit = js.native
  def send(
    tags: js.Array[String],
    payload: String,
    `type`: types,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def send(
    tags: js.Array[String],
    payload: String,
    `type`: types,
    options: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendBadge(tags: js.Array[badges], value: String): Unit = js.native
  def sendBadge(
    tags: js.Array[badges],
    value: String,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendBadge(tags: js.Array[badges], value: String, options: Options): Unit = js.native
  def sendBadge(
    tags: js.Array[badges],
    value: String,
    options: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendBadge(tags: js.Array[badges], value: Double): Unit = js.native
  def sendBadge(
    tags: js.Array[badges],
    value: Double,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendBadge(tags: js.Array[badges], value: Double, options: Options): Unit = js.native
  def sendBadge(
    tags: js.Array[badges],
    value: Double,
    options: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendBadge(tags: badges, value: String): Unit = js.native
  def sendBadge(
    tags: badges,
    value: String,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendBadge(tags: badges, value: String, options: Options): Unit = js.native
  def sendBadge(
    tags: badges,
    value: String,
    options: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendBadge(tags: badges, value: Double): Unit = js.native
  def sendBadge(
    tags: badges,
    value: Double,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendBadge(tags: badges, value: Double, options: Options): Unit = js.native
  def sendBadge(
    tags: badges,
    value: Double,
    options: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendRaw(tags: String, payload: js.Any): Unit = js.native
  def sendRaw(
    tags: String,
    payload: js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendRaw(tags: String, payload: js.Any, options: Options): Unit = js.native
  def sendRaw(
    tags: String,
    payload: js.Any,
    options: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendRaw(tags: js.Array[String], payload: js.Any): Unit = js.native
  def sendRaw(
    tags: js.Array[String],
    payload: js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendRaw(tags: js.Array[String], payload: js.Any, options: Options): Unit = js.native
  def sendRaw(
    tags: js.Array[String],
    payload: js.Any,
    options: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareBlock(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareBlock(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareBlock(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquareBlock(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareBlock(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareBlock(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareBlock(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquareBlock(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareImage(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareImage(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareImage(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquareImage(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareImage(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareImage(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareImage(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquareImage(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquarePeekImageAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquarePeekImageAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquarePeekImageAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquarePeekImageAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquarePeekImageAndText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquarePeekImageAndText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquarePeekImageAndText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquarePeekImageAndText04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquarePeekImageAndText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquareText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquareText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquareText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquareText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquareText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquareText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquareText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileSquareText04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileSquareText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideBlockAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideBlockAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideBlockAndText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideBlockAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideBlockAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideBlockAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideBlockAndText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideBlockAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideBlockAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideBlockAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideBlockAndText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideBlockAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideBlockAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideBlockAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideBlockAndText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideBlockAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImage(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImage(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImage(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideImage(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImage(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImage(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImage(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideImage(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageAndText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideImageAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageAndText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideImageAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageAndText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideImageAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageAndText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideImageAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageCollection(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageCollection(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageCollection(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideImageCollection(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageCollection(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageCollection(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideImageCollection(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideImageCollection(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImage01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImage01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImage02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImage02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImage03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImage03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImage04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImage04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage05(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage05(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage05(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImage05(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage05(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage05(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage05(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImage05(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage06(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage06(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage06(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImage06(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage06(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage06(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImage06(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImage06(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageAndText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageAndText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageAndText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageAndText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageCollection01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageCollection01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageCollection02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageCollection02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageCollection03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageCollection03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageCollection04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageCollection04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection05(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection05(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection05(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageCollection05(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection05(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection05(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection05(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageCollection05(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection06(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection06(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection06(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageCollection06(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection06(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection06(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWidePeekImageCollection06(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWidePeekImageCollection06(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideSmallImageAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideSmallImageAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideSmallImageAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideSmallImageAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideSmallImageAndText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideSmallImageAndText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideSmallImageAndText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideSmallImageAndText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText05(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText05(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText05(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideSmallImageAndText05(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText05(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText05(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideSmallImageAndText05(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideSmallImageAndText05(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText05(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText05(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText05(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText05(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText05(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText05(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText05(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText05(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText06(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText06(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText06(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText06(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText06(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText06(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText06(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText06(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText07(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText07(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText07(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText07(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText07(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText07(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText07(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText07(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText08(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText08(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText08(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText08(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText08(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText08(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText08(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText08(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText09(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText09(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText09(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText09(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText09(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText09(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText09(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText09(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText10(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText10(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText10(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText10(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText10(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText10(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText10(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText10(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText11(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText11(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText11(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText11(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText11(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText11(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendTileWideText11(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendTileWideText11(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastImageAndText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastImageAndText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastImageAndText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastImageAndText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastImageAndText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastImageAndText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastImageAndText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastImageAndText04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastImageAndText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastText01(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastText01(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastText02(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastText02(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastText03(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastText03(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastText04(
    tags: String,
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
  def sendToastText04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
  def sendToastText04(
    tags: js.Array[String],
    payload: js.Any,
    optionsOrCallback: Options,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
  ): Unit = js.native
}

