package typings.awsSdk.keyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableSummary extends StObject {
  
  /**
    * The name of the keyspace that the table is stored in.
    */
  var keyspaceName: KeyspaceName
  
  /**
    * The unique identifier of the table in the format of an Amazon Resource Name (ARN).
    */
  var resourceArn: ARN
  
  /**
    * The name of the table.
    */
  var tableName: TableName
}
object TableSummary {
  
  inline def apply(keyspaceName: KeyspaceName, resourceArn: ARN, tableName: TableName): TableSummary = {
    val __obj = js.Dynamic.literal(keyspaceName = keyspaceName.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSummary]
  }
  
  extension [Self <: TableSummary](x: Self) {
    
    inline def setKeyspaceName(value: KeyspaceName): Self = StObject.set(x, "keyspaceName", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ARN): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
