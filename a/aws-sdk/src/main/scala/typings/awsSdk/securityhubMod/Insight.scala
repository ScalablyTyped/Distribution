package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Insight extends js.Object {
  
  /**
    * One or more attributes used to filter the findings included in the insight. The insight only includes findings that match the criteria defined in the filters.
    */
  var Filters: AwsSecurityFindingFilters = js.native
  
  /**
    * The grouping attribute for the insight's findings. Indicates how to group the matching findings, and identifies the type of item that the insight applies to. For example, if an insight is grouped by resource identifier, then the insight produces a list of resource identifiers.
    */
  var GroupByAttribute: NonEmptyString = js.native
  
  /**
    * The ARN of a Security Hub insight.
    */
  var InsightArn: NonEmptyString = js.native
  
  /**
    * The name of a Security Hub insight.
    */
  var Name: NonEmptyString = js.native
}
object Insight {
  
  @scala.inline
  def apply(
    Filters: AwsSecurityFindingFilters,
    GroupByAttribute: NonEmptyString,
    InsightArn: NonEmptyString,
    Name: NonEmptyString
  ): Insight = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], GroupByAttribute = GroupByAttribute.asInstanceOf[js.Any], InsightArn = InsightArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insight]
  }
  
  @scala.inline
  implicit class InsightOps[Self <: Insight] (val x: Self) extends AnyVal {
    
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
    def setFilters(value: AwsSecurityFindingFilters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByAttribute(value: NonEmptyString): Self = this.set("GroupByAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightArn(value: NonEmptyString): Self = this.set("InsightArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
