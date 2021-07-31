package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlatformVersionResult extends StObject {
  
  /**
    * The builder used to create the custom platform.
    */
  var Builder: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Builder] = js.undefined
  
  /**
    * Detailed information about the new version of the custom platform.
    */
  var PlatformSummary: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformSummary] = js.undefined
}
object CreatePlatformVersionResult {
  
  @scala.inline
  def apply(): CreatePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlatformVersionResult]
  }
  
  @scala.inline
  implicit class CreatePlatformVersionResultMutableBuilder[Self <: CreatePlatformVersionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuilder(value: Builder): Self = StObject.set(x, "Builder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuilderUndefined: Self = StObject.set(x, "Builder", js.undefined)
    
    @scala.inline
    def setPlatformSummary(value: PlatformSummary): Self = StObject.set(x, "PlatformSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformSummaryUndefined: Self = StObject.set(x, "PlatformSummary", js.undefined)
  }
}
