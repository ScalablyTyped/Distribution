package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsLambdaFunctionEnvironment extends js.Object {
  
  /**
    * An AwsLambdaFunctionEnvironmentError object.
    */
  var Error: js.UndefOr[AwsLambdaFunctionEnvironmentError] = js.native
  
  /**
    * Environment variable key-value pairs.
    */
  var Variables: js.UndefOr[FieldMap] = js.native
}
object AwsLambdaFunctionEnvironment {
  
  @scala.inline
  def apply(): AwsLambdaFunctionEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionEnvironment]
  }
  
  @scala.inline
  implicit class AwsLambdaFunctionEnvironmentOps[Self <: AwsLambdaFunctionEnvironment] (val x: Self) extends AnyVal {
    
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
    def setError(value: AwsLambdaFunctionEnvironmentError): Self = this.set("Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
    
    @scala.inline
    def setVariables(value: FieldMap): Self = this.set("Variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("Variables", js.undefined)
  }
}
