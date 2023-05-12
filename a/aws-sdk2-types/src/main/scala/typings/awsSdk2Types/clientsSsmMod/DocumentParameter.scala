package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentParameter extends StObject {
  
  /**
    * If specified, the default values for the parameters. Parameters without a default value are required. Parameters with a default value are optional.
    */
  var DefaultValue: js.UndefOr[DocumentParameterDefaultValue] = js.undefined
  
  /**
    * A description of what the parameter does, how to use it, the default value, and whether or not the parameter is optional.
    */
  var Description: js.UndefOr[DocumentParameterDescrption] = js.undefined
  
  /**
    * The name of the parameter.
    */
  var Name: js.UndefOr[DocumentParameterName] = js.undefined
  
  /**
    * The type of parameter. The type can be either String or StringList.
    */
  var Type: js.UndefOr[DocumentParameterType] = js.undefined
}
object DocumentParameter {
  
  inline def apply(): DocumentParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentParameter] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: DocumentParameterDefaultValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    inline def setDescription(value: DocumentParameterDescrption): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: DocumentParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: DocumentParameterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
