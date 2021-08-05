package typings.baseui.selectMod

import typings.baseui.baseuiStrings.search
import typings.baseui.baseuiStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TYPE extends StObject {
  
  var search: typings.baseui.baseuiStrings.search
  
  var select: typings.baseui.baseuiStrings.select
}
object TYPE {
  
  @JSImport("baseui/select", "TYPE")
  @js.native
  val ^ : TYPE = js.native
  
  extension [Self <: TYPE](x: Self) {
    
    inline def setSearch(value: search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: select): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
  }
}
