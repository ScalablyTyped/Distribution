package typings.awsSdkClientLambdaNode.typesFunctionCodeMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledFunctionCode extends FunctionCode {
  
  /**
    * <p>The base64-encoded contents of your zip file containing your deployment package. AWS SDK and AWS CLI clients handle the encoding for you.</p>
    */
  @JSName("ZipFile")
  var ZipFile_UnmarshalledFunctionCode: js.UndefOr[Uint8Array] = js.native
}
object UnmarshalledFunctionCode {
  
  @scala.inline
  def apply(): UnmarshalledFunctionCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledFunctionCode]
  }
  
  @scala.inline
  implicit class UnmarshalledFunctionCodeOps[Self <: UnmarshalledFunctionCode] (val x: Self) extends AnyVal {
    
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
    def setZipFile(value: Uint8Array): Self = this.set("ZipFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZipFile: Self = this.set("ZipFile", js.undefined)
  }
}
