package typings.awsSdkClientPinpointBrowser.typesImportJobResponseMod

import typings.awsSdkClientPinpointBrowser.typesImportJobResourceMod.UnmarshalledImportJobResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledImportJobResponse extends ImportJobResponse {
  
  /**
    * The import job settings.
    */
  @JSName("Definition")
  var Definition_UnmarshalledImportJobResponse: js.UndefOr[UnmarshalledImportJobResource] = js.native
  
  /**
    * Provides up to 100 of the first failed entries for the job, if any exist.
    */
  @JSName("Failures")
  var Failures_UnmarshalledImportJobResponse: js.UndefOr[js.Array[String]] = js.native
}
object UnmarshalledImportJobResponse {
  
  @scala.inline
  def apply(): UnmarshalledImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledImportJobResponse]
  }
  
  @scala.inline
  implicit class UnmarshalledImportJobResponseOps[Self <: UnmarshalledImportJobResponse] (val x: Self) extends AnyVal {
    
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
    def setDefinition(value: UnmarshalledImportJobResource): Self = this.set("Definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinition: Self = this.set("Definition", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: String*): Self = this.set("Failures", js.Array(value :_*))
    
    @scala.inline
    def setFailures(value: js.Array[String]): Self = this.set("Failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailures: Self = this.set("Failures", js.undefined)
  }
}
