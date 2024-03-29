package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalTableSettingsOutput extends StObject {
  
  /**
    * <p>The name of the global table.</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Region-specific settings for the global table.</p>
    */
  var ReplicaSettings: js.UndefOr[js.Array[ReplicaSettingsDescription]] = js.undefined
}
object DescribeGlobalTableSettingsOutput {
  
  inline def apply(): DescribeGlobalTableSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalTableSettingsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGlobalTableSettingsOutput] (val x: Self) extends AnyVal {
    
    inline def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
    
    inline def setReplicaSettings(value: js.Array[ReplicaSettingsDescription]): Self = StObject.set(x, "ReplicaSettings", value.asInstanceOf[js.Any])
    
    inline def setReplicaSettingsUndefined: Self = StObject.set(x, "ReplicaSettings", js.undefined)
    
    inline def setReplicaSettingsVarargs(value: ReplicaSettingsDescription*): Self = StObject.set(x, "ReplicaSettings", js.Array(value*))
  }
}
