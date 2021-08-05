package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeGenNodeArg extends StObject {
  
  /**
    * The name of the argument or property.
    */
  var Name: CodeGenArgName
  
  /**
    * True if the value is used as a parameter.
    */
  var Param: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of the argument or property.
    */
  var Value: CodeGenArgValue
}
object CodeGenNodeArg {
  
  inline def apply(Name: CodeGenArgName, Value: CodeGenArgValue): CodeGenNodeArg = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenNodeArg]
  }
  
  extension [Self <: CodeGenNodeArg](x: Self) {
    
    inline def setName(value: CodeGenArgName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParam(value: Boolean): Self = StObject.set(x, "Param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "Param", js.undefined)
    
    inline def setValue(value: CodeGenArgValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
