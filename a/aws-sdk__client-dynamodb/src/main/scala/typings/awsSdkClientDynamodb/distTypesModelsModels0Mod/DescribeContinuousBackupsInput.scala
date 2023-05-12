package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContinuousBackupsInput extends StObject {
  
  /**
    * <p>Name of the table for which the customer wants to check the continuous backups and
    *             point in time recovery settings.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object DescribeContinuousBackupsInput {
  
  inline def apply(): DescribeContinuousBackupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContinuousBackupsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeContinuousBackupsInput] (val x: Self) extends AnyVal {
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
