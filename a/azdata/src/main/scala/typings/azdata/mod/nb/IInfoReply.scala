package typings.azdata.mod.nb

import typings.azdata.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInfoReply extends js.Object {
  var banner: String
  var help_links: js.Array[Text]
  var implementation: String
  var implementation_version: String
  var language_info: ILanguageInfo
  var protocol_version: String
}

object IInfoReply {
  @scala.inline
  def apply(
    banner: String,
    help_links: js.Array[Text],
    implementation: String,
    implementation_version: String,
    language_info: ILanguageInfo,
    protocol_version: String
  ): IInfoReply = {
    val __obj = js.Dynamic.literal(banner = banner.asInstanceOf[js.Any], help_links = help_links.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], implementation_version = implementation_version.asInstanceOf[js.Any], language_info = language_info.asInstanceOf[js.Any], protocol_version = protocol_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfoReply]
  }
}

