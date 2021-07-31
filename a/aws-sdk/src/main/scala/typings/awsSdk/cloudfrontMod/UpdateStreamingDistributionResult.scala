package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStreamingDistributionResult extends StObject {
  
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The streaming distribution's information.
    */
  var StreamingDistribution: js.UndefOr[typings.awsSdk.cloudfrontMod.StreamingDistribution] = js.undefined
}
object UpdateStreamingDistributionResult {
  
  @scala.inline
  def apply(): UpdateStreamingDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStreamingDistributionResult]
  }
  
  @scala.inline
  implicit class UpdateStreamingDistributionResultMutableBuilder[Self <: UpdateStreamingDistributionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setStreamingDistribution(value: StreamingDistribution): Self = StObject.set(x, "StreamingDistribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingDistributionUndefined: Self = StObject.set(x, "StreamingDistribution", js.undefined)
  }
}
