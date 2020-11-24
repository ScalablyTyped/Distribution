package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionCriteria extends js.Object {
  
  /**
    * A container for the delimiter of the selection criteria being used.
    */
  var Delimiter: js.UndefOr[StorageLensPrefixLevelDelimiter] = js.native
  
  /**
    * The max depth of the selection criteria
    */
  var MaxDepth: js.UndefOr[StorageLensPrefixLevelMaxDepth] = js.native
  
  /**
    * The minimum number of storage bytes percentage whose metrics will be selected.  You must choose a value greater than or equal to 1.0. 
    */
  var MinStorageBytesPercentage: js.UndefOr[typings.awsSdk.s3controlMod.MinStorageBytesPercentage] = js.native
}
object SelectionCriteria {
  
  @scala.inline
  def apply(): SelectionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionCriteria]
  }
  
  @scala.inline
  implicit class SelectionCriteriaOps[Self <: SelectionCriteria] (val x: Self) extends AnyVal {
    
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
    def setDelimiter(value: StorageLensPrefixLevelDelimiter): Self = this.set("Delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("Delimiter", js.undefined)
    
    @scala.inline
    def setMaxDepth(value: StorageLensPrefixLevelMaxDepth): Self = this.set("MaxDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDepth: Self = this.set("MaxDepth", js.undefined)
    
    @scala.inline
    def setMinStorageBytesPercentage(value: MinStorageBytesPercentage): Self = this.set("MinStorageBytesPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinStorageBytesPercentage: Self = this.set("MinStorageBytesPercentage", js.undefined)
  }
}
