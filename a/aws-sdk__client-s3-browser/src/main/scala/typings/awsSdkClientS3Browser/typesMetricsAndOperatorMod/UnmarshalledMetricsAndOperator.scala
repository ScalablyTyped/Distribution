package typings.awsSdkClientS3Browser.typesMetricsAndOperatorMod

import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledMetricsAndOperator extends MetricsAndOperator {
  /**
    * <p>The list of tags used when evaluating an AND predicate.</p>
    */
  @JSName("Tags")
  var Tags_UnmarshalledMetricsAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.native
}

object UnmarshalledMetricsAndOperator {
  @scala.inline
  def apply(): UnmarshalledMetricsAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledMetricsAndOperator]
  }
  @scala.inline
  implicit class UnmarshalledMetricsAndOperatorOps[Self <: UnmarshalledMetricsAndOperator] (val x: Self) extends AnyVal {
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
    def setTagsVarargs(value: UnmarshalledTag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[UnmarshalledTag]): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

