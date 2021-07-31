package typings.baiduApp.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var value: StringDictionary[String | Boolean | Double]
}
object Value {
  
  @scala.inline
  def apply(value: StringDictionary[String | Boolean | Double]): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: StringDictionary[String | Boolean | Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
