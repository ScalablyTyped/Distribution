package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInventoryResult extends StObject {
  
  /**
    * Collection of inventory entities such as a collection of instance inventory. 
    */
  var Entities: js.UndefOr[InventoryResultEntityList] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object GetInventoryResult {
  
  @scala.inline
  def apply(): GetInventoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInventoryResult]
  }
  
  @scala.inline
  implicit class GetInventoryResultMutableBuilder[Self <: GetInventoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: InventoryResultEntityList): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "Entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: InventoryResultEntity*): Self = StObject.set(x, "Entities", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
