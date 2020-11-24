package typings.contentfulManagement.environmentAliasMod

import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentAliasProps extends js.Object {
  
  var environment: MetaLinkProps = js.native
  
  /**
    * System meta data
    */
  var sys: MetaSysProps = js.native
}
object EnvironmentAliasProps {
  
  @scala.inline
  def apply(environment: MetaLinkProps, sys: MetaSysProps): EnvironmentAliasProps = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentAliasProps]
  }
  
  @scala.inline
  implicit class EnvironmentAliasPropsOps[Self <: EnvironmentAliasProps] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}
