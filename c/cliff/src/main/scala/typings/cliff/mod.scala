package typings.cliff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cliff", "inspect")
  @js.native
  def inspect(obj: js.Any): String = js.native
  
  @JSImport("cliff", "putObject")
  @js.native
  def putObject(level: String, `object`: js.Any): Unit = js.native
  @JSImport("cliff", "putObject")
  @js.native
  def putObject(level: String, `object`: js.Any, rewriters: js.UndefOr[scala.Nothing], padding: js.Any): Unit = js.native
  @JSImport("cliff", "putObject")
  @js.native
  def putObject(level: String, `object`: js.Any, rewriters: js.Any): Unit = js.native
  @JSImport("cliff", "putObject")
  @js.native
  def putObject(level: String, `object`: js.Any, rewriters: js.Any, padding: js.Any): Unit = js.native
  
  @JSImport("cliff", "putObjectRows")
  @js.native
  def putObjectRows(level: String, rows: js.Array[js.Object], keys: js.Array[String]): Unit = js.native
  @JSImport("cliff", "putObjectRows")
  @js.native
  def putObjectRows(level: String, rows: js.Array[js.Object], keys: js.Array[String], colors: js.Array[String]): Unit = js.native
  
  @JSImport("cliff", "putRows")
  @js.native
  def putRows(level: String, rows: js.Array[js.Array[String]]): Unit = js.native
  @JSImport("cliff", "putRows")
  @js.native
  def putRows(level: String, rows: js.Array[js.Array[String]], colors: js.Array[String]): Unit = js.native
  
  @JSImport("cliff", "stringifyObjectRows")
  @js.native
  def stringifyObjectRows(rows: js.Array[js.Object], keys: js.Array[String]): String = js.native
  @JSImport("cliff", "stringifyObjectRows")
  @js.native
  def stringifyObjectRows(rows: js.Array[js.Object], keys: js.Array[String], colors: js.Array[String]): String = js.native
  
  @JSImport("cliff", "stringifyRows")
  @js.native
  def stringifyRows(rows: js.Array[js.Array[String]]): String = js.native
  @JSImport("cliff", "stringifyRows")
  @js.native
  def stringifyRows(rows: js.Array[js.Array[String]], colors: js.Array[String]): String = js.native
}
