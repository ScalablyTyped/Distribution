package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginGroup extends js.Object {
  
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
  implicit class OriginGroupOps[Self <: OriginGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailoverCriteria(value: OriginGroupFailoverCriteria): Self = this.set("FailoverCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: OriginGroupMembers): Self = this.set("Members", value.asInstanceOf[js.Any])
  }
}
