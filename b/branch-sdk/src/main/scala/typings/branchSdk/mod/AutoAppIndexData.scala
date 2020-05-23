package typings.branchSdk.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoAppIndexData extends js.Object {
  var androidPackageName: js.UndefOr[String] = js.undefined
  var androidURL: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[StringDictionary[CustomLinkData]] = js.undefined
  var iosAppId: js.UndefOr[String] = js.undefined
  var iosURL: js.UndefOr[String] = js.undefined
}

object AutoAppIndexData {
  @scala.inline
  def apply(
    androidPackageName: String = null,
    androidURL: String = null,
    data: StringDictionary[CustomLinkData] = null,
    iosAppId: String = null,
    iosURL: String = null
  ): AutoAppIndexData = {
    val __obj = js.Dynamic.literal()
    if (androidPackageName != null) __obj.updateDynamic("androidPackageName")(androidPackageName.asInstanceOf[js.Any])
    if (androidURL != null) __obj.updateDynamic("androidURL")(androidURL.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (iosAppId != null) __obj.updateDynamic("iosAppId")(iosAppId.asInstanceOf[js.Any])
    if (iosURL != null) __obj.updateDynamic("iosURL")(iosURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoAppIndexData]
  }
}

