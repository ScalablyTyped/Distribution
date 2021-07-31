package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketLocationOutput extends StObject {
  
  /**
    * Specifies the Region where the bucket resides. For a list of all the Amazon S3 supported location constraints by Region, see Regions and Endpoints. Buckets in Region us-east-1 have a LocationConstraint of null.
    */
  var LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.undefined
}
object GetBucketLocationOutput {
  
  @scala.inline
  def apply(): GetBucketLocationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketLocationOutput]
  }
  
  @scala.inline
  implicit class GetBucketLocationOutputMutableBuilder[Self <: GetBucketLocationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationConstraint(value: BucketLocationConstraint): Self = StObject.set(x, "LocationConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationConstraintUndefined: Self = StObject.set(x, "LocationConstraint", js.undefined)
  }
}
