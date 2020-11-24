package typings.awsSdk.ec2MetadataCredentialsMod

import typings.awsSdk.anon.ConnectTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EC2MetadataCredentialsOptions extends js.Object {
  
  var httpOptions: js.UndefOr[ConnectTimeout] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
}
object EC2MetadataCredentialsOptions {
  
  @scala.inline
  def apply(): EC2MetadataCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2MetadataCredentialsOptions]
  }
  
  @scala.inline
  implicit class EC2MetadataCredentialsOptionsOps[Self <: EC2MetadataCredentialsOptions] (val x: Self) extends AnyVal {
    
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
    def setHttpOptions(value: ConnectTimeout): Self = this.set("httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpOptions: Self = this.set("httpOptions", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
  }
}
