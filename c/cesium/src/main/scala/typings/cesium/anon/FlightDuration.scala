package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlightDuration extends js.Object {
  
  var flightDuration: js.UndefOr[Double] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var scene: typings.cesium.mod.Scene = js.native
  
  var url: js.UndefOr[String] = js.native
}
object FlightDuration {
  
  @scala.inline
  def apply(scene: typings.cesium.mod.Scene): FlightDuration = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlightDuration]
  }
  
  @scala.inline
  implicit class FlightDurationOps[Self <: FlightDuration] (val x: Self) extends AnyVal {
    
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
    def setScene(value: typings.cesium.mod.Scene): Self = this.set("scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlightDuration(value: Double): Self = this.set("flightDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlightDuration: Self = this.set("flightDuration", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
