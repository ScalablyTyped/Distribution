package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Resource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon S3 bucket.
    */
  var BucketArn: js.UndefOr[ResourceARN] = js.native
  
  /**
    * For export jobs, you can provide an optional KeyRange within a specific Amazon S3 bucket. The length of the range is defined at job creation, and has either an inclusive BeginMarker, an inclusive EndMarker, or both. Ranges are UTF-8 binary sorted.
    */
  var KeyRange: js.UndefOr[typings.awsSdk.snowballMod.KeyRange] = js.native
}
object S3Resource {
  
  @scala.inline
  def apply(): S3Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Resource]
  }
  
  @scala.inline
  implicit class S3ResourceMutableBuilder[Self <: S3Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketArn(value: ResourceARN): Self = StObject.set(x, "BucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketArnUndefined: Self = StObject.set(x, "BucketArn", js.undefined)
    
    @scala.inline
    def setKeyRange(value: KeyRange): Self = StObject.set(x, "KeyRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyRangeUndefined: Self = StObject.set(x, "KeyRange", js.undefined)
  }
}
