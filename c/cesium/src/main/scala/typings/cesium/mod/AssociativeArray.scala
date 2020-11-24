package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "AssociativeArray")
@js.native
class AssociativeArray () extends js.Object {
  
  def contains(key: String): Boolean = js.native
  def contains(key: Double): Boolean = js.native
  
  def get(key: String): js.Any = js.native
  def get(key: Double): js.Any = js.native
  
  var length: Double = js.native
  
  def remove(key: String): Boolean = js.native
  def remove(key: Double): Boolean = js.native
  
  def removeAll(): Unit = js.native
  
  def set(key: String, value: js.Any): Unit = js.native
  def set(key: Double, value: js.Any): Unit = js.native
  
  var values: js.Array[_] = js.native
}
