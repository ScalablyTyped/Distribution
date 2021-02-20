package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCardinalityResponse extends StObject {
  
  /**
    * The approximate count of unique values that match the query.
    */
  var cardinality: js.UndefOr[Count] = js.native
}
object GetCardinalityResponse {
  
  @scala.inline
  def apply(): GetCardinalityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCardinalityResponse]
  }
  
  @scala.inline
  implicit class GetCardinalityResponseMutableBuilder[Self <: GetCardinalityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardinality(value: Count): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardinalityUndefined: Self = StObject.set(x, "cardinality", js.undefined)
  }
}
