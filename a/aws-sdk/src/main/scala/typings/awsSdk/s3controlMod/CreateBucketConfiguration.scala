package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBucketConfiguration extends StObject {
  
  /**
    * Specifies the Region where the bucket will be created. If you are creating a bucket on the US East (N. Virginia) Region (us-east-1), you do not need to specify the location.   This is not supported by Amazon S3 on Outposts buckets. 
    */
  var LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.native
}
object CreateBucketConfiguration {
  
  @scala.inline
  def apply(): CreateBucketConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBucketConfiguration]
  }
  
  @scala.inline
  implicit class CreateBucketConfigurationMutableBuilder[Self <: CreateBucketConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationConstraint(value: BucketLocationConstraint): Self = StObject.set(x, "LocationConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationConstraintUndefined: Self = StObject.set(x, "LocationConstraint", js.undefined)
  }
}
