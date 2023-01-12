package typings.baseui.anon

import typings.baseui.baseuiStrings.search
import typings.baseui.baseuiStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Search extends StObject {
  
  val search: typings.baseui.baseuiStrings.search
  
  val select: typings.baseui.baseuiStrings.select
}
object Search {
  
  inline def apply(): Search = {
    val __obj = js.Dynamic.literal(search = "search", select = "select")
    __obj.asInstanceOf[Search]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Search] (val x: Self) extends AnyVal {
    
    inline def setSearch(value: search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: select): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
  }
}
