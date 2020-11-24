package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageDataSourceResult extends js.Object {
  
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
  implicit class UsageDataSourceResultOps[Self <: UsageDataSourceResult] (val x: Self) extends AnyVal {
    
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
    def setDataSource(value: DataSource): Self = this.set("DataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("DataSource", js.undefined)
    
    @scala.inline
    def setTotal(value: Total): Self = this.set("Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
  }
}
