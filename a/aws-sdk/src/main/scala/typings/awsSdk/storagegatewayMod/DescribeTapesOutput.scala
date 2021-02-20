package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTapesOutput extends StObject {
  
  /**
    * An opaque string which can be used as part of a subsequent DescribeTapes call to retrieve the next page of results. If a response does not contain a marker, then there are no more results to be retrieved.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
  
  /**
    * An array of virtual tape descriptions.
    */
  var Tapes: js.UndefOr[typings.awsSdk.storagegatewayMod.Tapes] = js.native
}
object DescribeTapesOutput {
  
  @scala.inline
  def apply(): DescribeTapesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTapesOutput]
  }
  
  @scala.inline
  implicit class DescribeTapesOutputMutableBuilder[Self <: DescribeTapesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setTapes(value: Tapes): Self = StObject.set(x, "Tapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapesUndefined: Self = StObject.set(x, "Tapes", js.undefined)
    
    @scala.inline
    def setTapesVarargs(value: Tape*): Self = StObject.set(x, "Tapes", js.Array(value :_*))
  }
}
