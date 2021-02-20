package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePlatformApplicationResponse extends StObject {
  
  /**
    * PlatformApplicationArn is returned.
    */
  var PlatformApplicationArn: js.UndefOr[String] = js.native
}
object CreatePlatformApplicationResponse {
  
  @scala.inline
  def apply(): CreatePlatformApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlatformApplicationResponse]
  }
  
  @scala.inline
  implicit class CreatePlatformApplicationResponseMutableBuilder[Self <: CreatePlatformApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatformApplicationArn(value: String): Self = StObject.set(x, "PlatformApplicationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformApplicationArnUndefined: Self = StObject.set(x, "PlatformApplicationArn", js.undefined)
  }
}
