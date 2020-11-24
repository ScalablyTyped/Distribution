package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeSigning extends js.Object {
  
  /**
    * The ID of the AWSSignerJob which was created to sign the file.
    */
  var awsSignerJobId: js.UndefOr[SigningJobId] = js.native
  
  /**
    * A custom method for code signing a file.
    */
  var customCodeSigning: js.UndefOr[CustomCodeSigning] = js.native
  
  /**
    * Describes the code-signing job.
    */
  var startSigningJobParameter: js.UndefOr[StartSigningJobParameter] = js.native
}
object CodeSigning {
  
  @scala.inline
  def apply(): CodeSigning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeSigning]
  }
  
  @scala.inline
  implicit class CodeSigningOps[Self <: CodeSigning] (val x: Self) extends AnyVal {
    
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
    def setAwsSignerJobId(value: SigningJobId): Self = this.set("awsSignerJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsSignerJobId: Self = this.set("awsSignerJobId", js.undefined)
    
    @scala.inline
    def setCustomCodeSigning(value: CustomCodeSigning): Self = this.set("customCodeSigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomCodeSigning: Self = this.set("customCodeSigning", js.undefined)
    
    @scala.inline
    def setStartSigningJobParameter(value: StartSigningJobParameter): Self = this.set("startSigningJobParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartSigningJobParameter: Self = this.set("startSigningJobParameter", js.undefined)
  }
}
