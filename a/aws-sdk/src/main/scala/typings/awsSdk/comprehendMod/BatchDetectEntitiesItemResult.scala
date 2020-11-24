package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDetectEntitiesItemResult extends js.Object {
  
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
  implicit class BatchDetectEntitiesItemResultOps[Self <: BatchDetectEntitiesItemResult] (val x: Self) extends AnyVal {
    
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
    def setEntitiesVarargs(value: Entity*): Self = this.set("Entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: ListOfEntities): Self = this.set("Entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("Entities", js.undefined)
    
    @scala.inline
    def setIndex(value: Integer): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("Index", js.undefined)
  }
}
