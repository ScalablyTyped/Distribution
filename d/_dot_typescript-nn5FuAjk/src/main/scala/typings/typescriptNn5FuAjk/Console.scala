package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Console extends StObject {
  
  def assert(condition: scala.Boolean, data: Any*): Unit = js.native
  def assert(condition: Unit, data: Any*): Unit = js.native
  
  def clear(): Unit = js.native
  
  def count(): Unit = js.native
  def count(label: java.lang.String): Unit = js.native
  
  def countReset(): Unit = js.native
  def countReset(label: java.lang.String): Unit = js.native
  
  def debug(data: Any*): Unit = js.native
  
  def dir(): Unit = js.native
  def dir(item: Any): Unit = js.native
  def dir(item: Any, options: Any): Unit = js.native
  def dir(item: Unit, options: Any): Unit = js.native
  
  def dirxml(data: Any*): Unit = js.native
  
  def error(data: Any*): Unit = js.native
  
  def group(data: Any*): Unit = js.native
  
  def groupCollapsed(data: Any*): Unit = js.native
  
  def groupEnd(): Unit = js.native
  
  def info(data: Any*): Unit = js.native
  
  def log(data: Any*): Unit = js.native
  
  def table(): Unit = js.native
  def table(tabularData: Any): Unit = js.native
  def table(tabularData: Any, properties: Array[java.lang.String]): Unit = js.native
  def table(tabularData: Unit, properties: Array[java.lang.String]): Unit = js.native
  
  def time(): Unit = js.native
  def time(label: java.lang.String): Unit = js.native
  
  def timeEnd(): Unit = js.native
  def timeEnd(label: java.lang.String): Unit = js.native
  
  def timeLog(label: java.lang.String, data: Any*): Unit = js.native
  def timeLog(label: Unit, data: Any*): Unit = js.native
  
  def timeStamp(): Unit = js.native
  def timeStamp(label: java.lang.String): Unit = js.native
  
  def trace(data: Any*): Unit = js.native
  
  def warn(data: Any*): Unit = js.native
}
