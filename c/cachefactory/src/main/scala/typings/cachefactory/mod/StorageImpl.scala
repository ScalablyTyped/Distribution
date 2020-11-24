package typings.cachefactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageImpl extends js.Object {
  
  def getItem(key: String): js.Any = js.native
  def getItem(key: Double): js.Any = js.native
  
  def removeItem(key: String): Unit = js.native
  def removeItem(key: Double): Unit = js.native
  
  def setItem(key: String, value: js.Any): Unit = js.native
  def setItem(key: Double, value: js.Any): Unit = js.native
}
