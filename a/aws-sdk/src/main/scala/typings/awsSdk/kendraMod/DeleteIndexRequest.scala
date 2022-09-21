package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIndexRequest extends StObject {
  
  /**
    * The identifier of the index you want to delete.
    */
  var Id: IndexId
}
object DeleteIndexRequest {
  
  inline def apply(Id: IndexId): DeleteIndexRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIndexRequest]
  }
  
  extension [Self <: DeleteIndexRequest](x: Self) {
    
    inline def setId(value: IndexId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
