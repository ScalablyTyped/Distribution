package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpPackageConfiguration extends StObject {
  
  /**
    * The relative path to the URL for this VOD source. This is combined with SourceLocation::HttpConfiguration::BaseUrl to form a valid URL.
    */
  var Path: string
  
  /**
    * The name of the source group. This has to match one of the Channel::Outputs::SourceGroup.
    */
  var SourceGroup: string
  
  /**
    * The streaming protocol for this package configuration. Supported values are HLS and DASH.
    */
  var Type: typings.awsSdk.mediatailorMod.Type
}
object HttpPackageConfiguration {
  
  inline def apply(Path: string, SourceGroup: string, Type: Type): HttpPackageConfiguration = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any], SourceGroup = SourceGroup.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpPackageConfiguration]
  }
  
  extension [Self <: HttpPackageConfiguration](x: Self) {
    
    inline def setPath(value: string): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setSourceGroup(value: string): Self = StObject.set(x, "SourceGroup", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
