package typings.awsSdkClientLambdaNode.typesEnvironmentResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientLambdaNode.typesEnvironmentErrorMod.UnmarshalledEnvironmentError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEnvironmentResponse extends EnvironmentResponse {
  /**
    * <p>Error messages for environment variables that could not be applied.</p>
    */
  @JSName("Error")
  var Error_UnmarshalledEnvironmentResponse: js.UndefOr[UnmarshalledEnvironmentError] = js.native
  /**
    * <p>Environment variable key-value pairs.</p>
    */
  @JSName("Variables")
  var Variables_UnmarshalledEnvironmentResponse: js.UndefOr[StringDictionary[String]] = js.native
}

object UnmarshalledEnvironmentResponse {
  @scala.inline
  def apply(): UnmarshalledEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEnvironmentResponse]
  }
  @scala.inline
  implicit class UnmarshalledEnvironmentResponseOps[Self <: UnmarshalledEnvironmentResponse] (val x: Self) extends AnyVal {
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
    def setError(value: UnmarshalledEnvironmentError): Self = this.set("Error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
    @scala.inline
    def setVariables(value: StringDictionary[String]): Self = this.set("Variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("Variables", js.undefined)
  }
  
}

