package typings.contentfulManagement.apiKeyMod

import typings.contentfulManagement.anon.Action
import typings.contentfulManagement.anon.Sys
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiKeyProps extends js.Object {
  
  var accessToken: String = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var environments: js.Array[Sys] = js.native
  
  var name: String = js.native
  
  var policies: js.UndefOr[js.Array[Action]] = js.native
  
  var preview_api_key: Sys = js.native
  
  var sys: MetaSysProps = js.native
}
object ApiKeyProps {
  
  @scala.inline
  def apply(
    accessToken: String,
    environments: js.Array[Sys],
    name: String,
    preview_api_key: Sys,
    sys: MetaSysProps
  ): ApiKeyProps = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], preview_api_key = preview_api_key.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyProps]
  }
  
  @scala.inline
  implicit class ApiKeyPropsOps[Self <: ApiKeyProps] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentsVarargs(value: Sys*): Self = this.set("environments", js.Array(value :_*))
    
    @scala.inline
    def setEnvironments(value: js.Array[Sys]): Self = this.set("environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_api_key(value: Sys): Self = this.set("preview_api_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: Action*): Self = this.set("policies", js.Array(value :_*))
    
    @scala.inline
    def setPolicies(value: js.Array[Action]): Self = this.set("policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
  }
}
