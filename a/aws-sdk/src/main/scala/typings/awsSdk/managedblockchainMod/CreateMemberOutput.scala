package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMemberOutput extends StObject {
  
  /**
    * The unique identifier of the member.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.native
}
object CreateMemberOutput {
  
  @scala.inline
  def apply(): CreateMemberOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMemberOutput]
  }
  
  @scala.inline
  implicit class CreateMemberOutputMutableBuilder[Self <: CreateMemberOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
  }
}
