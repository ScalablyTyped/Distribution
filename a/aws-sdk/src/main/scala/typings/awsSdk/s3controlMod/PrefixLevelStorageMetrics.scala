package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixLevelStorageMetrics extends js.Object {
  
  /**
    * A container for whether prefix-level storage metrics are enabled.
    */
  var IsEnabled: js.UndefOr[typings.awsSdk.s3controlMod.IsEnabled] = js.native
  
  var SelectionCriteria: js.UndefOr[typings.awsSdk.s3controlMod.SelectionCriteria] = js.native
}
object PrefixLevelStorageMetrics {
  
  @scala.inline
  def apply(): PrefixLevelStorageMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixLevelStorageMetrics]
  }
  
  @scala.inline
  implicit class PrefixLevelStorageMetricsOps[Self <: PrefixLevelStorageMetrics] (val x: Self) extends AnyVal {
    
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
    def setIsEnabled(value: IsEnabled): Self = this.set("IsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("IsEnabled", js.undefined)
    
    @scala.inline
    def setSelectionCriteria(value: SelectionCriteria): Self = this.set("SelectionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionCriteria: Self = this.set("SelectionCriteria", js.undefined)
  }
}
