package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClassifierResponse extends js.Object {
  /**
    * The requested classifier.
    */
  var Classifier: js.UndefOr[typings.awsSdk.glueMod.Classifier] = js.native
}

object GetClassifierResponse {
  @scala.inline
  def apply(): GetClassifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClassifierResponse]
  }
  @scala.inline
  implicit class GetClassifierResponseOps[Self <: GetClassifierResponse] (val x: Self) extends AnyVal {
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
    def setClassifier(value: Classifier): Self = this.set("Classifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassifier: Self = this.set("Classifier", js.undefined)
  }
  
}

