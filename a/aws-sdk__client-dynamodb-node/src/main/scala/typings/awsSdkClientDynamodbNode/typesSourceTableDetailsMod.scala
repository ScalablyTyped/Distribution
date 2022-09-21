package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.UnmarshalledProvisionedThroughput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSourceTableDetailsMod {
  
  trait SourceTableDetails extends StObject {
    
    /**
      * <p>Number of items in the table. Please note this is an approximate value. </p>
      */
    var ItemCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Schema of the table. </p>
      */
    var KeySchema: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement]
    
    /**
      * <p>Read IOPs and Write IOPS on the table when the backup was created.</p>
      */
    var ProvisionedThroughput: typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
    
    /**
      * <p>ARN of the table for which backup was created. </p>
      */
    var TableArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Time when the source table was created. </p>
      */
    var TableCreationDateTime: js.Date | String | Double
    
    /**
      * <p>Unique identifier for the table for which the backup was created. </p>
      */
    var TableId: String
    
    /**
      * <p>The name of the table for which the backup was created. </p>
      */
    var TableName: String
    
    /**
      * <p>Size of the table in bytes. Please note this is an approximate value.</p>
      */
    var TableSizeBytes: js.UndefOr[Double] = js.undefined
  }
  object SourceTableDetails {
    
    inline def apply(
      KeySchema: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement],
      ProvisionedThroughput: ProvisionedThroughput,
      TableCreationDateTime: js.Date | String | Double,
      TableId: String,
      TableName: String
    ): SourceTableDetails = {
      val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceTableDetails]
    }
    
    extension [Self <: SourceTableDetails](x: Self) {
      
      inline def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
      
      inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
      
      inline def setKeySchema(value: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
      
      inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      inline def setTableArn(value: String): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
      
      inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
      
      inline def setTableCreationDateTime(value: js.Date | String | Double): Self = StObject.set(x, "TableCreationDateTime", value.asInstanceOf[js.Any])
      
      inline def setTableId(value: String): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      inline def setTableSizeBytes(value: Double): Self = StObject.set(x, "TableSizeBytes", value.asInstanceOf[js.Any])
      
      inline def setTableSizeBytesUndefined: Self = StObject.set(x, "TableSizeBytes", js.undefined)
    }
  }
  
  trait UnmarshalledSourceTableDetails
    extends StObject
       with SourceTableDetails {
    
    /**
      * <p>Schema of the table. </p>
      */
    @JSName("KeySchema")
    var KeySchema_UnmarshalledSourceTableDetails: js.Array[UnmarshalledKeySchemaElement]
    
    /**
      * <p>Read IOPs and Write IOPS on the table when the backup was created.</p>
      */
    @JSName("ProvisionedThroughput")
    var ProvisionedThroughput_UnmarshalledSourceTableDetails: UnmarshalledProvisionedThroughput
    
    /**
      * <p>Time when the source table was created. </p>
      */
    @JSName("TableCreationDateTime")
    var TableCreationDateTime_UnmarshalledSourceTableDetails: js.Date
  }
  object UnmarshalledSourceTableDetails {
    
    inline def apply(
      KeySchema: js.Array[UnmarshalledKeySchemaElement],
      ProvisionedThroughput: UnmarshalledProvisionedThroughput,
      TableCreationDateTime: js.Date,
      TableId: String,
      TableName: String
    ): UnmarshalledSourceTableDetails = {
      val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledSourceTableDetails]
    }
    
    extension [Self <: UnmarshalledSourceTableDetails](x: Self) {
      
      inline def setKeySchema(value: js.Array[UnmarshalledKeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      inline def setKeySchemaVarargs(value: UnmarshalledKeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
      
      inline def setProvisionedThroughput(value: UnmarshalledProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      inline def setTableCreationDateTime(value: js.Date): Self = StObject.set(x, "TableCreationDateTime", value.asInstanceOf[js.Any])
    }
  }
}
