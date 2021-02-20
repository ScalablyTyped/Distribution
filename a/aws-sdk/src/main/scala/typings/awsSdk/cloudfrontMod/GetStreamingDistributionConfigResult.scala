package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStreamingDistributionConfigResult extends StObject {
  
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL. 
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * The streaming distribution's configuration information.
    */
  var StreamingDistributionConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.StreamingDistributionConfig] = js.native
}
object GetStreamingDistributionConfigResult {
  
  @scala.inline
  def apply(): GetStreamingDistributionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamingDistributionConfigResult]
  }
  
  @scala.inline
  implicit class GetStreamingDistributionConfigResultMutableBuilder[Self <: GetStreamingDistributionConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setStreamingDistributionConfig(value: StreamingDistributionConfig): Self = StObject.set(x, "StreamingDistributionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingDistributionConfigUndefined: Self = StObject.set(x, "StreamingDistributionConfig", js.undefined)
  }
}
