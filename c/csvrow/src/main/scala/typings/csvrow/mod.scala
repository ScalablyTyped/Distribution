package typings.csvrow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csvrow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalize(row: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(row.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(row: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(row.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def stringify(columns: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(columns.asInstanceOf[js.Any]).asInstanceOf[String]
}
