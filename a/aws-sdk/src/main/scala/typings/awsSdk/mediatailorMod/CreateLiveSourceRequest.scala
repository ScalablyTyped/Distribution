package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLiveSourceRequest extends StObject {
  
  /**
    * A list of HTTP package configuration parameters for this live source.
    */
  var HttpPackageConfigurations: typings.awsSdk.mediatailorMod.HttpPackageConfigurations
  
  /**
    * The identifier for the live source you are working on.
    */
  var LiveSourceName: string
  
  /**
    * The identifier for the source location you are working on.
    */
  var SourceLocationName: string
  
  /**
    * The tags to assign to the live source.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object CreateLiveSourceRequest {
  
  inline def apply(
    HttpPackageConfigurations: HttpPackageConfigurations,
    LiveSourceName: string,
    SourceLocationName: string
  ): CreateLiveSourceRequest = {
    val __obj = js.Dynamic.literal(HttpPackageConfigurations = HttpPackageConfigurations.asInstanceOf[js.Any], LiveSourceName = LiveSourceName.asInstanceOf[js.Any], SourceLocationName = SourceLocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLiveSourceRequest]
  }
  
  extension [Self <: CreateLiveSourceRequest](x: Self) {
    
    inline def setHttpPackageConfigurations(value: HttpPackageConfigurations): Self = StObject.set(x, "HttpPackageConfigurations", value.asInstanceOf[js.Any])
    
    inline def setHttpPackageConfigurationsVarargs(value: HttpPackageConfiguration*): Self = StObject.set(x, "HttpPackageConfigurations", js.Array(value*))
    
    inline def setLiveSourceName(value: string): Self = StObject.set(x, "LiveSourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
