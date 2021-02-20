package typings.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.SAPBroadphase")
@js.native
class SAPBroadphase ()
  extends typings.cannon.CANNON.SAPBroadphase {
  def this(world: typings.cannon.CANNON.World) = this()
}
/* static members */
object SAPBroadphase {
  
  @JSGlobal("CANNON.SAPBroadphase.checkBounds")
  @js.native
  def checkBounds(bi: typings.cannon.CANNON.Body, bj: typings.cannon.CANNON.Body): Boolean = js.native
  @JSGlobal("CANNON.SAPBroadphase.checkBounds")
  @js.native
  def checkBounds(bi: typings.cannon.CANNON.Body, bj: typings.cannon.CANNON.Body, axisIndex: Double): Boolean = js.native
  
  @JSGlobal("CANNON.SAPBroadphase.insertionSortX")
  @js.native
  def insertionSortX(a: js.Array[_]): js.Array[_] = js.native
  
  @JSGlobal("CANNON.SAPBroadphase.insertionSortY")
  @js.native
  def insertionSortY(a: js.Array[_]): js.Array[_] = js.native
  
  @JSGlobal("CANNON.SAPBroadphase.insertionSortZ")
  @js.native
  def insertionSortZ(a: js.Array[_]): js.Array[_] = js.native
}
