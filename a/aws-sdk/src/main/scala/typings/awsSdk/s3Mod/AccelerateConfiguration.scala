package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccelerateConfiguration extends StObject {
  
  /**
    * Specifies the transfer acceleration status of the bucket.
    */
  var Status: js.UndefOr[BucketAccelerateStatus] = js.undefined
}
object AccelerateConfiguration {
  
  @scala.inline
  def apply(): AccelerateConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccelerateConfiguration]
  }
  
  @scala.inline
  implicit class AccelerateConfigurationMutableBuilder[Self <: AccelerateConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: BucketAccelerateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
