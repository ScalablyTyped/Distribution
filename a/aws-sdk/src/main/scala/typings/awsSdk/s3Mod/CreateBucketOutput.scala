package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBucketOutput extends StObject {
  
  /**
    * Specifies the Region where the bucket will be created. If you are creating a bucket on the US East (N. Virginia) Region (us-east-1), you do not need to specify the location.
    */
  var Location: js.UndefOr[typings.awsSdk.s3Mod.Location] = js.native
}
object CreateBucketOutput {
  
  @scala.inline
  def apply(): CreateBucketOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBucketOutput]
  }
  
  @scala.inline
  implicit class CreateBucketOutputMutableBuilder[Self <: CreateBucketOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
