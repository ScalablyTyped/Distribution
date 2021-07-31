package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIndexRequest extends StObject {
  
  /**
    * The identifier of the index to delete.
    */
  var Id: IndexId
}
object DeleteIndexRequest {
  
  @scala.inline
  def apply(Id: IndexId): DeleteIndexRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIndexRequest]
  }
  
  @scala.inline
  implicit class DeleteIndexRequestMutableBuilder[Self <: DeleteIndexRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: IndexId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
