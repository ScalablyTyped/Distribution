package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformFilter extends StObject {
  
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
  implicit class PlatformFilterMutableBuilder[Self <: PlatformFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperator(value: PlatformFilterOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "Operator", js.undefined)
    
    @scala.inline
    def setType(value: PlatformFilterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValues(value: PlatformFilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: PlatformFilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
