package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/environment-alias.EnvironmentAliasProps, 'sys'> */
@js.native
trait OmitEnvironmentAliasProps extends StObject {
  
  var environment: MetaLinkProps = js.native
}
object OmitEnvironmentAliasProps {
  
  @scala.inline
  def apply(environment: MetaLinkProps): OmitEnvironmentAliasProps = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitEnvironmentAliasProps]
  }
  
  @scala.inline
  implicit class OmitEnvironmentAliasPropsMutableBuilder[Self <: OmitEnvironmentAliasProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: MetaLinkProps): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
  }
}
