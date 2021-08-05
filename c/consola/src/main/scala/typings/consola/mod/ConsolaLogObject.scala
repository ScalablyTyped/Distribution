package typings.consola.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsolaLogObject extends StObject {
  
  var additional: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var args: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var date: js.UndefOr[Date] = js.undefined
  
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
  
  extension [Self <: ConsolaLogObject](x: Self) {
    
    inline def setAdditional(value: String | js.Array[String]): Self = StObject.set(x, "additional", value.asInstanceOf[js.Any])
    
    inline def setAdditionalUndefined: Self = StObject.set(x, "additional", js.undefined)
    
    inline def setAdditionalVarargs(value: String*): Self = StObject.set(x, "additional", js.Array(value :_*))
    
    inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
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
