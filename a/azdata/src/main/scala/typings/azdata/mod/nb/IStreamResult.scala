package typings.azdata.mod.nb

import typings.azdata.azdataStrings.stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStreamResult
  extends StObject
     with ICellOutput
     with Output {
  
  /**
    * Stream output field defining the stream name, for example stdout
    */
  var name: StreamType
  
  @JSName("output_type")
  var output_type_IStreamResult: stream
  
  /**
    * Stream output field defining the multiline stream text
    */
  var text: MultilineString
}
object IStreamResult {
  
  inline def apply(name: StreamType, text: MultilineString): IStreamResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], output_type = "stream", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IStreamResult] (val x: Self) extends AnyVal {
    
    inline def setName(value: StreamType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutput_type(value: stream): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
    
    inline def setText(value: MultilineString): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
  }
}
