package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSourceCredentialsOutput extends js.Object {
  
  /**
    *  A list of SourceCredentialsInfo objects. Each SourceCredentialsInfo object includes the authentication type, token ARN, and type of source provider for one set of credentials. 
    */
  var sourceCredentialsInfos: js.UndefOr[SourceCredentialsInfos] = js.native
}
object ListSourceCredentialsOutput {
  
  @scala.inline
  def apply(): ListSourceCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSourceCredentialsOutput]
  }
  
  @scala.inline
  implicit class ListSourceCredentialsOutputOps[Self <: ListSourceCredentialsOutput] (val x: Self) extends AnyVal {
    
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
    def setSourceCredentialsInfosVarargs(value: SourceCredentialsInfo*): Self = this.set("sourceCredentialsInfos", js.Array(value :_*))
    
    @scala.inline
    def setSourceCredentialsInfos(value: SourceCredentialsInfos): Self = this.set("sourceCredentialsInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCredentialsInfos: Self = this.set("sourceCredentialsInfos", js.undefined)
  }
}
