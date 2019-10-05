package typings.cordovaDashPluginDashXDashSocialsharing.SocialSharingPlugin

import typings.cordovaDashPluginDashXDashSocialsharing.Anon_Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocialSharing extends js.Object {
  def available(callback: js.Function1[/* isAvailable */ Boolean, Unit]): Unit = js.native
  def canShareVia(via: String, message: String): Unit = js.native
  def canShareVia(via: String, message: String, subject: String): Unit = js.native
  def canShareVia(via: String, message: String, subject: String, fileOrFileArray: String): Unit = js.native
  def canShareVia(via: String, message: String, subject: String, fileOrFileArray: String, url: String): Unit = js.native
  def canShareVia(
    via: String,
    message: String,
    subject: String,
    fileOrFileArray: String,
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def canShareVia(
    via: String,
    message: String,
    subject: String,
    fileOrFileArray: String,
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def canShareVia(via: String, message: String, subject: String, fileOrFileArray: js.Array[String]): Unit = js.native
  def canShareVia(via: String, message: String, subject: String, fileOrFileArray: js.Array[String], url: String): Unit = js.native
  def canShareVia(
    via: String,
    message: String,
    subject: String,
    fileOrFileArray: js.Array[String],
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def canShareVia(
    via: String,
    message: String,
    subject: String,
    fileOrFileArray: js.Array[String],
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def canShareViaEmail(
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsd */ String, Unit]
  ): Unit = js.native
  /**
  		 * Override this method (after deviceready) to set the location where you want the iPad popup arrow to appear.
  		 * If not overridden with different values, the popup is not used.
  		 */
  def iPadPopupCoordinates(): String = js.native
  def saveToPhotoAlbum(fileOrFileArray: String): Unit = js.native
  def saveToPhotoAlbum(fileOrFileArray: String, successCallback: js.Function1[/* succeeded */ Boolean, Unit]): Unit = js.native
  def saveToPhotoAlbum(
    fileOrFileArray: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def saveToPhotoAlbum(fileOrFileArray: js.Array[String]): Unit = js.native
  def saveToPhotoAlbum(fileOrFileArray: js.Array[String], successCallback: js.Function1[/* succeeded */ Boolean, Unit]): Unit = js.native
  def saveToPhotoAlbum(
    fileOrFileArray: js.Array[String],
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def setIPadPopupCoordinates(coords: String): Unit = js.native
  def share(message: String): Unit = js.native
  def share(message: String, subject: String): Unit = js.native
  def share(message: String, subject: String, fileOrFileArray: String): Unit = js.native
  def share(message: String, subject: String, fileOrFileArray: String, url: String): Unit = js.native
  def share(
    message: String,
    subject: String,
    fileOrFileArray: String,
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def share(
    message: String,
    subject: String,
    fileOrFileArray: String,
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def share(message: String, subject: String, fileOrFileArray: js.Array[String]): Unit = js.native
  def share(message: String, subject: String, fileOrFileArray: js.Array[String], url: String): Unit = js.native
  def share(
    message: String,
    subject: String,
    fileOrFileArray: js.Array[String],
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def share(
    message: String,
    subject: String,
    fileOrFileArray: js.Array[String],
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareVia(
    via: String,
    message: String,
    subject: String,
    fileOrFileArray: String,
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def shareVia(
    via: String,
    message: String,
    subject: String,
    fileOrFileArray: String,
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareVia(
    via: String,
    message: String,
    subject: String,
    fileOrFileArray: js.Array[String],
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def shareVia(
    via: String,
    message: String,
    subject: String,
    fileOrFileArray: js.Array[String],
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareViaEmail(
    message: String,
    subject: String,
    toArray: js.UndefOr[js.Array[String]],
    ccArray: js.UndefOr[js.Array[String]],
    bccArray: js.UndefOr[js.Array[String]],
    fileOrFileArray: js.UndefOr[js.Array[String] | String],
    successCallback: js.UndefOr[js.Function1[/* succeeded */ Boolean, Unit]],
    errorCallback: js.UndefOr[js.Function1[/* errormsg */ String, Unit]]
  ): Unit = js.native
  def shareViaFacebook(message: String): Unit = js.native
  def shareViaFacebook(message: String, fileOrFileArray: String): Unit = js.native
  def shareViaFacebook(message: String, fileOrFileArray: String, url: String): Unit = js.native
  def shareViaFacebook(
    message: String,
    fileOrFileArray: String,
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def shareViaFacebook(
    message: String,
    fileOrFileArray: String,
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareViaFacebook(message: String, fileOrFileArray: js.Array[String]): Unit = js.native
  def shareViaFacebook(message: String, fileOrFileArray: js.Array[String], url: String): Unit = js.native
  def shareViaFacebook(
    message: String,
    fileOrFileArray: js.Array[String],
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def shareViaFacebook(
    message: String,
    fileOrFileArray: js.Array[String],
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareViaFacebookWithPasteMessageHint(message: String, fileOrFileArray: String, url: String, pasteMessageHint: String): Unit = js.native
  def shareViaFacebookWithPasteMessageHint(
    message: String,
    fileOrFileArray: String,
    url: String,
    pasteMessageHint: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def shareViaFacebookWithPasteMessageHint(
    message: String,
    fileOrFileArray: String,
    url: String,
    pasteMessageHint: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareViaFacebookWithPasteMessageHint(message: String, fileOrFileArray: js.Array[String], url: String, pasteMessageHint: String): Unit = js.native
  def shareViaFacebookWithPasteMessageHint(
    message: String,
    fileOrFileArray: js.Array[String],
    url: String,
    pasteMessageHint: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def shareViaFacebookWithPasteMessageHint(
    message: String,
    fileOrFileArray: js.Array[String],
    url: String,
    pasteMessageHint: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareViaInstagram(message: String, fileOrFileArray: String): Unit = js.native
  def shareViaInstagram(
    message: String,
    fileOrFileArray: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def shareViaInstagram(
    message: String,
    fileOrFileArray: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareViaInstagram(message: String, fileOrFileArray: js.Array[String]): Unit = js.native
  def shareViaInstagram(
    message: String,
    fileOrFileArray: js.Array[String],
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def shareViaInstagram(
    message: String,
    fileOrFileArray: js.Array[String],
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareViaSMS(options: String, phonenumbers: String): Unit = js.native
  def shareViaSMS(
    options: String,
    phonenumbers: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def shareViaSMS(
    options: String,
    phonenumbers: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareViaSMS(options: Anon_Image, phonenumbers: String): Unit = js.native
  def shareViaSMS(
    options: Anon_Image,
    phonenumbers: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def shareViaSMS(
    options: Anon_Image,
    phonenumbers: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareViaTwitter(message: String): Unit = js.native
  def shareViaTwitter(message: String, file: String): Unit = js.native
  def shareViaTwitter(message: String, file: String, url: String): Unit = js.native
  def shareViaTwitter(
    message: String,
    file: String,
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def shareViaTwitter(
    message: String,
    file: String,
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareViaWhatsApp(message: String): Unit = js.native
  def shareViaWhatsApp(message: String, fileOrFileArray: String): Unit = js.native
  def shareViaWhatsApp(message: String, fileOrFileArray: String, url: String): Unit = js.native
  def shareViaWhatsApp(
    message: String,
    fileOrFileArray: String,
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def shareViaWhatsApp(
    message: String,
    fileOrFileArray: String,
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareViaWhatsApp(message: String, fileOrFileArray: js.Array[String]): Unit = js.native
  def shareViaWhatsApp(message: String, fileOrFileArray: js.Array[String], url: String): Unit = js.native
  def shareViaWhatsApp(
    message: String,
    fileOrFileArray: js.Array[String],
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def shareViaWhatsApp(
    message: String,
    fileOrFileArray: js.Array[String],
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareViaWhatsAppToReceiver(receiver: String, message: String): Unit = js.native
  def shareViaWhatsAppToReceiver(receiver: String, message: String, fileOrFileArray: String): Unit = js.native
  def shareViaWhatsAppToReceiver(receiver: String, message: String, fileOrFileArray: String, url: String): Unit = js.native
  def shareViaWhatsAppToReceiver(
    receiver: String,
    message: String,
    fileOrFileArray: String,
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def shareViaWhatsAppToReceiver(
    receiver: String,
    message: String,
    fileOrFileArray: String,
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareViaWhatsAppToReceiver(receiver: String, message: String, fileOrFileArray: js.Array[String]): Unit = js.native
  def shareViaWhatsAppToReceiver(receiver: String, message: String, fileOrFileArray: js.Array[String], url: String): Unit = js.native
  def shareViaWhatsAppToReceiver(
    receiver: String,
    message: String,
    fileOrFileArray: js.Array[String],
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit]
  ): Unit = js.native
  def shareViaWhatsAppToReceiver(
    receiver: String,
    message: String,
    fileOrFileArray: js.Array[String],
    url: String,
    successCallback: js.Function1[/* succeeded */ Boolean, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
  def shareWithOptions(options: ShareOptions): Unit = js.native
  def shareWithOptions(options: ShareOptions, successCallback: js.Function1[/* result */ ShareResult, Unit]): Unit = js.native
  def shareWithOptions(
    options: ShareOptions,
    successCallback: js.Function1[/* result */ ShareResult, Unit],
    errorCallback: js.Function1[/* errormsg */ String, Unit]
  ): Unit = js.native
}

