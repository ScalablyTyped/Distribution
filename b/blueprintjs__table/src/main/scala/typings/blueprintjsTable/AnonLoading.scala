package typings.blueprintjsTable

import typings.blueprintjsTable.renderModeMod.RenderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoading extends js.Object {
  var loading: Boolean
  var renderMode: RenderMode
}

object AnonLoading {
  @scala.inline
  def apply(loading: Boolean, renderMode: RenderMode): AnonLoading = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLoading]
  }
}

