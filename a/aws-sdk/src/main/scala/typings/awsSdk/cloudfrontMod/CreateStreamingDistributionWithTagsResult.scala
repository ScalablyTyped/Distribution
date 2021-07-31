package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamingDistributionWithTagsResult extends StObject {
  
  /**
    * The current version of the distribution created.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The fully qualified URI of the new streaming distribution resource just created.
    */
  var Location: js.UndefOr[String] = js.undefined
  
  /**
    * The streaming distribution's information. 
    */
  var StreamingDistribution: js.UndefOr[typings.awsSdk.cloudfrontMod.StreamingDistribution] = js.undefined
}
object CreateStreamingDistributionWithTagsResult {
  
  @scala.inline
  def apply(): CreateStreamingDistributionWithTagsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamingDistributionWithTagsResult]
  }
  
  @scala.inline
  implicit class CreateStreamingDistributionWithTagsResultMutableBuilder[Self <: CreateStreamingDistributionWithTagsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    @scala.inline
    def setStreamingDistribution(value: StreamingDistribution): Self = StObject.set(x, "StreamingDistribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingDistributionUndefined: Self = StObject.set(x, "StreamingDistribution", js.undefined)
  }
}
