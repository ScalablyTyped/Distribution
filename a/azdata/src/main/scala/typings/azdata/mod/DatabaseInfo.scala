package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseInfo extends StObject {
  
  var options: StringDictionary[js.Any]
}
object DatabaseInfo {
  
  @scala.inline
  def apply(options: StringDictionary[js.Any]): DatabaseInfo = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseInfo]
  }
  
  @scala.inline
  implicit class DatabaseInfoMutableBuilder[Self <: DatabaseInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
