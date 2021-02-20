package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPercentilesResponse extends StObject {
  
  /**
    * The percentile values of the aggregated fields.
    */
  var percentiles: js.UndefOr[Percentiles] = js.native
}
object GetPercentilesResponse {
  
  @scala.inline
  def apply(): GetPercentilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPercentilesResponse]
  }
  
  @scala.inline
  implicit class GetPercentilesResponseMutableBuilder[Self <: GetPercentilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPercentiles(value: Percentiles): Self = StObject.set(x, "percentiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentilesUndefined: Self = StObject.set(x, "percentiles", js.undefined)
    
    @scala.inline
    def setPercentilesVarargs(value: PercentPair*): Self = StObject.set(x, "percentiles", js.Array(value :_*))
  }
}
