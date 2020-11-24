package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamAccessKeySessionContext extends js.Object {
  
  /**
    * Attributes of the session that the key was used for.
    */
  var Attributes: js.UndefOr[AwsIamAccessKeySessionContextAttributes] = js.native
  
  /**
    * Information about the entity that created the session.
    */
  var SessionIssuer: js.UndefOr[AwsIamAccessKeySessionContextSessionIssuer] = js.native
}
object AwsIamAccessKeySessionContext {
  
  @scala.inline
  def apply(): AwsIamAccessKeySessionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamAccessKeySessionContext]
  }
  
  @scala.inline
  implicit class AwsIamAccessKeySessionContextOps[Self <: AwsIamAccessKeySessionContext] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: AwsIamAccessKeySessionContextAttributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setSessionIssuer(value: AwsIamAccessKeySessionContextSessionIssuer): Self = this.set("SessionIssuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionIssuer: Self = this.set("SessionIssuer", js.undefined)
  }
}
