package typings.axeCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckMessages extends StObject {
  
  var fail: String | StringDictionary[String]
  
  var incomplete: String | StringDictionary[String]
  
  var pass: String | StringDictionary[String]
}
object CheckMessages {
  
  inline def apply(
    fail: String | StringDictionary[String],
    incomplete: String | StringDictionary[String],
    pass: String | StringDictionary[String]
  ): CheckMessages = {
    val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckMessages] (val x: Self) extends AnyVal {
    
    inline def setFail(value: String | StringDictionary[String]): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
    
    inline def setIncomplete(value: String | StringDictionary[String]): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
    
    inline def setPass(value: String | StringDictionary[String]): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
  }
}
