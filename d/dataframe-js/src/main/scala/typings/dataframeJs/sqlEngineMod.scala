package typings.dataframeJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlEngineMod {
  
  @JSImport("dataframe-js/modules/sql/sqlEngine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(query: Any, tables: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], tables.asInstanceOf[js.Any])).asInstanceOf[Any]
}
