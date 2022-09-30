package typings.catalog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.catalog.mod.ConfigPage
  - typings.catalog.mod.ConfigPageGroup
*/
trait ConfigPageOrGroup extends StObject
object ConfigPageOrGroup {
  
  inline def ConfigPage(path: String, title: String): typings.catalog.mod.ConfigPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.catalog.mod.ConfigPage]
  }
  
  inline def ConfigPageGroup(pages: js.Array[ConfigPage], title: String): typings.catalog.mod.ConfigPageGroup = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.catalog.mod.ConfigPageGroup]
  }
}
