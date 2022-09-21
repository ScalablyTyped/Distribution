package typings.chocolatechipjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Headers Interface. This defines the methods exposed by the Headers object.
  */
@js.native
trait Headers extends StObject {
  
  def apply(): Unit = js.native
  def apply(headers: Any): Unit = js.native
  
  def append(name: String, value: String): Unit = js.native
  
  def delete(name: String): Any = js.native
  
  def forEach(callback: js.Function, thisArg: Any): Any = js.native
  
  def get(name: String): Any = js.native
  
  def getAll(name: String): Any = js.native
  
  def has(name: String): Any = js.native
  
  def set(name: String, value: String): Any = js.native
}
