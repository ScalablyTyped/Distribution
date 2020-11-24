package typings.awsSdkClientLambdaNode.typesEnvironmentResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientLambdaNode.typesEnvironmentErrorMod.EnvironmentError
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentResponse extends js.Object {
  
  /**
    * <p>Error messages for environment variables that could not be applied.</p>
    */
  var Error: js.UndefOr[EnvironmentError] = js.native
  
  /**
    * <p>Environment variable key-value pairs.</p>
    */
  var Variables: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: EnvironmentError): Self = this.set("Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
    
    @scala.inline
    def setVariables(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("Variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("Variables", js.undefined)
  }
}
