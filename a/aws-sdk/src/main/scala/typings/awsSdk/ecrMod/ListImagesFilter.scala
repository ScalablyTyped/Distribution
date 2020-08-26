package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImagesFilter extends js.Object {
  /**
    * The tag status with which to filter your ListImages results. You can filter results based on whether they are TAGGED or UNTAGGED.
    */
  var tagStatus: js.UndefOr[TagStatus] = js.native
}

object ListImagesFilter {
  @scala.inline
  def apply(): ListImagesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImagesFilter]
  }
  @scala.inline
  implicit class ListImagesFilterOps[Self <: ListImagesFilter] (val x: Self) extends AnyVal {
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
    def setTagStatus(value: TagStatus): Self = this.set("tagStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagStatus: Self = this.set("tagStatus", js.undefined)
  }
  
}

