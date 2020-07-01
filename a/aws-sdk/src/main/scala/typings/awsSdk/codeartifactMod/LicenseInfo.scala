package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseInfo extends js.Object {
  /**
    *  Name of the license. 
    */
  var name: js.UndefOr[String] = js.native
  /**
    *  The URL for license data. 
    */
  var url: js.UndefOr[String] = js.native
}

object LicenseInfo {
  @scala.inline
  def apply(name: String = null, url: String = null): LicenseInfo = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseInfo]
  }
}

