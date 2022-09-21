package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLiveSourceResponse extends StObject {
  
  /**
    * The ARN of the live source.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The timestamp that indicates when the live source was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The HTTP package configurations.
    */
  var HttpPackageConfigurations: js.UndefOr[typings.awsSdk.mediatailorMod.HttpPackageConfigurations] = js.undefined
  
  /**
    * The timestamp that indicates when the live source was modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the live source.
    */
  var LiveSourceName: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the source location associated with the VOD source.
    */
  var SourceLocationName: js.UndefOr[string] = js.undefined
  
  /**
    * The tags assigned to the live source.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object UpdateLiveSourceResponse {
  
  inline def apply(): UpdateLiveSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLiveSourceResponse]
  }
  
  extension [Self <: UpdateLiveSourceResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setHttpPackageConfigurations(value: HttpPackageConfigurations): Self = StObject.set(x, "HttpPackageConfigurations", value.asInstanceOf[js.Any])
    
    inline def setHttpPackageConfigurationsUndefined: Self = StObject.set(x, "HttpPackageConfigurations", js.undefined)
    
    inline def setHttpPackageConfigurationsVarargs(value: HttpPackageConfiguration*): Self = StObject.set(x, "HttpPackageConfigurations", js.Array(value*))
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setLiveSourceName(value: string): Self = StObject.set(x, "LiveSourceName", value.asInstanceOf[js.Any])
    
    inline def setLiveSourceNameUndefined: Self = StObject.set(x, "LiveSourceName", js.undefined)
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationNameUndefined: Self = StObject.set(x, "SourceLocationName", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
