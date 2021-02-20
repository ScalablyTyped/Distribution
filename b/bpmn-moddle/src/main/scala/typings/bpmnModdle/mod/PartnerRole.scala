package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartnerRole extends BaseElement {
  
  var name: String = js.native
  
  var participantRef: js.Array[Participant] = js.native
}
object PartnerRole {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    name: String,
    participantRef: js.Array[Participant]
  ): PartnerRole = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], participantRef = participantRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartnerRole]
  }
  
  @scala.inline
  implicit class PartnerRoleMutableBuilder[Self <: PartnerRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantRef(value: js.Array[Participant]): Self = StObject.set(x, "participantRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantRefVarargs(value: Participant*): Self = StObject.set(x, "participantRef", js.Array(value :_*))
  }
}
