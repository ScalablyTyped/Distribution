package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeGenNodeArg extends StObject {
  
  /**
    * The name of the argument or property.
    */
  var Name: CodeGenArgName = js.native
  
  /**
    * True if the value is used as a parameter.
    */
  var Param: js.UndefOr[Boolean] = js.native
  
  /**
    * The value of the argument or property.
    */
  var Value: CodeGenArgValue = js.native
}
object CodeGenNodeArg {
  
  @scala.inline
  def apply(Name: CodeGenArgName, Value: CodeGenArgValue): CodeGenNodeArg = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenNodeArg]
  }
  
  @scala.inline
  implicit class CodeGenNodeArgMutableBuilder[Self <: CodeGenNodeArg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: CodeGenArgName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParam(value: Boolean): Self = StObject.set(x, "Param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamUndefined: Self = StObject.set(x, "Param", js.undefined)
    
    @scala.inline
    def setValue(value: CodeGenArgValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
