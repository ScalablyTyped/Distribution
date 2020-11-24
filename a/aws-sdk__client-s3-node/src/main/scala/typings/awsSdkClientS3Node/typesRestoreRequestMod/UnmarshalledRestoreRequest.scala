package typings.awsSdkClientS3Node.typesRestoreRequestMod

import typings.awsSdkClientS3Node.typesGlacierJobParametersMod.UnmarshalledGlacierJobParameters
import typings.awsSdkClientS3Node.typesOutputLocationMod.UnmarshalledOutputLocation
import typings.awsSdkClientS3Node.typesSelectParametersMod.UnmarshalledSelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledRestoreRequest extends RestoreRequest {
  
  /**
    * <p>Glacier related parameters pertaining to this job. Do not use with restores that specify OutputLocation.</p>
    */
  @JSName("GlacierJobParameters")
  var GlacierJobParameters_UnmarshalledRestoreRequest: js.UndefOr[UnmarshalledGlacierJobParameters] = js.native
  
  /**
    * <p>Describes the location where the restore job's output is stored.</p>
    */
  @JSName("OutputLocation")
  var OutputLocation_UnmarshalledRestoreRequest: js.UndefOr[UnmarshalledOutputLocation] = js.native
  
  /**
    * <p>Describes the parameters for Select job types.</p>
    */
  @JSName("SelectParameters")
  var SelectParameters_UnmarshalledRestoreRequest: js.UndefOr[UnmarshalledSelectParameters] = js.native
}
object UnmarshalledRestoreRequest {
  
  @scala.inline
  def apply(): UnmarshalledRestoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledRestoreRequest]
  }
  
  @scala.inline
  implicit class UnmarshalledRestoreRequestOps[Self <: UnmarshalledRestoreRequest] (val x: Self) extends AnyVal {
    
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
    def setGlacierJobParameters(value: UnmarshalledGlacierJobParameters): Self = this.set("GlacierJobParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlacierJobParameters: Self = this.set("GlacierJobParameters", js.undefined)
    
    @scala.inline
    def setOutputLocation(value: UnmarshalledOutputLocation): Self = this.set("OutputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputLocation: Self = this.set("OutputLocation", js.undefined)
    
    @scala.inline
    def setSelectParameters(value: UnmarshalledSelectParameters): Self = this.set("SelectParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectParameters: Self = this.set("SelectParameters", js.undefined)
  }
}
