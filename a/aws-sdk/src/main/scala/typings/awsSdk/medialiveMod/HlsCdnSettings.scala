package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsCdnSettings extends js.Object {
  var HlsAkamaiSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsAkamaiSettings] = js.native
  var HlsBasicPutSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsBasicPutSettings] = js.native
  var HlsMediaStoreSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsMediaStoreSettings] = js.native
  var HlsWebdavSettings: js.UndefOr[typings.awsSdk.medialiveMod.HlsWebdavSettings] = js.native
}

object HlsCdnSettings {
  @scala.inline
  def apply(
    HlsAkamaiSettings: HlsAkamaiSettings = null,
    HlsBasicPutSettings: HlsBasicPutSettings = null,
    HlsMediaStoreSettings: HlsMediaStoreSettings = null,
    HlsWebdavSettings: HlsWebdavSettings = null
  ): HlsCdnSettings = {
    val __obj = js.Dynamic.literal()
    if (HlsAkamaiSettings != null) __obj.updateDynamic("HlsAkamaiSettings")(HlsAkamaiSettings.asInstanceOf[js.Any])
    if (HlsBasicPutSettings != null) __obj.updateDynamic("HlsBasicPutSettings")(HlsBasicPutSettings.asInstanceOf[js.Any])
    if (HlsMediaStoreSettings != null) __obj.updateDynamic("HlsMediaStoreSettings")(HlsMediaStoreSettings.asInstanceOf[js.Any])
    if (HlsWebdavSettings != null) __obj.updateDynamic("HlsWebdavSettings")(HlsWebdavSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsCdnSettings]
  }
}

