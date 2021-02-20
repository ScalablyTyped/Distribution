package typings.azdata.mod.nb

import typings.azdata.azdataStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IErrorResult
  extends ICellOutput
     with Output {
  
  /**
    * Exception name
    */
  var ename: String = js.native
  
  /**
    * Exception value
    */
  var evalue: String = js.native
  
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IErrorResult: error = js.native
  
  /**
    * Stacktrace equivalent
    */
  var traceback: js.UndefOr[js.Array[String]] = js.native
}
object IErrorResult {
  
  @scala.inline
  def apply(ename: String, evalue: String, output_type: error): IErrorResult = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorResult]
  }
  
  @scala.inline
  implicit class IErrorResultMutableBuilder[Self <: IErrorResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEname(value: String): Self = StObject.set(x, "ename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvalue(value: String): Self = StObject.set(x, "evalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput_type(value: error): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceback(value: js.Array[String]): Self = StObject.set(x, "traceback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracebackUndefined: Self = StObject.set(x, "traceback", js.undefined)
    
    @scala.inline
    def setTracebackVarargs(value: String*): Self = StObject.set(x, "traceback", js.Array(value :_*))
  }
}
