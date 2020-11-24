package typings.chocolatechipjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Headers Interface. This defines the methods exposed by the Headers object.
  */
@js.native
trait Headers extends js.Object {
  
  def apply(): Unit = js.native
  def apply(headers: js.Any): Unit = js.native
  
  def append(name: String, value: String): Unit = js.native
  
  def delete(name: String): js.Any = js.native
  
  def forEach(callback: js.Function, thisArg: js.Any): js.Any = js.native
  
  def get(name: String): js.Any = js.native
  
  def getAll(name: String): js.Any = js.native
  
  def has(name: String): js.Any = js.native
  
  def set(name: String, value: String): js.Any = js.native
}
