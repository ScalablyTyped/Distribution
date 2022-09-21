package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartRegistry extends StObject {
  
  def clear(): Unit = js.native
  def clear(group: String): Unit = js.native
  
  def deregister(chart: BaseMixin[Any]): Unit = js.native
  def deregister(chart: BaseMixin[Any], group: String): Unit = js.native
  
  def has(chart: BaseMixin[Any]): Boolean = js.native
  
  def list(): js.Array[BaseMixin[Any]] = js.native
  def list(group: String): js.Array[BaseMixin[Any]] = js.native
  
  def register(chart: BaseMixin[Any]): Unit = js.native
  def register(chart: BaseMixin[Any], group: String): Unit = js.native
}
