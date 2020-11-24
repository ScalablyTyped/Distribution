package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): PlatformFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformFilter]
  }
  
  @scala.inline
  implicit class PlatformFilterOps[Self <: PlatformFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOperator(value: PlatformFilterOperator): Self = this.set("Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("Operator", js.undefined)
    
    @scala.inline
    def setType(value: PlatformFilterType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: PlatformFilterValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: PlatformFilterValueList): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
