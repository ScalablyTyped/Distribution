package typings.awsSdkClientS3Node.typesTaggingMod

import typings.awsSdkClientS3Node.typesTagMod.Tag
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tagging extends js.Object {
  /**
    * _TagSet shape
    */
  var TagSet: js.Array[Tag] | Iterable[Tag]
}

object Tagging {
  @scala.inline
  def apply(TagSet: js.Array[Tag] | Iterable[Tag]): Tagging = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tagging]
  }
}

