package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTapeWithBarcodeOutput extends js.Object {
  
  /**
    * A unique Amazon Resource Name (ARN) that represents the virtual tape that was created.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
}
object CreateTapeWithBarcodeOutput {
  
  @scala.inline
  def apply(): CreateTapeWithBarcodeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTapeWithBarcodeOutput]
  }
  
  @scala.inline
  implicit class CreateTapeWithBarcodeOutputOps[Self <: CreateTapeWithBarcodeOutput] (val x: Self) extends AnyVal {
    
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
    def setTapeARN(value: TapeARN): Self = this.set("TapeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTapeARN: Self = this.set("TapeARN", js.undefined)
  }
}
