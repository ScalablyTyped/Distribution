package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTimeToLiveInput extends StObject {
  
  /**
    * <p>The name of the table to be configured.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Represents the settings used to enable or disable Time to Live for the specified
    *             table.</p>
    */
  var TimeToLiveSpecification: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TimeToLiveSpecification] = js.undefined
}
object UpdateTimeToLiveInput {
  
  inline def apply(): UpdateTimeToLiveInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTimeToLiveInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTimeToLiveInput] (val x: Self) extends AnyVal {
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setTimeToLiveSpecification(value: TimeToLiveSpecification): Self = StObject.set(x, "TimeToLiveSpecification", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveSpecificationUndefined: Self = StObject.set(x, "TimeToLiveSpecification", js.undefined)
  }
}
