package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSigningJobParameter extends js.Object {
  
  /**
    * The location to write the code-signed file.
    */
  var destination: js.UndefOr[Destination] = js.native
  
  /**
    * The code-signing profile name.
    */
  var signingProfileName: js.UndefOr[SigningProfileName] = js.native
  
  /**
    * Describes the code-signing profile.
    */
  var signingProfileParameter: js.UndefOr[SigningProfileParameter] = js.native
}
object StartSigningJobParameter {
  
  @scala.inline
  def apply(): StartSigningJobParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSigningJobParameter]
  }
  
  @scala.inline
  implicit class StartSigningJobParameterOps[Self <: StartSigningJobParameter] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: Destination): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setSigningProfileName(value: SigningProfileName): Self = this.set("signingProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningProfileName: Self = this.set("signingProfileName", js.undefined)
    
    @scala.inline
    def setSigningProfileParameter(value: SigningProfileParameter): Self = this.set("signingProfileParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningProfileParameter: Self = this.set("signingProfileParameter", js.undefined)
  }
}
