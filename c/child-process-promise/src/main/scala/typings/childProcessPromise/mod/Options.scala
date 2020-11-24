package typings.childProcessPromise.mod

import typings.childProcessPromise.childProcessPromiseStrings.stderr
import typings.childProcessPromise.childProcessPromiseStrings.stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Pass an additional capture option to buffer the result of stdout and/or stderr
    * Default: []
    */
  var capture: js.UndefOr[
    (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
  ] = js.native
  
  /**
    * Array of the numbers that should be interpreted as successful execution codes
    * Default: [0]
    */
  var successfulExitCodes: js.UndefOr[js.Array[Double]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCaptureVarargs(value: (stdout | stderr | js.Any)*): Self = this.set("capture", js.Array(value :_*))
    
    @scala.inline
    def setCapture(value: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    
    @scala.inline
    def setSuccessfulExitCodesVarargs(value: Double*): Self = this.set("successfulExitCodes", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfulExitCodes(value: js.Array[Double]): Self = this.set("successfulExitCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessfulExitCodes: Self = this.set("successfulExitCodes", js.undefined)
  }
}
