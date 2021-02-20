package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputLocation extends StObject {
  
  /**
    * key used to extract the password from EC2 Parameter store
    */
  var PasswordParam: js.UndefOr[string] = js.native
  
  /**
    * Uniform Resource Identifier - This should be a path to a file accessible to the Live system (eg. a http:// URI) depending on the output type. For example, a RTMP destination should have a uri simliar to: "rtmp://fmsserver/live".
    */
  var Uri: string = js.native
  
  /**
    * Documentation update needed
    */
  var Username: js.UndefOr[string] = js.native
}
object InputLocation {
  
  @scala.inline
  def apply(Uri: string): InputLocation = {
    val __obj = js.Dynamic.literal(Uri = Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputLocation]
  }
  
  @scala.inline
  implicit class InputLocationMutableBuilder[Self <: InputLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPasswordParam(value: string): Self = StObject.set(x, "PasswordParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordParamUndefined: Self = StObject.set(x, "PasswordParam", js.undefined)
    
    @scala.inline
    def setUri(value: string): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: string): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
