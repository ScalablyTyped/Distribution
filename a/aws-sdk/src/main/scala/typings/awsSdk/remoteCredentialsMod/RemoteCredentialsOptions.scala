package typings.awsSdk.remoteCredentialsMod

import typings.awsSdk.anon.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteCredentialsOptions extends js.Object {
  
  var httpOptions: js.UndefOr[Timeout] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
}
object RemoteCredentialsOptions {
  
  @scala.inline
  def apply(): RemoteCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteCredentialsOptions]
  }
  
  @scala.inline
  implicit class RemoteCredentialsOptionsOps[Self <: RemoteCredentialsOptions] (val x: Self) extends AnyVal {
    
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
    def setHttpOptions(value: Timeout): Self = this.set("httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpOptions: Self = this.set("httpOptions", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
  }
}
