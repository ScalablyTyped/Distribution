package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentTypeInfo extends js.Object {
  
  /**
    * The version of the model used to detect segments.
    */
  var ModelVersion: js.UndefOr[String] = js.native
  
  /**
    * The type of a segment (technical cue or shot detection).
    */
  var Type: js.UndefOr[SegmentType] = js.native
}
object SegmentTypeInfo {
  
  @scala.inline
  def apply(): SegmentTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentTypeInfo]
  }
  
  @scala.inline
  implicit class SegmentTypeInfoOps[Self <: SegmentTypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setModelVersion(value: String): Self = this.set("ModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelVersion: Self = this.set("ModelVersion", js.undefined)
    
    @scala.inline
    def setType(value: SegmentType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
