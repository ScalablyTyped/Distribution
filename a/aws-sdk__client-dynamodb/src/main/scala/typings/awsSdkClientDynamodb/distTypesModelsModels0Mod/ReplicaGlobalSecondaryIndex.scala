package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaGlobalSecondaryIndex extends StObject {
  
  /**
    * <p>The name of the global secondary index.</p>
    */
  var IndexName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Replica table GSI-specific provisioned throughput. If not specified, uses the source
    *             table GSI's read capacity settings.</p>
    */
  var ProvisionedThroughputOverride: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ProvisionedThroughputOverride
  ] = js.undefined
}
object ReplicaGlobalSecondaryIndex {
  
  inline def apply(): ReplicaGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicaGlobalSecondaryIndex] (val x: Self) extends AnyVal {
    
    inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
  }
}
