package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIndexResponse extends StObject {
  
  /**
    * The unique identifier of the index. Use this identifier when you query an index, set up a data source, or index a document.
    */
  var Id: js.UndefOr[IndexId] = js.undefined
}
object CreateIndexResponse {
  
  @scala.inline
  def apply(): CreateIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIndexResponse]
  }
  
  @scala.inline
  implicit class CreateIndexResponseMutableBuilder[Self <: CreateIndexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: IndexId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
