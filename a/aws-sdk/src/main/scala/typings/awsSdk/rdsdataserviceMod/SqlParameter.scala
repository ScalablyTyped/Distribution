package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlParameter extends StObject {
  
  /**
    * The name of the parameter.
    */
  var name: js.UndefOr[ParameterName] = js.native
  
  /**
    * A hint that specifies the correct object type for data type mapping.  Values:     DECIMAL - The corresponding String parameter value is sent as an object of DECIMAL type to the database.    TIMESTAMP - The corresponding String parameter value is sent as an object of TIMESTAMP type to the database. The accepted format is YYYY-MM-DD HH:MM:SS[.FFF].    TIME - The corresponding String parameter value is sent as an object of TIME type to the database. The accepted format is HH:MM:SS[.FFF].    DATE - The corresponding String parameter value is sent as an object of DATE type to the database. The accepted format is YYYY-MM-DD.  
    */
  var typeHint: js.UndefOr[TypeHint] = js.native
  
  /**
    * The value of the parameter.
    */
  var value: js.UndefOr[Field] = js.native
}
object SqlParameter {
  
  @scala.inline
  def apply(): SqlParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlParameter]
  }
  
  @scala.inline
  implicit class SqlParameterMutableBuilder[Self <: SqlParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ParameterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTypeHint(value: TypeHint): Self = StObject.set(x, "typeHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeHintUndefined: Self = StObject.set(x, "typeHint", js.undefined)
    
    @scala.inline
    def setValue(value: Field): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
