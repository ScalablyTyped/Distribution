package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMemberResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the account that was associated with the master account.
    */
  var arn: js.UndefOr[string] = js.native
}
object CreateMemberResponse {
  
  @scala.inline
  def apply(): CreateMemberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMemberResponse]
  }
  
  @scala.inline
  implicit class CreateMemberResponseMutableBuilder[Self <: CreateMemberResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
  }
}
