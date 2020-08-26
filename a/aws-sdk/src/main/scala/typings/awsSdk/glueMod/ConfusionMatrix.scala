package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfusionMatrix extends js.Object {
  /**
    * The number of matches in the data that the transform didn't find, in the confusion matrix for your transform.
    */
  var NumFalseNegatives: js.UndefOr[RecordsCount] = js.native
  /**
    * The number of nonmatches in the data that the transform incorrectly classified as a match, in the confusion matrix for your transform.
    */
  var NumFalsePositives: js.UndefOr[RecordsCount] = js.native
  /**
    * The number of nonmatches in the data that the transform correctly rejected, in the confusion matrix for your transform.
    */
  var NumTrueNegatives: js.UndefOr[RecordsCount] = js.native
  /**
    * The number of matches in the data that the transform correctly found, in the confusion matrix for your transform.
    */
  var NumTruePositives: js.UndefOr[RecordsCount] = js.native
}

object ConfusionMatrix {
  @scala.inline
  def apply(): ConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfusionMatrix]
  }
  @scala.inline
  implicit class ConfusionMatrixOps[Self <: ConfusionMatrix] (val x: Self) extends AnyVal {
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
    def setNumFalseNegatives(value: RecordsCount): Self = this.set("NumFalseNegatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumFalseNegatives: Self = this.set("NumFalseNegatives", js.undefined)
    @scala.inline
    def setNumFalsePositives(value: RecordsCount): Self = this.set("NumFalsePositives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumFalsePositives: Self = this.set("NumFalsePositives", js.undefined)
    @scala.inline
    def setNumTrueNegatives(value: RecordsCount): Self = this.set("NumTrueNegatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumTrueNegatives: Self = this.set("NumTrueNegatives", js.undefined)
    @scala.inline
    def setNumTruePositives(value: RecordsCount): Self = this.set("NumTruePositives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumTruePositives: Self = this.set("NumTruePositives", js.undefined)
  }
  
}

