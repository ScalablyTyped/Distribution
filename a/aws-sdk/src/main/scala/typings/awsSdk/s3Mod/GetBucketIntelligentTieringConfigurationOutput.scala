package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketIntelligentTieringConfigurationOutput extends StObject {
  
  /**
    * Container for S3 Intelligent-Tiering configuration.
    */
  var IntelligentTieringConfiguration: js.UndefOr[typings.awsSdk.s3Mod.IntelligentTieringConfiguration] = js.undefined
}
object GetBucketIntelligentTieringConfigurationOutput {
  
  @scala.inline
  def apply(): GetBucketIntelligentTieringConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketIntelligentTieringConfigurationOutput]
  }
  
  @scala.inline
  implicit class GetBucketIntelligentTieringConfigurationOutputMutableBuilder[Self <: GetBucketIntelligentTieringConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntelligentTieringConfiguration(value: IntelligentTieringConfiguration): Self = StObject.set(x, "IntelligentTieringConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntelligentTieringConfigurationUndefined: Self = StObject.set(x, "IntelligentTieringConfiguration", js.undefined)
  }
}
