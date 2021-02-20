package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceStatusDetails extends StObject {
  
  /**
    * The time when a status check failed. For an instance that was launched and impaired, this is the time when the instance was launched.
    */
  var ImpairedSince: js.UndefOr[DateTime] = js.native
  
  /**
    * The type of instance status.
    */
  var Name: js.UndefOr[StatusName] = js.native
  
  /**
    * The status.
    */
  var Status: js.UndefOr[StatusType] = js.native
}
object InstanceStatusDetails {
  
  @scala.inline
  def apply(): InstanceStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatusDetails]
  }
  
  @scala.inline
  implicit class InstanceStatusDetailsMutableBuilder[Self <: InstanceStatusDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImpairedSince(value: DateTime): Self = StObject.set(x, "ImpairedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpairedSinceUndefined: Self = StObject.set(x, "ImpairedSince", js.undefined)
    
    @scala.inline
    def setName(value: StatusName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
