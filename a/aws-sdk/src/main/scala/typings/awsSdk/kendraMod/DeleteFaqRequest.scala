package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFaqRequest extends StObject {
  
  /**
    * The identifier of the FAQ to remove.
    */
  var Id: FaqId
  
  /**
    * The index to remove the FAQ from.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId
}
object DeleteFaqRequest {
  
  inline def apply(Id: FaqId, IndexId: IndexId): DeleteFaqRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFaqRequest]
  }
  
  extension [Self <: DeleteFaqRequest](x: Self) {
    
    inline def setId(value: FaqId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
