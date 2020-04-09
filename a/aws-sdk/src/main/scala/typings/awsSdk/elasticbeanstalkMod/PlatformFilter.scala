package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformFilter extends js.Object {
  /**
    * The operator to apply to the Type with each of the Values. Valid values: = | != | &lt; | &lt;= | &gt; | &gt;= | contains | begins_with | ends_with 
    */
  var Operator: js.UndefOr[PlatformFilterOperator] = js.native
  /**
    * The platform version attribute to which the filter values are applied. Valid values: PlatformName | PlatformVersion | PlatformStatus | PlatformBranchName | PlatformLifecycleState | PlatformOwner | SupportedTier | SupportedAddon | ProgrammingLanguageName | OperatingSystemName 
    */
  var Type: js.UndefOr[PlatformFilterType] = js.native
  /**
    * The list of values applied to the filtering platform version attribute. Only one value is supported for all current operators. The following list shows valid filter values for some filter attributes.    PlatformStatus: Creating | Failed | Ready | Deleting | Deleted     PlatformLifecycleState: recommended     SupportedTier: WebServer/Standard | Worker/SQS/HTTP     SupportedAddon: Log/S3 | Monitoring/Healthd | WorkerDaemon/SQSD   
    */
  var Values: js.UndefOr[PlatformFilterValueList] = js.native
}

object PlatformFilter {
  @scala.inline
  def apply(
    Operator: PlatformFilterOperator = null,
    Type: PlatformFilterType = null,
    Values: PlatformFilterValueList = null
  ): PlatformFilter = {
    val __obj = js.Dynamic.literal()
    if (Operator != null) __obj.updateDynamic("Operator")(Operator.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformFilter]
  }
}

