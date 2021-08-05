package typings.azdata.mod.nb

import typings.azdata.azdataStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IErrorResult
  extends StObject
     with ICellOutput
     with Output {
  
  /**
    * Exception name
    */
  var ename: String
  
  /**
    * Exception value
    */
  var evalue: String
  
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IErrorResult: error
  
  /**
    * Stacktrace equivalent
    */
  var traceback: js.UndefOr[js.Array[String]] = js.undefined
}
object IErrorResult {
  
  inline def apply(ename: String, evalue: String): IErrorResult = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], output_type = "error")
    __obj.asInstanceOf[IErrorResult]
  }
  
  extension [Self <: IErrorResult](x: Self) {
    
    inline def setEname(value: String): Self = StObject.set(x, "ename", value.asInstanceOf[js.Any])
    
    inline def setEvalue(value: String): Self = StObject.set(x, "evalue", value.asInstanceOf[js.Any])
    
    inline def setOutput_type(value: error): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
    
    inline def setTraceback(value: js.Array[String]): Self = StObject.set(x, "traceback", value.asInstanceOf[js.Any])
    
    inline def setTracebackUndefined: Self = StObject.set(x, "traceback", js.undefined)
    
    inline def setTracebackVarargs(value: String*): Self = StObject.set(x, "traceback", js.Array(value :_*))
  }
}
