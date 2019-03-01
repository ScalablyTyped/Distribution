package typings
package chromeDashAppsLib.chromeNs.mediaGalleriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawTag extends js.Object {
  /**
    * An unfiltered string->string interface of tags for the stream.
    */
  var tags: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Describes format of container or codec of stream, i.e. 'mp3' | 'h264'.
    */
  var `type`: java.lang.String
}

object RawTag {
  @scala.inline
  def apply(tags: org.scalablytyped.runtime.StringDictionary[java.lang.String], `type`: java.lang.String): RawTag = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[RawTag]
  }
}

