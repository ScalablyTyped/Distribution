package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3CatalogTarget extends StObject {
  
  /**
    * The name of the database to write to.
    */
  var Database: EnclosedInStringProperty
  
  /**
    * The nodes that are inputs to the data target.
    */
  var Inputs: OneInput
  
  /**
    * The name of the data target.
    */
  var Name: NodeName
  
  /**
    * Specifies native partitioning using a sequence of keys.
    */
  var PartitionKeys: js.UndefOr[GlueStudioPathList] = js.undefined
  
  /**
    * A policy that specifies update behavior for the crawler.
    */
  var SchemaChangePolicy: js.UndefOr[CatalogSchemaChangePolicy] = js.undefined
  
  /**
    * The name of the table in the database to write to.
    */
  var Table: EnclosedInStringProperty
}
object S3CatalogTarget {
  
  inline def apply(
    Database: EnclosedInStringProperty,
    Inputs: OneInput,
    Name: NodeName,
    Table: EnclosedInStringProperty
  ): S3CatalogTarget = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Table = Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3CatalogTarget]
  }
  
  extension [Self <: S3CatalogTarget](x: Self) {
    
    inline def setDatabase(value: EnclosedInStringProperty): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeys(value: GlueStudioPathList): Self = StObject.set(x, "PartitionKeys", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeysUndefined: Self = StObject.set(x, "PartitionKeys", js.undefined)
    
    inline def setPartitionKeysVarargs(value: EnclosedInStringProperties*): Self = StObject.set(x, "PartitionKeys", js.Array(value*))
    
    inline def setSchemaChangePolicy(value: CatalogSchemaChangePolicy): Self = StObject.set(x, "SchemaChangePolicy", value.asInstanceOf[js.Any])
    
    inline def setSchemaChangePolicyUndefined: Self = StObject.set(x, "SchemaChangePolicy", js.undefined)
    
    inline def setTable(value: EnclosedInStringProperty): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
  }
}
