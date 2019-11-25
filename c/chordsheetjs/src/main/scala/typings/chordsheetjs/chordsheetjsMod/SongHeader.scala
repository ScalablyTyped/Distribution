package typings.chordsheetjs.chordsheetjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SongHeader extends js.Object {
  var subtitle: String
  var title: String
}

object SongHeader {
  @scala.inline
  def apply(subtitle: String, title: String): SongHeader = {
    val __obj = js.Dynamic.literal(subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SongHeader]
  }
}

