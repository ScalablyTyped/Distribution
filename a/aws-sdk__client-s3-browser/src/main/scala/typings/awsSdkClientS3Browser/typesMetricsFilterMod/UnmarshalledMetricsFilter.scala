package typings.awsSdkClientS3Browser.typesMetricsFilterMod

import typings.awsSdkClientS3Browser.typesMetricsAndOperatorMod.UnmarshalledMetricsAndOperator
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledMetricsFilter extends MetricsFilter {
  
  /**
    * <p>A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.</p>
    */
  @JSName("And")
  var And_UnmarshalledMetricsFilter: js.UndefOr[UnmarshalledMetricsAndOperator] = js.native
  
  /**
    * <p>The tag used when evaluating a metrics filter.</p>
    */
  @JSName("Tag")
  var Tag_UnmarshalledMetricsFilter: js.UndefOr[UnmarshalledTag] = js.native
}
object UnmarshalledMetricsFilter {
  
  @scala.inline
  def apply(): UnmarshalledMetricsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledMetricsFilter]
  }
  
  @scala.inline
  implicit class UnmarshalledMetricsFilterOps[Self <: UnmarshalledMetricsFilter] (val x: Self) extends AnyVal {
    
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
    def setAnd(value: UnmarshalledMetricsAndOperator): Self = this.set("And", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnd: Self = this.set("And", js.undefined)
    
    @scala.inline
    def setTag(value: UnmarshalledTag): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
}
