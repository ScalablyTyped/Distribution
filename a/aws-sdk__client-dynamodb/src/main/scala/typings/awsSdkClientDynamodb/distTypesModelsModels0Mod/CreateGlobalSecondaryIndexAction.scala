package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGlobalSecondaryIndexAction extends StObject {
  
  /**
    * <p>The name of the global secondary index to be created.</p>
    */
  var IndexName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The key schema for the global secondary index.</p>
    */
  var KeySchema: js.UndefOr[js.Array[KeySchemaElement]] = js.undefined
  
  /**
    * <p>Represents attributes that are copied (projected) from the table into an index. These
    *             are in addition to the primary key attributes and index key attributes, which are
    *             automatically projected.</p>
    */
  var Projection: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.Projection] = js.undefined
  
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary
    *             index.</p>
    *          <p>For current minimum and maximum provisioned throughput values, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Service,
    *                 Account, and Table Quotas</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ProvisionedThroughput] = js.undefined
}
object CreateGlobalSecondaryIndexAction {
  
  inline def apply(): CreateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGlobalSecondaryIndexAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
    
    inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setKeySchema(value: js.Array[KeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
    
    inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
    
    inline def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
    
    inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
  }
}
