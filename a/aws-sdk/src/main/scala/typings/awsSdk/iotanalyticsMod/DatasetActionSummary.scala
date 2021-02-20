package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetActionSummary extends StObject {
  
  /**
    * The name of the action that automatically creates the dataset's contents.
    */
  var actionName: js.UndefOr[DatasetActionName] = js.native
  
  /**
    * The type of action by which the dataset's contents are automatically created.
    */
  var actionType: js.UndefOr[DatasetActionType] = js.native
}
object DatasetActionSummary {
  
  @scala.inline
  def apply(): DatasetActionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetActionSummary]
  }
  
  @scala.inline
  implicit class DatasetActionSummaryMutableBuilder[Self <: DatasetActionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionName(value: DatasetActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    @scala.inline
    def setActionType(value: DatasetActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
  }
}
