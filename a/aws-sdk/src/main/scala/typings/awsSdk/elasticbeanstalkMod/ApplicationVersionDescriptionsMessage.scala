package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationVersionDescriptionsMessage extends js.Object {
  
  /**
    * List of ApplicationVersionDescription objects sorted in order of creation.
    */
  var ApplicationVersions: js.UndefOr[ApplicationVersionDescriptionList] = js.native
  
  /**
    * In a paginated request, the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ApplicationVersionDescriptionsMessage {
  
  @scala.inline
  def apply(): ApplicationVersionDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVersionDescriptionsMessage]
  }
  
  @scala.inline
  implicit class ApplicationVersionDescriptionsMessageOps[Self <: ApplicationVersionDescriptionsMessage] (val x: Self) extends AnyVal {
    
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
    def setApplicationVersionsVarargs(value: ApplicationVersionDescription*): Self = this.set("ApplicationVersions", js.Array(value :_*))
    
    @scala.inline
    def setApplicationVersions(value: ApplicationVersionDescriptionList): Self = this.set("ApplicationVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationVersions: Self = this.set("ApplicationVersions", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
