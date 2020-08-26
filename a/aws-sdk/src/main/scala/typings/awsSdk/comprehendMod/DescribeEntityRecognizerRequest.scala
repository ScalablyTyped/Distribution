package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEntityRecognizerRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer.
    */
  var EntityRecognizerArn: typings.awsSdk.comprehendMod.EntityRecognizerArn = js.native
}

object DescribeEntityRecognizerRequest {
  @scala.inline
  def apply(EntityRecognizerArn: EntityRecognizerArn): DescribeEntityRecognizerRequest = {
    val __obj = js.Dynamic.literal(EntityRecognizerArn = EntityRecognizerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEntityRecognizerRequest]
  }
  @scala.inline
  implicit class DescribeEntityRecognizerRequestOps[Self <: DescribeEntityRecognizerRequest] (val x: Self) extends AnyVal {
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
    def setEntityRecognizerArn(value: EntityRecognizerArn): Self = this.set("EntityRecognizerArn", value.asInstanceOf[js.Any])
  }
  
}

