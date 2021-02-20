package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInputResponse extends StObject {
  
  /**
    * Information about the configuration of the input.
    */
  var inputConfiguration: js.UndefOr[InputConfiguration] = js.native
}
object CreateInputResponse {
  
  @scala.inline
  def apply(): CreateInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInputResponse]
  }
  
  @scala.inline
  implicit class CreateInputResponseMutableBuilder[Self <: CreateInputResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputConfiguration(value: InputConfiguration): Self = StObject.set(x, "inputConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfigurationUndefined: Self = StObject.set(x, "inputConfiguration", js.undefined)
  }
}
