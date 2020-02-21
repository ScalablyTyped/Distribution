package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreatIntelIndicator extends js.Object {
  /**
    * The category of a threat intelligence indicator.
    */
  var Category: js.UndefOr[ThreatIntelIndicatorCategory] = js.native
  /**
    * The date and time when the most recent instance of a threat intelligence indicator was observed.
    */
  var LastObservedAt: js.UndefOr[NonEmptyString] = js.native
  /**
    * The source of the threat intelligence indicator.
    */
  var Source: js.UndefOr[NonEmptyString] = js.native
  /**
    * The URL to the page or site where you can get more information about the threat intelligence indicator.
    */
  var SourceUrl: js.UndefOr[NonEmptyString] = js.native
  /**
    * The type of threat intelligence indicator.
    */
  var Type: js.UndefOr[ThreatIntelIndicatorType] = js.native
  /**
    * The value of a threat intelligence indicator.
    */
  var Value: js.UndefOr[NonEmptyString] = js.native
}

object ThreatIntelIndicator {
  @scala.inline
  def apply(
    Category: ThreatIntelIndicatorCategory = null,
    LastObservedAt: NonEmptyString = null,
    Source: NonEmptyString = null,
    SourceUrl: NonEmptyString = null,
    Type: ThreatIntelIndicatorType = null,
    Value: NonEmptyString = null
  ): ThreatIntelIndicator = {
    val __obj = js.Dynamic.literal()
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (LastObservedAt != null) __obj.updateDynamic("LastObservedAt")(LastObservedAt.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    if (SourceUrl != null) __obj.updateDynamic("SourceUrl")(SourceUrl.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreatIntelIndicator]
  }
}

