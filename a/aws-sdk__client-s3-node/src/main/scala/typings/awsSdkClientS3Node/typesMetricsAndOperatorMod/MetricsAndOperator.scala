package typings.awsSdkClientS3Node.typesMetricsAndOperatorMod

import typings.awsSdkClientS3Node.typesTagMod.Tag
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsAndOperator extends js.Object {
  /**
    * <p>The prefix used when evaluating an AND predicate.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * <p>The list of tags used when evaluating an AND predicate.</p>
    */
  var Tags: js.UndefOr[js.Array[Tag] | Iterable[Tag]] = js.native
}

object MetricsAndOperator {
  @scala.inline
  def apply(): MetricsAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsAndOperator]
  }
  @scala.inline
  implicit class MetricsAndOperatorOps[Self <: MetricsAndOperator] (val x: Self) extends AnyVal {
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
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[Tag] | Iterable[Tag]): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

