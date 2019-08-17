package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTaggingMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTagMod._Tag
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Tagging extends js.Object {
  /**
    * _TagSet shape
    */
  var TagSet: js.Array[_Tag] | Iterable[_Tag]
}

object _Tagging {
  @scala.inline
  def apply(TagSet: js.Array[_Tag] | Iterable[_Tag]): _Tagging = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Tagging]
  }
}

