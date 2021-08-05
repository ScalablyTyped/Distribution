package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlParameter extends StObject {
  
  /**
    * The name of the parameter.
    */
  var name: js.UndefOr[ParameterName] = js.undefined
  
  /**
    * A hint that specifies the correct object type for data type mapping.  Values:     DECIMAL - The corresponding String parameter value is sent as an object of DECIMAL type to the database.    TIMESTAMP - The corresponding String parameter value is sent as an object of TIMESTAMP type to the database. The accepted format is YYYY-MM-DD HH:MM:SS[.FFF].    TIME - The corresponding String parameter value is sent as an object of TIME type to the database. The accepted format is HH:MM:SS[.FFF].    DATE - The corresponding String parameter value is sent as an object of DATE type to the database. The accepted format is YYYY-MM-DD.  
    */
  var typeHint: js.UndefOr[TypeHint] = js.undefined
  
  /**
    * The value of the parameter.
    */
  var value: js.UndefOr[Field] = js.undefined
}
object SqlParameter {
  
  inline def apply(): SqlParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlParameter]
  }
  
  extension [Self <: SqlParameter](x: Self) {
    
    inline def setName(value: ParameterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTypeHint(value: TypeHint): Self = StObject.set(x, "typeHint", value.asInstanceOf[js.Any])
    
    inline def setTypeHintUndefined: Self = StObject.set(x, "typeHint", js.undefined)
    
    inline def setValue(value: Field): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
