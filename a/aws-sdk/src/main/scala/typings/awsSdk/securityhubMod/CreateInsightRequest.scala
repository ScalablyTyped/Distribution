package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInsightRequest extends js.Object {
  /**
    * One or more attributes used to filter the findings included in the insight. The insight only includes findings that match the criteria defined in the filters.
    */
  var Filters: AwsSecurityFindingFilters = js.native
  /**
    * The attribute used to group the findings for the insight. The grouping attribute identifies the type of item that the insight applies to. For example, if an insight is grouped by resource identifier, then the insight produces a list of resource identifiers.
    */
  var GroupByAttribute: NonEmptyString = js.native
  /**
    * The name of the custom insight to create.
    */
  var Name: NonEmptyString = js.native
}

object CreateInsightRequest {
  @scala.inline
  def apply(Filters: AwsSecurityFindingFilters, GroupByAttribute: NonEmptyString, Name: NonEmptyString): CreateInsightRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], GroupByAttribute = GroupByAttribute.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInsightRequest]
  }
}

