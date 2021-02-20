package typings.csvrow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csvrow", "normalize")
  @js.native
  def normalize(row: String): String = js.native
  
  @JSImport("csvrow", "parse")
  @js.native
  def parse(row: String): js.Array[String] = js.native
  
  @JSImport("csvrow", "stringify")
  @js.native
  def stringify(columns: js.Array[String]): String = js.native
}
