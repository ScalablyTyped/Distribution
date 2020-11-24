package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDataIdentifiers extends js.Object {
  
  /**
    * The custom data identifiers that detected the data, and the number of occurrences of the data that each identifier detected.
    */
  var detections: js.UndefOr[CustomDetections] = js.native
  
  /**
    * The total number of occurrences of the data that was detected by the custom data identifiers and produced the finding.
    */
  var totalCount: js.UndefOr[long] = js.native
}
object CustomDataIdentifiers {
  
  @scala.inline
  def apply(): CustomDataIdentifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDataIdentifiers]
  }
  
  @scala.inline
  implicit class CustomDataIdentifiersOps[Self <: CustomDataIdentifiers] (val x: Self) extends AnyVal {
    
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
    def setDetectionsVarargs(value: CustomDetection*): Self = this.set("detections", js.Array(value :_*))
    
    @scala.inline
    def setDetections(value: CustomDetections): Self = this.set("detections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetections: Self = this.set("detections", js.undefined)
    
    @scala.inline
    def setTotalCount(value: long): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
  }
}
