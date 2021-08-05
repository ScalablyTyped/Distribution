package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalTableSettingsOutput extends StObject {
  
  /**
    * The name of the global table.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.undefined
  
  /**
    * The Region-specific settings for the global table.
    */
  var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.undefined
}
object DescribeGlobalTableSettingsOutput {
  
  inline def apply(): DescribeGlobalTableSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalTableSettingsOutput]
  }
  
  extension [Self <: DescribeGlobalTableSettingsOutput](x: Self) {
    
    inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
    
    inline def setReplicaSettings(value: ReplicaSettingsDescriptionList): Self = StObject.set(x, "ReplicaSettings", value.asInstanceOf[js.Any])
    
    inline def setReplicaSettingsUndefined: Self = StObject.set(x, "ReplicaSettings", js.undefined)
    
    inline def setReplicaSettingsVarargs(value: ReplicaSettingsDescription*): Self = StObject.set(x, "ReplicaSettings", js.Array(value :_*))
  }
}
