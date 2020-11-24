package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapIterationEventDetails extends js.Object {
  
  /**
    * The index of the array belonging to the Map state iteration.
    */
  var index: js.UndefOr[UnsignedInteger] = js.native
  
  /**
    * The name of the iteration’s parent Map state.
    */
  var name: js.UndefOr[Name] = js.native
}
object MapIterationEventDetails {
  
  @scala.inline
  def apply(): MapIterationEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapIterationEventDetails]
  }
  
  @scala.inline
  implicit class MapIterationEventDetailsOps[Self <: MapIterationEventDetails] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: UnsignedInteger): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
