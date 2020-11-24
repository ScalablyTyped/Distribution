package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentResponse extends js.Object {
  
  /**
    * Error messages for environment variables that couldn't be applied.
    */
  var Error: js.UndefOr[EnvironmentError] = js.native
  
  /**
    * Environment variable key-value pairs.
    */
  var Variables: js.UndefOr[EnvironmentVariables] = js.native
}
object EnvironmentResponse {
  
  @scala.inline
  def apply(): EnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentResponse]
  }
  
  @scala.inline
  implicit class EnvironmentResponseOps[Self <: EnvironmentResponse] (val x: Self) extends AnyVal {
    
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
    def setError(value: EnvironmentError): Self = this.set("Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
    
    @scala.inline
    def setVariables(value: EnvironmentVariables): Self = this.set("Variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("Variables", js.undefined)
  }
}
