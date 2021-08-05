package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldInfo extends StObject {
  
  /**
    * Name of the field.
    */
  var Name: js.UndefOr[FieldName] = js.undefined
}
object FieldInfo {
  
  inline def apply(): FieldInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldInfo]
  }
  
  extension [Self <: FieldInfo](x: Self) {
    
    inline def setName(value: FieldName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
