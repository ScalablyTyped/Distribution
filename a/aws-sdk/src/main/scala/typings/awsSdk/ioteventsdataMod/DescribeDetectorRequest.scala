package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDetectorRequest extends js.Object {
  
  /**
    * The name of the detector model whose detectors (instances) you want information about.
    */
  var detectorModelName: DetectorModelName = js.native
  
  /**
    * A filter used to limit results to detectors (instances) created because of the given key ID.
    */
  var keyValue: js.UndefOr[KeyValue] = js.native
}
object DescribeDetectorRequest {
  
  @scala.inline
  def apply(detectorModelName: DetectorModelName): DescribeDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorRequest]
  }
  
  @scala.inline
  implicit class DescribeDetectorRequestOps[Self <: DescribeDetectorRequest] (val x: Self) extends AnyVal {
    
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
    def setDetectorModelName(value: DetectorModelName): Self = this.set("detectorModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyValue(value: KeyValue): Self = this.set("keyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyValue: Self = this.set("keyValue", js.undefined)
  }
}
