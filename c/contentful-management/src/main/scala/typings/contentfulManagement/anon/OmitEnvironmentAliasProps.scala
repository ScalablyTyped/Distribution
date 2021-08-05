package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/environment-alias.EnvironmentAliasProps, 'sys'> */
trait OmitEnvironmentAliasProps extends StObject {
  
  var environment: MetaLinkProps
}
object OmitEnvironmentAliasProps {
  
  inline def apply(environment: MetaLinkProps): OmitEnvironmentAliasProps = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitEnvironmentAliasProps]
  }
  
  extension [Self <: OmitEnvironmentAliasProps](x: Self) {
    
    inline def setEnvironment(value: MetaLinkProps): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
  }
}
