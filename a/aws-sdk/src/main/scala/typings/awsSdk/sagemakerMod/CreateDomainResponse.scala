package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDomainResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the created domain.
    */
  var DomainArn: js.UndefOr[typings.awsSdk.sagemakerMod.DomainArn] = js.native
  
  /**
    * The URL to the created domain.
    */
  var Url: js.UndefOr[String1024] = js.native
}
object CreateDomainResponse {
  
  @scala.inline
  def apply(): CreateDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDomainResponse]
  }
  
  @scala.inline
  implicit class CreateDomainResponseOps[Self <: CreateDomainResponse] (val x: Self) extends AnyVal {
    
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
    def setDomainArn(value: DomainArn): Self = this.set("DomainArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainArn: Self = this.set("DomainArn", js.undefined)
    
    @scala.inline
    def setUrl(value: String1024): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
}
