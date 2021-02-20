package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceCount extends StObject {
  
  /**
    * The number of listed Reserved Instances in the state specified by the state.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  
  /**
    * The states of the listed Reserved Instances.
    */
  var State: js.UndefOr[ListingState] = js.native
}
object InstanceCount {
  
  @scala.inline
  def apply(): InstanceCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCount]
  }
  
  @scala.inline
  implicit class InstanceCountMutableBuilder[Self <: InstanceCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    @scala.inline
    def setState(value: ListingState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
