package typings.cordovaPluginXSocialsharing

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocialSharing extends js.Object {
  @JSName("shareW3C")
  var shareW3C_Original: SocialSharingW3C = js.native
  def available(callback: js.Function1[/* available */ Boolean, Unit]): Unit = js.native
  def canShareVia(via: String): Unit = js.native
  def canShareVia(via: String, message: String): Unit = js.native
  def canShareVia(via: String, message: String, subject: String): Unit = js.native
  def canShareVia(via: String, message: String, subject: String, fileOrFileArray: String): Unit = js.native
  def canShareVia(
    via: String,
    message: String,
    subject: String,
    fileOrFileArray: String,
    successCallback: SocialSharingSuccessCallback[scala.Nothing]
  ): Unit = js.native
  def canShareVia(
    via: String,
    message: String,
    subject: String,
    fileOrFileArray: String,
    successCallback: SocialSharingSuccessCallback[scala.Nothing],
    errorCallback: SocialSharingErrorCallback
  ): Unit = js.native
  def canShareVia(via: String, message: String, subject: String, fileOrFileArray: ArrayLike[String]): Unit = js.native
  def canShareVia(
    via: String,
    message: String,
    subject: String,
    fileOrFileArray: ArrayLike[String],
    successCallback: SocialSharingSuccessCallback[scala.Nothing]
  ): Unit = js.native
  def canShareVia(
    via: String,
    message: String,
    subject: String,
    fileOrFileArray: ArrayLike[String],
    successCallback: SocialSharingSuccessCallback[scala.Nothing],
    errorCallback: SocialSharingErrorCallback
  ): Unit = js.native
  def canShareViaEmail(): Unit = js.native
  def canShareViaEmail(successCallback: SocialSharingSuccessCallback[scala.Nothing]): Unit = js.native
  def canShareViaEmail(
    successCallback: SocialSharingSuccessCallback[scala.Nothing],
    errorCallback: SocialSharingErrorCallback
  ): Unit = js.native
  def iPadPopupCoordinates(): String = js.native
  def saveToPhotoAlbum(): Unit = js.native
  def saveToPhotoAlbum(fileOrFileArray: String): Unit = js.native
  def saveToPhotoAlbum(fileOrFileArray: String, successCallback: SocialSharingSuccessCallback[scala.Nothing]): Unit = js.native
  def saveToPhotoAlbum(
    fileOrFileArray: String,
    successCallback: SocialSharingSuccessCallback[scala.Nothing],
    errorCallback: SocialSharingErrorCallback
  ): Unit = js.native
  def saveToPhotoAlbum(fileOrFileArray: ArrayLike[String]): Unit = js.native
  def saveToPhotoAlbum(fileOrFileArray: ArrayLike[String], successCallback: SocialSharingSuccessCallback[scala.Nothing]): Unit = js.native
  def saveToPhotoAlbum(
    fileOrFileArray: ArrayLike[String],
    successCallback: SocialSharingSuccessCallback[scala.Nothing],
    errorCallback: SocialSharingErrorCallback
  ): Unit = js.native
  def setIPadPopupCoordinates(coords: String): Unit = js.native
  def share(
    message: js.UndefOr[String],
    subject: js.UndefOr[String],
    fileOrFileArray: js.UndefOr[ArrayLike[String] | String],
    url: js.UndefOr[String],
    successCallback: js.UndefOr[SocialSharingSuccessCallback[Boolean]],
    errorCallback: js.UndefOr[SocialSharingErrorCallback]
  ): Unit = js.native
  def shareVia(
    via: String,
    message: js.UndefOr[String],
    subject: js.UndefOr[String],
    fileOrFileArray: js.UndefOr[ArrayLike[String] | String],
    url: js.UndefOr[String],
    successCallback: js.UndefOr[SocialSharingSuccessCallback[Boolean]],
    errorCallback: js.UndefOr[SocialSharingErrorCallback]
  ): Unit = js.native
  def shareViaEmail(
    message: js.UndefOr[String],
    subject: js.UndefOr[String],
    toArray: js.UndefOr[ArrayLike[String]],
    ccArray: js.UndefOr[ArrayLike[String]],
    bccArray: js.UndefOr[ArrayLike[String]],
    fileOrFileArray: js.UndefOr[ArrayLike[String] | String],
    successCallback: js.UndefOr[SocialSharingSuccessCallback[Boolean]],
    errorCallback: js.UndefOr[SocialSharingErrorCallback]
  ): Unit = js.native
  def shareViaFacebook(): Unit = js.native
  def shareViaFacebook(message: String): Unit = js.native
  def shareViaFacebook(message: String, fileOrFileArray: String): Unit = js.native
  def shareViaFacebook(message: String, fileOrFileArray: String, url: String): Unit = js.native
  def shareViaFacebook(
    message: String,
    fileOrFileArray: String,
    url: String,
    successCallback: SocialSharingSuccessCallback[Boolean]
  ): Unit = js.native
  def shareViaFacebook(
    message: String,
    fileOrFileArray: String,
    url: String,
    successCallback: SocialSharingSuccessCallback[Boolean],
    errorCallback: SocialSharingErrorCallback
  ): Unit = js.native
  def shareViaFacebook(message: String, fileOrFileArray: ArrayLike[String]): Unit = js.native
  def shareViaFacebook(message: String, fileOrFileArray: ArrayLike[String], url: String): Unit = js.native
  def shareViaFacebook(
    message: String,
    fileOrFileArray: ArrayLike[String],
    url: String,
    successCallback: SocialSharingSuccessCallback[Boolean]
  ): Unit = js.native
  def shareViaFacebook(
    message: String,
    fileOrFileArray: ArrayLike[String],
    url: String,
    successCallback: SocialSharingSuccessCallback[Boolean],
    errorCallback: SocialSharingErrorCallback
  ): Unit = js.native
  def shareViaFacebookWithPasteMessageHint(
    message: js.UndefOr[String],
    fileOrFileArray: js.UndefOr[ArrayLike[String] | String],
    url: js.UndefOr[String],
    pasteMessageHint: js.UndefOr[String],
    successCallback: js.UndefOr[SocialSharingSuccessCallback[Boolean]],
    errorCallback: js.UndefOr[SocialSharingErrorCallback]
  ): Unit = js.native
  def shareViaInstagram(): Unit = js.native
  def shareViaInstagram(message: String): Unit = js.native
  def shareViaInstagram(message: String, fileOrFileArray: String): Unit = js.native
  def shareViaInstagram(
    message: String,
    fileOrFileArray: String,
    successCallback: SocialSharingSuccessCallback[scala.Nothing]
  ): Unit = js.native
  def shareViaInstagram(
    message: String,
    fileOrFileArray: String,
    successCallback: SocialSharingSuccessCallback[scala.Nothing],
    errorCallback: SocialSharingErrorCallback
  ): Unit = js.native
  def shareViaInstagram(message: String, fileOrFileArray: ArrayLike[String]): Unit = js.native
  def shareViaInstagram(
    message: String,
    fileOrFileArray: ArrayLike[String],
    successCallback: SocialSharingSuccessCallback[scala.Nothing]
  ): Unit = js.native
  def shareViaInstagram(
    message: String,
    fileOrFileArray: ArrayLike[String],
    successCallback: SocialSharingSuccessCallback[scala.Nothing],
    errorCallback: SocialSharingErrorCallback
  ): Unit = js.native
  def shareViaSMS(): Unit = js.native
  def shareViaSMS(options: String): Unit = js.native
  def shareViaSMS(options: String, phoneNumbers: ArrayLike[String]): Unit = js.native
  def shareViaSMS(
    options: String,
    phoneNumbers: ArrayLike[String],
    successCallback: SocialSharingSuccessCallback[Boolean]
  ): Unit = js.native
  def shareViaSMS(
    options: String,
    phoneNumbers: ArrayLike[String],
    successCallback: SocialSharingSuccessCallback[Boolean],
    errorCallback: SocialSharingErrorCallback
  ): Unit = js.native
  def shareViaSMS(options: SocialSharingOptions): Unit = js.native
  def shareViaSMS(options: SocialSharingOptions, phoneNumbers: ArrayLike[String]): Unit = js.native
  def shareViaSMS(
    options: SocialSharingOptions,
    phoneNumbers: ArrayLike[String],
    successCallback: SocialSharingSuccessCallback[Boolean]
  ): Unit = js.native
  def shareViaSMS(
    options: SocialSharingOptions,
    phoneNumbers: ArrayLike[String],
    successCallback: SocialSharingSuccessCallback[Boolean],
    errorCallback: SocialSharingErrorCallback
  ): Unit = js.native
  def shareViaTwitter(): Unit = js.native
  def shareViaTwitter(message: String): Unit = js.native
  def shareViaTwitter(message: String, file: String): Unit = js.native
  def shareViaTwitter(message: String, file: String, url: String): Unit = js.native
  def shareViaTwitter(message: String, file: String, url: String, successCallback: SocialSharingSuccessCallback[Boolean]): Unit = js.native
  def shareViaTwitter(
    message: String,
    file: String,
    url: String,
    successCallback: SocialSharingSuccessCallback[Boolean],
    errorCallback: SocialSharingErrorCallback
  ): Unit = js.native
  def shareViaWhatsApp(): Unit = js.native
  def shareViaWhatsApp(message: String): Unit = js.native
  def shareViaWhatsApp(message: String, fileOrFileArray: String): Unit = js.native
  def shareViaWhatsApp(message: String, fileOrFileArray: String, url: String): Unit = js.native
  def shareViaWhatsApp(
    message: String,
    fileOrFileArray: String,
    url: String,
    successCallback: SocialSharingSuccessCallback[scala.Nothing]
  ): Unit = js.native
  def shareViaWhatsApp(
    message: String,
    fileOrFileArray: String,
    url: String,
    successCallback: SocialSharingSuccessCallback[scala.Nothing],
    errorCallback: SocialSharingErrorCallback
  ): Unit = js.native
  def shareViaWhatsApp(message: String, fileOrFileArray: ArrayLike[String]): Unit = js.native
  def shareViaWhatsApp(message: String, fileOrFileArray: ArrayLike[String], url: String): Unit = js.native
  def shareViaWhatsApp(
    message: String,
    fileOrFileArray: ArrayLike[String],
    url: String,
    successCallback: SocialSharingSuccessCallback[scala.Nothing]
  ): Unit = js.native
  def shareViaWhatsApp(
    message: String,
    fileOrFileArray: ArrayLike[String],
    url: String,
    successCallback: SocialSharingSuccessCallback[scala.Nothing],
    errorCallback: SocialSharingErrorCallback
  ): Unit = js.native
  def shareViaWhatsAppToPhone(
    phone: js.UndefOr[String],
    message: js.UndefOr[String],
    fileOrFileArray: js.UndefOr[ArrayLike[String] | String],
    url: js.UndefOr[String],
    successCallback: js.UndefOr[SocialSharingSuccessCallback[scala.Nothing]],
    errorCallback: js.UndefOr[SocialSharingErrorCallback]
  ): Unit = js.native
  def shareViaWhatsAppToReceiver(
    receiver: js.UndefOr[String],
    message: js.UndefOr[String],
    fileOrFileArray: js.UndefOr[ArrayLike[String] | String],
    url: js.UndefOr[String],
    successCallback: js.UndefOr[SocialSharingSuccessCallback[scala.Nothing]],
    errorCallback: js.UndefOr[SocialSharingErrorCallback]
  ): Unit = js.native
  def shareW3C(shareData: SocialSharingW3CData): js.Promise[SocialSharingResult] = js.native
  def shareWithOptions(options: SocialSharingOptions): Unit = js.native
  def shareWithOptions(options: SocialSharingOptions, successCallback: SocialSharingSuccessCallback[SocialSharingResult]): Unit = js.native
  def shareWithOptions(
    options: SocialSharingOptions,
    successCallback: SocialSharingSuccessCallback[SocialSharingResult],
    errorCallback: SocialSharingErrorCallback
  ): Unit = js.native
}

