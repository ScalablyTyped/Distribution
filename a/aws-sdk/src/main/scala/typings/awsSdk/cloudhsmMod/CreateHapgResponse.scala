package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHapgResponse extends StObject {
  
  /**
    * The ARN of the high-availability partition group.
    */
  var HapgArn: js.UndefOr[typings.awsSdk.cloudhsmMod.HapgArn] = js.native
}
object CreateHapgResponse {
  
  @scala.inline
  def apply(): CreateHapgResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHapgResponse]
  }
  
  @scala.inline
  implicit class CreateHapgResponseMutableBuilder[Self <: CreateHapgResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHapgArn(value: HapgArn): Self = StObject.set(x, "HapgArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHapgArnUndefined: Self = StObject.set(x, "HapgArn", js.undefined)
  }
}
