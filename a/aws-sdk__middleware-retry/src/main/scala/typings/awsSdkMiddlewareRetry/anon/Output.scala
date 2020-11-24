package typings.awsSdkMiddlewareRetry.anon

import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output[Ouput /* <: MetadataBearer */] extends js.Object {
  
  var output: Ouput = js.native
  
  var response: js.Any = js.native
}
object Output {
  
  @scala.inline
  def apply[Ouput /* <: MetadataBearer */](output: Ouput, response: js.Any): Output[Ouput] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output[Ouput]]
  }
  
  @scala.inline
  implicit class OutputOps[Self <: Output[_], Ouput /* <: MetadataBearer */] (val x: Self with Output[Ouput]) extends AnyVal {
    
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
    def setOutput(value: Ouput): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: js.Any): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
