package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobDataAttributes extends js.Object {
  /**
    * Declares that your content is free of personally identifiable information or adult content. Amazon SageMaker may restrict the Amazon Mechanical Turk workers that can view your task based on this information.
    */
  var ContentClassifiers: js.UndefOr[typings.awsSdk.sagemakerMod.ContentClassifiers] = js.native
}

object LabelingJobDataAttributes {
  @scala.inline
  def apply(): LabelingJobDataAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelingJobDataAttributes]
  }
  @scala.inline
  implicit class LabelingJobDataAttributesOps[Self <: LabelingJobDataAttributes] (val x: Self) extends AnyVal {
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
    def setContentClassifiersVarargs(value: ContentClassifier*): Self = this.set("ContentClassifiers", js.Array(value :_*))
    @scala.inline
    def setContentClassifiers(value: ContentClassifiers): Self = this.set("ContentClassifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentClassifiers: Self = this.set("ContentClassifiers", js.undefined)
  }
  
}

