package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDetectEntitiesItemResult extends StObject {
  
  /**
    * One or more Entity objects, one for each entity detected in the document.
    */
  var Entities: js.UndefOr[ListOfEntities] = js.native
  
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
}
object BatchDetectEntitiesItemResult {
  
  @scala.inline
  def apply(): BatchDetectEntitiesItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectEntitiesItemResult]
  }
  
  @scala.inline
  implicit class BatchDetectEntitiesItemResultMutableBuilder[Self <: BatchDetectEntitiesItemResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: ListOfEntities): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "Entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "Entities", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Integer): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
  }
}
