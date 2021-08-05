package typings.ckeditorCkeditor5Utils.mod

import typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.insert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertChange extends StObject {
  
  var index: Double
  
  var `type`: insert
  
  var values: js.Array[String]
}
object InsertChange {
  
  inline def apply(index: Double, values: js.Array[String]): InsertChange = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("insert")
    __obj.asInstanceOf[InsertChange]
  }
  
  extension [Self <: InsertChange](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setType(value: insert): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
