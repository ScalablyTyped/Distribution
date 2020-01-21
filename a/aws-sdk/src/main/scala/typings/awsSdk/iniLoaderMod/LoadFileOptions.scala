package typings.awsSdk.iniLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadFileOptions extends js.Object {
  var filename: js.UndefOr[String] = js.native
  var isConfig: js.UndefOr[Boolean] = js.native
}

object LoadFileOptions {
  @scala.inline
  def apply(filename: String = null, isConfig: js.UndefOr[Boolean] = js.undefined): LoadFileOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(isConfig)) __obj.updateDynamic("isConfig")(isConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadFileOptions]
  }
}

