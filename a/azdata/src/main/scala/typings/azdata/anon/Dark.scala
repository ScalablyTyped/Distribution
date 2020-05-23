package typings.azdata.anon

import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dark extends js.Object {
  var dark: String | Uri
  var light: String | Uri
}

object Dark {
  @scala.inline
  def apply(dark: String | Uri, light: String | Uri): Dark = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dark]
  }
}

