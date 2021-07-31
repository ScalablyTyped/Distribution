package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsDynamoDbTableProvisionedThroughputOverride extends StObject {
  
  /**
    * The read capacity units for the replica.
    */
  var ReadCapacityUnits: js.UndefOr[Integer] = js.undefined
}
object AwsDynamoDbTableProvisionedThroughputOverride {
  
  @scala.inline
  def apply(): AwsDynamoDbTableProvisionedThroughputOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableProvisionedThroughputOverride]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableProvisionedThroughputOverrideMutableBuilder[Self <: AwsDynamoDbTableProvisionedThroughputOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadCapacityUnits(value: Integer): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
  }
}
