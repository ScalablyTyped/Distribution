package typings.awsSdkClientS3Node.typesTaggingMod

import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledTagging extends Tagging {
  /**
    * _TagSet shape
    */
  @JSName("TagSet")
  var TagSet_UnmarshalledTagging: js.Array[UnmarshalledTag]
}

object UnmarshalledTagging {
  @scala.inline
  def apply(TagSet: js.Array[UnmarshalledTag]): UnmarshalledTagging = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTagging]
  }
}

