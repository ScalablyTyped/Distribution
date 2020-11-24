package typings.awsSdkClientS3Node.typesStorageClassAnalysisMod

import typings.awsSdkClientS3Node.typesStorageClassAnalysisDataExportMod.UnmarshalledStorageClassAnalysisDataExport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledStorageClassAnalysis extends StorageClassAnalysis {
  
  /**
    * <p>A container used to describe how data related to the storage class analysis should be exported.</p>
    */
  @JSName("DataExport")
  var DataExport_UnmarshalledStorageClassAnalysis: js.UndefOr[UnmarshalledStorageClassAnalysisDataExport] = js.native
}
object UnmarshalledStorageClassAnalysis {
  
  @scala.inline
  def apply(): UnmarshalledStorageClassAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledStorageClassAnalysis]
  }
  
  @scala.inline
  implicit class UnmarshalledStorageClassAnalysisOps[Self <: UnmarshalledStorageClassAnalysis] (val x: Self) extends AnyVal {
    
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
    def setDataExport(value: UnmarshalledStorageClassAnalysisDataExport): Self = this.set("DataExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataExport: Self = this.set("DataExport", js.undefined)
  }
}
