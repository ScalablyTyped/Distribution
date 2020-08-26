package typings.awsSdkClientCodecommitNode.typesMergeMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeMetadata extends js.Object {
  /**
    * <p>A Boolean value indicating whether the merge has been made.</p>
    */
  var isMerged: js.UndefOr[Boolean] = js.native
  /**
    * <p>The Amazon Resource Name (ARN) of the user who merged the branches.</p>
    */
  var mergedBy: js.UndefOr[String] = js.native
}

object MergeMetadata {
  @scala.inline
  def apply(): MergeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeMetadata]
  }
  @scala.inline
  implicit class MergeMetadataOps[Self <: MergeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsMerged(value: Boolean): Self = this.set("isMerged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMerged: Self = this.set("isMerged", js.undefined)
    @scala.inline
    def setMergedBy(value: String): Self = this.set("mergedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergedBy: Self = this.set("mergedBy", js.undefined)
  }
  
}

