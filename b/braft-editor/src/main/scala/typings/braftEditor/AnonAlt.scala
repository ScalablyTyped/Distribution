package typings.braftEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlt extends js.Object {
  var alt: String
  var autoPlay: Boolean
  var controls: Boolean
  var id: String
  var loop: Boolean
  var poster: String
  var title: String
}

object AnonAlt {
  @scala.inline
  def apply(
    alt: String,
    autoPlay: Boolean,
    controls: Boolean,
    id: String,
    loop: Boolean,
    poster: String,
    title: String
  ): AnonAlt = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], autoPlay = autoPlay.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], poster = poster.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlt]
  }
}

