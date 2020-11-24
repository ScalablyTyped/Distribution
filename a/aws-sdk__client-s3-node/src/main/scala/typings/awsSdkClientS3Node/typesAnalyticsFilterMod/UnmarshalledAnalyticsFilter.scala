package typings.awsSdkClientS3Node.typesAnalyticsFilterMod

import typings.awsSdkClientS3Node.typesAnalyticsAndOperatorMod.UnmarshalledAnalyticsAndOperator
import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledAnalyticsFilter extends AnalyticsFilter {
  
  /**
    * <p>A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must have at least two predicates.</p>
    */
  @JSName("And")
  var And_UnmarshalledAnalyticsFilter: js.UndefOr[UnmarshalledAnalyticsAndOperator] = js.native
  
  /**
    * <p>The tag to use when evaluating an analytics filter.</p>
    */
  @JSName("Tag")
  var Tag_UnmarshalledAnalyticsFilter: js.UndefOr[UnmarshalledTag] = js.native
}
object UnmarshalledAnalyticsFilter {
  
  @scala.inline
  def apply(): UnmarshalledAnalyticsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAnalyticsFilter]
  }
  
  @scala.inline
  implicit class UnmarshalledAnalyticsFilterOps[Self <: UnmarshalledAnalyticsFilter] (val x: Self) extends AnyVal {
    
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
    def setAnd(value: UnmarshalledAnalyticsAndOperator): Self = this.set("And", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnd: Self = this.set("And", js.undefined)
    
    @scala.inline
    def setTag(value: UnmarshalledTag): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
}
