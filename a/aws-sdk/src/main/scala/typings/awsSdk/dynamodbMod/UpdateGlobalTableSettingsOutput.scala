package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGlobalTableSettingsOutput extends StObject {
  
  /**
    * The name of the global table.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.native
  
  /**
    * The Region-specific settings for the global table.
    */
  var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.native
}
object UpdateGlobalTableSettingsOutput {
  
  @scala.inline
  def apply(): UpdateGlobalTableSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGlobalTableSettingsOutput]
  }
  
  @scala.inline
  implicit class UpdateGlobalTableSettingsOutputMutableBuilder[Self <: UpdateGlobalTableSettingsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
    
    @scala.inline
    def setReplicaSettings(value: ReplicaSettingsDescriptionList): Self = StObject.set(x, "ReplicaSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaSettingsUndefined: Self = StObject.set(x, "ReplicaSettings", js.undefined)
    
    @scala.inline
    def setReplicaSettingsVarargs(value: ReplicaSettingsDescription*): Self = StObject.set(x, "ReplicaSettings", js.Array(value :_*))
  }
}
