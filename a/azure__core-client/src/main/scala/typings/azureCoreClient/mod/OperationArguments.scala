package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationArguments
  extends StObject
     with /**
  * The parameters that were passed to the operation method.
  */
/* parameterName */ StringDictionary[Any] {
  
  /**
    * The optional arguments that are provided to an operation.
    */
  var options: js.UndefOr[OperationOptions] = js.undefined
}
object OperationArguments {
  
  inline def apply(): OperationArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationArguments] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: OperationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
