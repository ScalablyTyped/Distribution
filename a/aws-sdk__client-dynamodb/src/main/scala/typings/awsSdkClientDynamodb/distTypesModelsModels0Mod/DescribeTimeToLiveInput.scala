package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTimeToLiveInput extends StObject {
  
  /**
    * <p>The name of the table to be described.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object DescribeTimeToLiveInput {
  
  inline def apply(): DescribeTimeToLiveInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTimeToLiveInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTimeToLiveInput] (val x: Self) extends AnyVal {
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
