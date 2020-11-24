package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePlacementResponse extends js.Object {
  
  /**
    * An object describing the placement.
    */
  var placement: PlacementDescription = js.native
}
object DescribePlacementResponse {
  
  @scala.inline
  def apply(placement: PlacementDescription): DescribePlacementResponse = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePlacementResponse]
  }
  
  @scala.inline
  implicit class DescribePlacementResponseOps[Self <: DescribePlacementResponse] (val x: Self) extends AnyVal {
    
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
    def setPlacement(value: PlacementDescription): Self = this.set("placement", value.asInstanceOf[js.Any])
  }
}
