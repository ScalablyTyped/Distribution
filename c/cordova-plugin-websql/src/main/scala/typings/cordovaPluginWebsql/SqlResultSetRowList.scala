package typings.cordovaPluginWebsql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlResultSetRowList extends StObject {
  
  def item(index: Double): js.Object
  
  var length: Double
}
object SqlResultSetRowList {
  
  @scala.inline
  def apply(item: Double => js.Object, length: Double): SqlResultSetRowList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlResultSetRowList]
  }
  
  @scala.inline
  implicit class SqlResultSetRowListMutableBuilder[Self <: SqlResultSetRowList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: Double => js.Object): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
