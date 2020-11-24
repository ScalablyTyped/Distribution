package typings.cordovarduino.Cordovardunio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerialOptions extends js.Object {
  
  /**
    * @defaultValue 9600
    */
  var baudRate: js.UndefOr[Double] = js.native
  
  /**
    * @defaultValue 8
    */
  var dataBits: js.UndefOr[Double] = js.native
  
  /**
    * @defaultValue 0
    */
  var parity: js.UndefOr[Double] = js.native
  
  /**
    * @defaultValue 1
    */
  var stopBits: js.UndefOr[Double] = js.native
}
object SerialOptions {
  
  @scala.inline
  def apply(): SerialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerialOptions]
  }
  
  @scala.inline
  implicit class SerialOptionsOps[Self <: SerialOptions] (val x: Self) extends AnyVal {
    
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
    def setBaudRate(value: Double): Self = this.set("baudRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaudRate: Self = this.set("baudRate", js.undefined)
    
    @scala.inline
    def setDataBits(value: Double): Self = this.set("dataBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataBits: Self = this.set("dataBits", js.undefined)
    
    @scala.inline
    def setParity(value: Double): Self = this.set("parity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParity: Self = this.set("parity", js.undefined)
    
    @scala.inline
    def setStopBits(value: Double): Self = this.set("stopBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopBits: Self = this.set("stopBits", js.undefined)
  }
}
