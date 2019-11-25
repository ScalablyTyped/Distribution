package typings.chromeDashApps.chrome.mediaGalleries

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawTag extends js.Object {
  /**
    * An unfiltered string->string interface of tags for the stream.
    */
  var tags: StringDictionary[String]
  /**
    * Describes format of container or codec of stream, i.e. 'mp3' | 'h264'.
    */
  var `type`: String
}

object RawTag {
  @scala.inline
  def apply(tags: StringDictionary[String], `type`: String): RawTag = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawTag]
  }
}

