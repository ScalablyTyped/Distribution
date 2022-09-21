package typings.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Row
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  def forEach(callback: js.Function1[/* row */ this.type, Unit]): Unit = js.native
  
  def get(columnName: String): Any = js.native
  def get(columnName: Double): Any = js.native
  
  def keys(): js.Array[String] = js.native
  
  def values(): js.Array[Any] = js.native
}
