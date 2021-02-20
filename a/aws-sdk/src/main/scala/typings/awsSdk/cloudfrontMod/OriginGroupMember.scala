package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginGroupMember extends StObject {
  
  /**
    * The ID for an origin in an origin group.
    */
  var OriginId: String = js.native
}
object OriginGroupMember {
  
  @scala.inline
  def apply(OriginId: String): OriginGroupMember = {
    val __obj = js.Dynamic.literal(OriginId = OriginId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroupMember]
  }
  
  @scala.inline
  implicit class OriginGroupMemberMutableBuilder[Self <: OriginGroupMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginId(value: String): Self = StObject.set(x, "OriginId", value.asInstanceOf[js.Any])
  }
}
