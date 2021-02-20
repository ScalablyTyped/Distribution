package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLocationS3Response extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the source Amazon S3 bucket location that is created.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
}
object CreateLocationS3Response {
  
  @scala.inline
  def apply(): CreateLocationS3Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationS3Response]
  }
  
  @scala.inline
  implicit class CreateLocationS3ResponseMutableBuilder[Self <: CreateLocationS3Response] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
  }
}
