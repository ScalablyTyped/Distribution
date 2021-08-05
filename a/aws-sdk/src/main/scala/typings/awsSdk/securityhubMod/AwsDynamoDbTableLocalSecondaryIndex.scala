package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsDynamoDbTableLocalSecondaryIndex extends StObject {
  
  /**
    * The ARN of the index.
    */
  var IndexArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the index.
    */
  var IndexName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The complete key schema for the index.
    */
  var KeySchema: js.UndefOr[AwsDynamoDbTableKeySchemaList] = js.undefined
  
  /**
    * Attributes that are copied from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
    */
  var Projection: js.UndefOr[AwsDynamoDbTableProjection] = js.undefined
}
object AwsDynamoDbTableLocalSecondaryIndex {
  
  inline def apply(): AwsDynamoDbTableLocalSecondaryIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableLocalSecondaryIndex]
  }
  
  extension [Self <: AwsDynamoDbTableLocalSecondaryIndex](x: Self) {
    
    inline def setIndexArn(value: NonEmptyString): Self = StObject.set(x, "IndexArn", value.asInstanceOf[js.Any])
    
    inline def setIndexArnUndefined: Self = StObject.set(x, "IndexArn", js.undefined)
    
    inline def setIndexName(value: NonEmptyString): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setKeySchema(value: AwsDynamoDbTableKeySchemaList): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
    
    inline def setKeySchemaVarargs(value: AwsDynamoDbTableKeySchema*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
    
    inline def setProjection(value: AwsDynamoDbTableProjection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
  }
}
