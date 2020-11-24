package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetQualificationTypeResponse extends js.Object {
  
  /**
    *  The returned Qualification Type
    */
  var QualificationType: js.UndefOr[typings.awsSdk.mturkMod.QualificationType] = js.native
}
object GetQualificationTypeResponse {
  
  @scala.inline
  def apply(): GetQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQualificationTypeResponse]
  }
  
  @scala.inline
  implicit class GetQualificationTypeResponseOps[Self <: GetQualificationTypeResponse] (val x: Self) extends AnyVal {
    
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
    def setQualificationType(value: QualificationType): Self = this.set("QualificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualificationType: Self = this.set("QualificationType", js.undefined)
  }
}
