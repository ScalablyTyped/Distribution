package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetParametersRequest extends js.Object {
  
  /**
    * Names of the parameters for which you want to query information.
    */
  var Names: ParameterNameList = js.native
  
  /**
    * Return decrypted secure string value. Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.
    */
  var WithDecryption: js.UndefOr[Boolean] = js.native
}
object GetParametersRequest {
  
  @scala.inline
  def apply(Names: ParameterNameList): GetParametersRequest = {
    val __obj = js.Dynamic.literal(Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersRequest]
  }
  
  @scala.inline
  implicit class GetParametersRequestOps[Self <: GetParametersRequest] (val x: Self) extends AnyVal {
    
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
    def setNamesVarargs(value: PSParameterName*): Self = this.set("Names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: ParameterNameList): Self = this.set("Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithDecryption(value: Boolean): Self = this.set("WithDecryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithDecryption: Self = this.set("WithDecryption", js.undefined)
  }
}
