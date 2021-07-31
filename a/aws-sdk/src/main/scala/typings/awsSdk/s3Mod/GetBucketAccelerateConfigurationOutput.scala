package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketAccelerateConfigurationOutput extends StObject {
  
  /**
    * The accelerate configuration of the bucket.
    */
  var Status: js.UndefOr[BucketAccelerateStatus] = js.undefined
}
object GetBucketAccelerateConfigurationOutput {
  
  @scala.inline
  def apply(): GetBucketAccelerateConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketAccelerateConfigurationOutput]
  }
  
  @scala.inline
  implicit class GetBucketAccelerateConfigurationOutputMutableBuilder[Self <: GetBucketAccelerateConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: BucketAccelerateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
