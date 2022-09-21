package typings.baseui

import typings.baseui.anon.Query
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textSearchMod {
  
  @JSImport("baseui/data-table/text-search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/data-table/text-search", "HighlightCellText")
  @js.native
  val HighlightCellText: FC[Query] = js.native
  
  inline def matchesQuery(text: String, query: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesQuery")(text.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def splitByQuery(text: String, query: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitByQuery")(text.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
