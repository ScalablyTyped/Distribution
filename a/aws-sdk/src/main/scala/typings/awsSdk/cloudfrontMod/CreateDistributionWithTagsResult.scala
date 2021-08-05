package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDistributionWithTagsResult extends StObject {
  
  /**
    * The distribution's information. 
    */
  var Distribution: js.UndefOr[typings.awsSdk.cloudfrontMod.Distribution] = js.undefined
  
  /**
    * The current version of the distribution created.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The fully qualified URI of the new distribution resource just created.
    */
  var Location: js.UndefOr[String] = js.undefined
}
object CreateDistributionWithTagsResult {
  
  inline def apply(): CreateDistributionWithTagsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDistributionWithTagsResult]
  }
  
  extension [Self <: CreateDistributionWithTagsResult](x: Self) {
    
    inline def setDistribution(value: Distribution): Self = StObject.set(x, "Distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "Distribution", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
