package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLocationSmbResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the source SMB file system location that is created.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
}
object CreateLocationSmbResponse {
  
  @scala.inline
  def apply(): CreateLocationSmbResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationSmbResponse]
  }
  
  @scala.inline
  implicit class CreateLocationSmbResponseMutableBuilder[Self <: CreateLocationSmbResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
  }
}
