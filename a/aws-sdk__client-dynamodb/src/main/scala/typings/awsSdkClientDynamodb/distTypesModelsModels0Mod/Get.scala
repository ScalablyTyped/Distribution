package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get extends StObject {
  
  /**
    * <p>One or more substitution tokens for attribute names in the ProjectionExpression
    *             parameter.</p>
    */
  var ExpressionAttributeNames: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * <p>A map of attribute names to <code>AttributeValue</code> objects that specifies the
    *             primary key of the item to retrieve.</p>
    */
  var Key: js.UndefOr[Record[String, AttributeValue]] = js.undefined
  
  /**
    * <p>A string that identifies one or more attributes of the specified item to retrieve from
    *             the table. The attributes in the expression must be separated by commas. If no attribute
    *             names are specified, then all attributes of the specified item are returned. If any of
    *             the requested attributes are not found, they do not appear in the result.</p>
    */
  var ProjectionExpression: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The name of the table from which to retrieve the specified item.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object Get {
  
  inline def apply(): Get = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Get]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
    
    inline def setExpressionAttributeNames(value: Record[String, String]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    inline def setKey(value: Record[String, AttributeValue]): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setProjectionExpression(value: String): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
    
    inline def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
