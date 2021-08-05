package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/app-installation.AppInstallationProps, 'sys'> */
trait OmitAppInstallationPropss extends StObject {
  
  var parameters: StringDictionary[String]
}
object OmitAppInstallationPropss {
  
  inline def apply(parameters: StringDictionary[String]): OmitAppInstallationPropss = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitAppInstallationPropss]
  }
  
  extension [Self <: OmitAppInstallationPropss](x: Self) {
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
