package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEntityRecognizerResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer.
    */
  var EntityRecognizerArn: js.UndefOr[typings.awsSdk.comprehendMod.EntityRecognizerArn] = js.native
}

object CreateEntityRecognizerResponse {
  @scala.inline
  def apply(): CreateEntityRecognizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEntityRecognizerResponse]
  }
  @scala.inline
  implicit class CreateEntityRecognizerResponseOps[Self <: CreateEntityRecognizerResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteEntityRecognizerArn: Self = this.set("EntityRecognizerArn", js.undefined)
  }
  
}

