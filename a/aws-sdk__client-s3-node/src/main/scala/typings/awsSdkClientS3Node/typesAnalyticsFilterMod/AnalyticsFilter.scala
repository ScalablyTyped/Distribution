package typings.awsSdkClientS3Node.typesAnalyticsFilterMod

import typings.awsSdkClientS3Node.typesAnalyticsAndOperatorMod.AnalyticsAndOperator
import typings.awsSdkClientS3Node.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsFilter extends js.Object {
  
  /**
    * <p>A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must have at least two predicates.</p>
    */
  var And: js.UndefOr[AnalyticsAndOperator] = js.native
  
  /**
    * <p>The prefix to use when evaluating an analytics filter.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  
  /**
    * <p>The tag to use when evaluating an analytics filter.</p>
    */
  var Tag: js.UndefOr[typings.awsSdkClientS3Node.typesTagMod.Tag] = js.native
}
object AnalyticsFilter {
  
  @scala.inline
  def apply(): AnalyticsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsFilter]
  }
  
  @scala.inline
  implicit class AnalyticsFilterOps[Self <: AnalyticsFilter] (val x: Self) extends AnyVal {
    
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
    def setAnd(value: AnalyticsAndOperator): Self = this.set("And", value.asInstanceOf[js.Any])
    
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
