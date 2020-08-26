package typings.awsSdkClientS3Node.typesMetricsFilterMod

import typings.awsSdkClientS3Node.typesMetricsAndOperatorMod.MetricsAndOperator
import typings.awsSdkClientS3Node.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsFilter extends js.Object {
  /**
    * <p>A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.</p>
    */
  var And: js.UndefOr[MetricsAndOperator] = js.native
  /**
    * <p>The prefix used when evaluating a metrics filter.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * <p>The tag used when evaluating a metrics filter.</p>
    */
  var Tag: js.UndefOr[typings.awsSdkClientS3Node.typesTagMod.Tag] = js.native
}

object MetricsFilter {
  @scala.inline
  def apply(): MetricsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsFilter]
  }
  @scala.inline
  implicit class MetricsFilterOps[Self <: MetricsFilter] (val x: Self) extends AnyVal {
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
    def setAnd(value: MetricsAndOperator): Self = this.set("And", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnd: Self = this.set("And", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    @scala.inline
    def setTag(value: Tag): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

