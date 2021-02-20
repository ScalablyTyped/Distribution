package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionCriteria extends StObject {
  
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
  implicit class SelectionCriteriaMutableBuilder[Self <: SelectionCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimiter(value: StorageLensPrefixLevelDelimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    @scala.inline
    def setMaxDepth(value: StorageLensPrefixLevelMaxDepth): Self = StObject.set(x, "MaxDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDepthUndefined: Self = StObject.set(x, "MaxDepth", js.undefined)
    
    @scala.inline
    def setMinStorageBytesPercentage(value: MinStorageBytesPercentage): Self = StObject.set(x, "MinStorageBytesPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinStorageBytesPercentageUndefined: Self = StObject.set(x, "MinStorageBytesPercentage", js.undefined)
  }
}
