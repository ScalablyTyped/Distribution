package typings.consola.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsolaLogObject extends StObject {
  
  var additional: js.UndefOr[String | js.Array[String]] = js.native
  
  var args: js.UndefOr[js.Array[_]] = js.native
  
  var date: js.UndefOr[Date] = js.native
  
  var level: js.UndefOr[LogLevel] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var tag: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[logType] = js.native
}
object ConsolaLogObject {
  
  @scala.inline
  def apply(): ConsolaLogObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsolaLogObject]
  }
  
  @scala.inline
  implicit class ConsolaLogObjectMutableBuilder[Self <: ConsolaLogObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditional(value: String | js.Array[String]): Self = StObject.set(x, "additional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalUndefined: Self = StObject.set(x, "additional", js.undefined)
    
    @scala.inline
    def setAdditionalVarargs(value: String*): Self = StObject.set(x, "additional", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setType(value: logType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
