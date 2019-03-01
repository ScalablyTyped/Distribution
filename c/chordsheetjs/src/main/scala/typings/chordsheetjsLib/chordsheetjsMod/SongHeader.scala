package typings
package chordsheetjsLib.chordsheetjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SongHeader extends js.Object {
  var subtitle: java.lang.String
  var title: java.lang.String
}

object SongHeader {
  @scala.inline
  def apply(subtitle: java.lang.String, title: java.lang.String): SongHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subtitle")(subtitle)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SongHeader]
  }
}

