package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalTableSettingsInput extends StObject {
  
  /**
    * <p>The name of the global table to describe.</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.undefined
}
object DescribeGlobalTableSettingsInput {
  
  inline def apply(): DescribeGlobalTableSettingsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalTableSettingsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGlobalTableSettingsInput] (val x: Self) extends AnyVal {
    
    inline def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
  }
}
