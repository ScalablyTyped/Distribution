package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageDataSourceResult extends StObject {
  
  /**
    * The data source type that generated usage.
    */
  var DataSource: js.UndefOr[typings.awsSdk.guarddutyMod.DataSource] = js.native
  
  /**
    * Represents the total of usage for the specified data source.
    */
  var Total: js.UndefOr[typings.awsSdk.guarddutyMod.Total] = js.native
}
object UsageDataSourceResult {
  
  @scala.inline
  def apply(): UsageDataSourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageDataSourceResult]
  }
  
  @scala.inline
  implicit class UsageDataSourceResultMutableBuilder[Self <: UsageDataSourceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    @scala.inline
    def setTotal(value: Total): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
