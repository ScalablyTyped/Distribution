package typings.contentfulManagement.apiKeyMod

import typings.contentfulManagement.anon.Sys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<contentful-management.contentful-management/dist/typings/entities/api-key.ApiKeyProps, 'name' | 'environments' | 'description'> */
@js.native
trait CreateApiKeyProps extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var environments: js.Array[Sys] = js.native
  
  var name: String = js.native
}
object CreateApiKeyProps {
  
  @scala.inline
  def apply(environments: js.Array[Sys], name: String): CreateApiKeyProps = {
    val __obj = js.Dynamic.literal(environments = environments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiKeyProps]
  }
  
  @scala.inline
  implicit class CreateApiKeyPropsOps[Self <: CreateApiKeyProps] (val x: Self) extends AnyVal {
    
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
    def setEnvironmentsVarargs(value: Sys*): Self = this.set("environments", js.Array(value :_*))
    
    @scala.inline
    def setEnvironments(value: js.Array[Sys]): Self = this.set("environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
