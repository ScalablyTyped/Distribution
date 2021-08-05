package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePartitionRequest extends StObject {
  
  /**
    * The AWS account ID of the catalog in which the partition is to be created.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the metadata database in which the partition is to be created.
    */
  var DatabaseName: NameString
  
  /**
    * A PartitionInput structure defining the partition to be created.
    */
  var PartitionInput: typings.awsSdk.glueMod.PartitionInput
  
  /**
    * The name of the metadata table in which the partition is to be created.
    */
  var TableName: NameString
}
object CreatePartitionRequest {
  
  inline def apply(DatabaseName: NameString, PartitionInput: PartitionInput, TableName: NameString): CreatePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionInput = PartitionInput.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePartitionRequest]
  }
  
  extension [Self <: CreatePartitionRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setPartitionInput(value: PartitionInput): Self = StObject.set(x, "PartitionInput", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
