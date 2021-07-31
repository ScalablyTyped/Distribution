package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalSecondaryIndexAutoScalingUpdate extends StObject {
  
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typings.awsSdk.dynamodbMod.IndexName] = js.undefined
  
  var ProvisionedWriteCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
}
object GlobalSecondaryIndexAutoScalingUpdate {
  
  @scala.inline
  def apply(): GlobalSecondaryIndexAutoScalingUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalSecondaryIndexAutoScalingUpdate]
  }
  
  @scala.inline
  implicit class GlobalSecondaryIndexAutoScalingUpdateMutableBuilder[Self <: GlobalSecondaryIndexAutoScalingUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    @scala.inline
    def setProvisionedWriteCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedWriteCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", js.undefined)
  }
}
