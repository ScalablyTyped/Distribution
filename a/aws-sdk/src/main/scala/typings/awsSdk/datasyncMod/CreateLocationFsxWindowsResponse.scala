package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationFsxWindowsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the FSx for Windows file system location that is created.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.undefined
}
object CreateLocationFsxWindowsResponse {
  
  @scala.inline
  def apply(): CreateLocationFsxWindowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationFsxWindowsResponse]
  }
  
  @scala.inline
  implicit class CreateLocationFsxWindowsResponseMutableBuilder[Self <: CreateLocationFsxWindowsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
  }
}
