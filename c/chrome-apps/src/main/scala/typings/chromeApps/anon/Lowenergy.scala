package typings.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lowenergy extends js.Object {
  
  var low_energy: js.UndefOr[Boolean] = js.native
  
  var peripheral: js.UndefOr[Boolean] = js.native
  
  var socket: js.UndefOr[Boolean] = js.native
  
  var uuids: js.UndefOr[js.Array[String]] = js.native
}
object Lowenergy {
  
  @scala.inline
  def apply(): Lowenergy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lowenergy]
  }
  
  @scala.inline
  implicit class LowenergyOps[Self <: Lowenergy] (val x: Self) extends AnyVal {
    
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
    def setLow_energy(value: Boolean): Self = this.set("low_energy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLow_energy: Self = this.set("low_energy", js.undefined)
    
    @scala.inline
    def setPeripheral(value: Boolean): Self = this.set("peripheral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeripheral: Self = this.set("peripheral", js.undefined)
    
    @scala.inline
    def setSocket(value: Boolean): Self = this.set("socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
    
    @scala.inline
    def setUuidsVarargs(value: String*): Self = this.set("uuids", js.Array(value :_*))
    
    @scala.inline
    def setUuids(value: js.Array[String]): Self = this.set("uuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuids: Self = this.set("uuids", js.undefined)
  }
}
