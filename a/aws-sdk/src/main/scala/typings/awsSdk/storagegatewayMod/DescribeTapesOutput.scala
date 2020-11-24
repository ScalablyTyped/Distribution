package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTapesOutput extends js.Object {
  
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
  implicit class DescribeTapesOutputOps[Self <: DescribeTapesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setTapesVarargs(value: Tape*): Self = this.set("Tapes", js.Array(value :_*))
    
    @scala.inline
    def setTapes(value: Tapes): Self = this.set("Tapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTapes: Self = this.set("Tapes", js.undefined)
  }
}
