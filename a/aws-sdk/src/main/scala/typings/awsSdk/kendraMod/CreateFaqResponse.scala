package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFaqResponse extends StObject {
  
  /**
    * The unique identifier of the FAQ.
    */
  var Id: js.UndefOr[FaqId] = js.undefined
}
object CreateFaqResponse {
  
  @scala.inline
  def apply(): CreateFaqResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFaqResponse]
  }
  
  @scala.inline
  implicit class CreateFaqResponseMutableBuilder[Self <: CreateFaqResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: FaqId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
