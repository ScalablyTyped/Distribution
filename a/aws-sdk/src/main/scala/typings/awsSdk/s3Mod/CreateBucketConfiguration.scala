package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBucketConfiguration extends StObject {
  
  /**
    * Specifies the Region where the bucket will be created. If you don't specify a Region, the bucket is created in the US East (N. Virginia) Region (us-east-1).
    */
  var LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.undefined
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
