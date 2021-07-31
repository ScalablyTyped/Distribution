package typings.cliff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cliff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def inspect(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def putObject(level: String, `object`: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putObject")(level.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def putObject(level: String, `object`: js.Any, rewriters: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putObject")(level.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], rewriters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def putObject(level: String, `object`: js.Any, rewriters: js.Any, padding: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putObject")(level.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], rewriters.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def putObject(level: String, `object`: js.Any, rewriters: Unit, padding: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putObject")(level.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], rewriters.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def putObjectRows(level: String, rows: js.Array[js.Object], keys: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putObjectRows")(level.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def putObjectRows(level: String, rows: js.Array[js.Object], keys: js.Array[String], colors: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putObjectRows")(level.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def putRows(level: String, rows: js.Array[js.Array[String]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putRows")(level.asInstanceOf[js.Any], rows.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def putRows(level: String, rows: js.Array[js.Array[String]], colors: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putRows")(level.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def stringifyObjectRows(rows: js.Array[js.Object], keys: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyObjectRows")(rows.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringifyObjectRows(rows: js.Array[js.Object], keys: js.Array[String], colors: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyObjectRows")(rows.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def stringifyRows(rows: js.Array[js.Array[String]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyRows")(rows.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringifyRows(rows: js.Array[js.Array[String]], colors: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyRows")(rows.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[String]
}
