package typings
package cordovaDashPluginDashXDashSocialsharingLib.SocialSharingPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocialSharing extends js.Object {
  def available(callback: js.Function1[/* isAvailable */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def canShareVia(via: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def canShareVia(via: java.lang.String, message: java.lang.String, subject: java.lang.String): scala.Unit = js.native
  def canShareVia(
    via: java.lang.String,
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: java.lang.String
  ): scala.Unit = js.native
  def canShareVia(
    via: java.lang.String,
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String
  ): scala.Unit = js.native
  def canShareVia(
    via: java.lang.String,
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def canShareVia(
    via: java.lang.String,
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def canShareVia(
    via: java.lang.String,
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def canShareVia(
    via: java.lang.String,
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String
  ): scala.Unit = js.native
  def canShareVia(
    via: java.lang.String,
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def canShareVia(
    via: java.lang.String,
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def canShareViaEmail(
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsd */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * Override this method (after deviceready) to set the location where you want the iPad popup arrow to appear.
  		 * If not overridden with different values, the popup is not used.
  		 */
  def iPadPopupCoordinates(): java.lang.String = js.native
  def saveToPhotoAlbum(fileOrFileArray: java.lang.String): scala.Unit = js.native
  def saveToPhotoAlbum(
    fileOrFileArray: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def saveToPhotoAlbum(
    fileOrFileArray: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def saveToPhotoAlbum(fileOrFileArray: js.Array[java.lang.String]): scala.Unit = js.native
  def saveToPhotoAlbum(
    fileOrFileArray: js.Array[java.lang.String],
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def saveToPhotoAlbum(
    fileOrFileArray: js.Array[java.lang.String],
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def setIPadPopupCoordinates(coords: java.lang.String): scala.Unit = js.native
  def share(message: java.lang.String): scala.Unit = js.native
  def share(message: java.lang.String, subject: java.lang.String): scala.Unit = js.native
  def share(message: java.lang.String, subject: java.lang.String, fileOrFileArray: java.lang.String): scala.Unit = js.native
  def share(
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String
  ): scala.Unit = js.native
  def share(
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def share(
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def share(message: java.lang.String, subject: java.lang.String, fileOrFileArray: js.Array[java.lang.String]): scala.Unit = js.native
  def share(
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String
  ): scala.Unit = js.native
  def share(
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def share(
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareVia(
    via: java.lang.String,
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def shareVia(
    via: java.lang.String,
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareVia(
    via: java.lang.String,
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def shareVia(
    via: java.lang.String,
    message: java.lang.String,
    subject: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareViaEmail(
    message: java.lang.String,
    subject: java.lang.String,
    toArray: js.UndefOr[js.Array[java.lang.String]],
    ccArray: js.UndefOr[js.Array[java.lang.String]],
    bccArray: js.UndefOr[js.Array[java.lang.String]],
    fileOrFileArray: js.UndefOr[js.Array[java.lang.String] | java.lang.String],
    successCallback: js.UndefOr[js.Function1[/* succeeded */ scala.Boolean, scala.Unit]],
    errorCallback: js.UndefOr[js.Function1[/* errormsg */ java.lang.String, scala.Unit]]
  ): scala.Unit = js.native
  def shareViaFacebook(message: java.lang.String): scala.Unit = js.native
  def shareViaFacebook(message: java.lang.String, fileOrFileArray: java.lang.String): scala.Unit = js.native
  def shareViaFacebook(message: java.lang.String, fileOrFileArray: java.lang.String, url: java.lang.String): scala.Unit = js.native
  def shareViaFacebook(
    message: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def shareViaFacebook(
    message: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareViaFacebook(message: java.lang.String, fileOrFileArray: js.Array[java.lang.String]): scala.Unit = js.native
  def shareViaFacebook(message: java.lang.String, fileOrFileArray: js.Array[java.lang.String], url: java.lang.String): scala.Unit = js.native
  def shareViaFacebook(
    message: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def shareViaFacebook(
    message: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareViaFacebookWithPasteMessageHint(
    message: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String,
    pasteMessageHint: java.lang.String
  ): scala.Unit = js.native
  def shareViaFacebookWithPasteMessageHint(
    message: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String,
    pasteMessageHint: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def shareViaFacebookWithPasteMessageHint(
    message: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String,
    pasteMessageHint: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareViaFacebookWithPasteMessageHint(
    message: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String,
    pasteMessageHint: java.lang.String
  ): scala.Unit = js.native
  def shareViaFacebookWithPasteMessageHint(
    message: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String,
    pasteMessageHint: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def shareViaFacebookWithPasteMessageHint(
    message: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String,
    pasteMessageHint: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareViaInstagram(message: java.lang.String, fileOrFileArray: java.lang.String): scala.Unit = js.native
  def shareViaInstagram(
    message: java.lang.String,
    fileOrFileArray: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def shareViaInstagram(
    message: java.lang.String,
    fileOrFileArray: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareViaInstagram(message: java.lang.String, fileOrFileArray: js.Array[java.lang.String]): scala.Unit = js.native
  def shareViaInstagram(
    message: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def shareViaInstagram(
    message: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareViaSMS(options: cordovaDashPluginDashXDashSocialsharingLib.Anon_Image, phonenumbers: java.lang.String): scala.Unit = js.native
  def shareViaSMS(
    options: cordovaDashPluginDashXDashSocialsharingLib.Anon_Image,
    phonenumbers: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def shareViaSMS(
    options: cordovaDashPluginDashXDashSocialsharingLib.Anon_Image,
    phonenumbers: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareViaSMS(options: java.lang.String, phonenumbers: java.lang.String): scala.Unit = js.native
  def shareViaSMS(
    options: java.lang.String,
    phonenumbers: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def shareViaSMS(
    options: java.lang.String,
    phonenumbers: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareViaTwitter(message: java.lang.String): scala.Unit = js.native
  def shareViaTwitter(message: java.lang.String, file: java.lang.String): scala.Unit = js.native
  def shareViaTwitter(message: java.lang.String, file: java.lang.String, url: java.lang.String): scala.Unit = js.native
  def shareViaTwitter(
    message: java.lang.String,
    file: java.lang.String,
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def shareViaTwitter(
    message: java.lang.String,
    file: java.lang.String,
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareViaWhatsApp(message: java.lang.String): scala.Unit = js.native
  def shareViaWhatsApp(message: java.lang.String, fileOrFileArray: java.lang.String): scala.Unit = js.native
  def shareViaWhatsApp(message: java.lang.String, fileOrFileArray: java.lang.String, url: java.lang.String): scala.Unit = js.native
  def shareViaWhatsApp(
    message: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def shareViaWhatsApp(
    message: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareViaWhatsApp(message: java.lang.String, fileOrFileArray: js.Array[java.lang.String]): scala.Unit = js.native
  def shareViaWhatsApp(message: java.lang.String, fileOrFileArray: js.Array[java.lang.String], url: java.lang.String): scala.Unit = js.native
  def shareViaWhatsApp(
    message: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def shareViaWhatsApp(
    message: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareViaWhatsAppToReceiver(receiver: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def shareViaWhatsAppToReceiver(receiver: java.lang.String, message: java.lang.String, fileOrFileArray: java.lang.String): scala.Unit = js.native
  def shareViaWhatsAppToReceiver(
    receiver: java.lang.String,
    message: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String
  ): scala.Unit = js.native
  def shareViaWhatsAppToReceiver(
    receiver: java.lang.String,
    message: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def shareViaWhatsAppToReceiver(
    receiver: java.lang.String,
    message: java.lang.String,
    fileOrFileArray: java.lang.String,
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareViaWhatsAppToReceiver(receiver: java.lang.String, message: java.lang.String, fileOrFileArray: js.Array[java.lang.String]): scala.Unit = js.native
  def shareViaWhatsAppToReceiver(
    receiver: java.lang.String,
    message: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String
  ): scala.Unit = js.native
  def shareViaWhatsAppToReceiver(
    receiver: java.lang.String,
    message: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def shareViaWhatsAppToReceiver(
    receiver: java.lang.String,
    message: java.lang.String,
    fileOrFileArray: js.Array[java.lang.String],
    url: java.lang.String,
    successCallback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def shareWithOptions(options: ShareOptions): scala.Unit = js.native
  def shareWithOptions(options: ShareOptions, successCallback: js.Function1[/* result */ ShareResult, scala.Unit]): scala.Unit = js.native
  def shareWithOptions(
    options: ShareOptions,
    successCallback: js.Function1[/* result */ ShareResult, scala.Unit],
    errorCallback: js.Function1[/* errormsg */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

