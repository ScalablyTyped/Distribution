package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/environment-alias.EnvironmentAliasProps, 'sys'> */
@js.native
trait OmitEnvironmentAliasProps extends js.Object {
  
  var environment: MetaLinkProps = js.native
}
object OmitEnvironmentAliasProps {
  
  @scala.inline
  def apply(environment: MetaLinkProps): OmitEnvironmentAliasProps = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitEnvironmentAliasProps]
  }
  
  @scala.inline
  implicit class OmitEnvironmentAliasPropsOps[Self <: OmitEnvironmentAliasProps] (val x: Self) extends AnyVal {
    
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
    def setEnvironment(value: MetaLinkProps): Self = this.set("environment", value.asInstanceOf[js.Any])
  }
}
