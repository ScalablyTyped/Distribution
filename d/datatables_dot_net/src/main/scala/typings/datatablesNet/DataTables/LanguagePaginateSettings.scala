package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguagePaginateSettings extends StObject {
  
  var first: String
  
  var last: String
  
  var next: String
  
  var previous: String
}
object LanguagePaginateSettings {
  
  inline def apply(first: String, last: String, next: String, previous: String): LanguagePaginateSettings = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguagePaginateSettings]
  }
  
  extension [Self <: LanguagePaginateSettings](x: Self) {
    
    inline def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
  }
}
