package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketTaggingOutput extends js.Object {
  /**
    * Contains the tag set.
    */
  var TagSet: typings.awsSdk.s3Mod.TagSet = js.native
}

object GetBucketTaggingOutput {
  @scala.inline
  def apply(TagSet: TagSet): GetBucketTaggingOutput = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBucketTaggingOutput]
  }
}

