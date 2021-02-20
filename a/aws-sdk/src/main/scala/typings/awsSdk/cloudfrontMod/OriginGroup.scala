package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginGroup extends StObject {
  
  /**
    * A complex type that contains information about the failover criteria for an origin group.
    */
  var FailoverCriteria: OriginGroupFailoverCriteria = js.native
  
  /**
    * The origin group's ID.
    */
  var Id: String = js.native
  
  /**
    * A complex type that contains information about the origins in an origin group.
    */
  var Members: OriginGroupMembers = js.native
}
object OriginGroup {
  
  @scala.inline
  def apply(FailoverCriteria: OriginGroupFailoverCriteria, Id: String, Members: OriginGroupMembers): OriginGroup = {
    val __obj = js.Dynamic.literal(FailoverCriteria = FailoverCriteria.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroup]
  }
  
  @scala.inline
  implicit class OriginGroupMutableBuilder[Self <: OriginGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailoverCriteria(value: OriginGroupFailoverCriteria): Self = StObject.set(x, "FailoverCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: OriginGroupMembers): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
  }
}
