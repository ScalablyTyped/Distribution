package typings.consola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsolaLogObject extends StObject {
  
  var additional: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var args: js.UndefOr[js.Array[Any]] = js.undefined
  
  var date: js.UndefOr[js.Date] = js.undefined
  
  var level: js.UndefOr[LogLevel] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[logType] = js.undefined
}
object ConsolaLogObject {
  
  inline def apply(): ConsolaLogObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsolaLogObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsolaLogObject] (val x: Self) extends AnyVal {
    
    inline def setAdditional(value: String | js.Array[String]): Self = StObject.set(x, "additional", value.asInstanceOf[js.Any])
    
    inline def setAdditionalUndefined: Self = StObject.set(x, "additional", js.undefined)
    
    inline def setAdditionalVarargs(value: String*): Self = StObject.set(x, "additional", js.Array(value*))
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setType(value: logType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
