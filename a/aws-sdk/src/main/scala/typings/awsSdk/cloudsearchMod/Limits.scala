package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Limits extends StObject {
  
  var MaximumPartitionCount: typings.awsSdk.cloudsearchMod.MaximumPartitionCount = js.native
  
  var MaximumReplicationCount: typings.awsSdk.cloudsearchMod.MaximumReplicationCount = js.native
}
object Limits {
  
  @scala.inline
  def apply(MaximumPartitionCount: MaximumPartitionCount, MaximumReplicationCount: MaximumReplicationCount): Limits = {
    val __obj = js.Dynamic.literal(MaximumPartitionCount = MaximumPartitionCount.asInstanceOf[js.Any], MaximumReplicationCount = MaximumReplicationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limits]
  }
  
  @scala.inline
  implicit class LimitsMutableBuilder[Self <: Limits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumPartitionCount(value: MaximumPartitionCount): Self = StObject.set(x, "MaximumPartitionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumReplicationCount(value: MaximumReplicationCount): Self = StObject.set(x, "MaximumReplicationCount", value.asInstanceOf[js.Any])
  }
}
