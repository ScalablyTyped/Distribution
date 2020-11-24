package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDetectorResponse extends js.Object {
  
  /**
    * Information about the detector (instance).
    */
  var detector: js.UndefOr[Detector] = js.native
}
object DescribeDetectorResponse {
  
  @scala.inline
  def apply(): DescribeDetectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDetectorResponse]
  }
  
  @scala.inline
  implicit class DescribeDetectorResponseOps[Self <: DescribeDetectorResponse] (val x: Self) extends AnyVal {
    
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
    def setDetector(value: Detector): Self = this.set("detector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetector: Self = this.set("detector", js.undefined)
  }
}
