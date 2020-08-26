package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityRecognizerEntityList extends js.Object {
  /**
    * Specifies the Amazon S3 location where the entity list is located. The URI must be in the same region as the API endpoint that you are calling.
    */
  var S3Uri: typings.awsSdk.comprehendMod.S3Uri = js.native
}

object EntityRecognizerEntityList {
  @scala.inline
  def apply(S3Uri: S3Uri): EntityRecognizerEntityList = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerEntityList]
  }
  @scala.inline
  implicit class EntityRecognizerEntityListOps[Self <: EntityRecognizerEntityList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setS3Uri(value: S3Uri): Self = this.set("S3Uri", value.asInstanceOf[js.Any])
  }
  
}

