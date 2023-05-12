package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGlobalSecondaryIndexAction extends StObject {
  
  /**
    * <p>The name of the global secondary index to be updated.</p>
    */
  var IndexName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary
    *             index.</p>
    *          <p>For current minimum and maximum provisioned throughput values, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Service,
    *                 Account, and Table Quotas</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ProvisionedThroughput] = js.undefined
}
object UpdateGlobalSecondaryIndexAction {
  
  inline def apply(): UpdateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGlobalSecondaryIndexAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
    
    inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
  }
}
