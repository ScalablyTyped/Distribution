package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Matrix")
@js.native
open class Matrix protected ()
  extends typings.blackEngine.matrixMod.Matrix {
  def this(
    a: js.UndefOr[Double],
    b: js.UndefOr[Double],
    c: js.UndefOr[Double],
    d: js.UndefOr[Double],
    tx: js.UndefOr[Double],
    ty: js.UndefOr[Double]
  ) = this()
}
object Matrix {
  
  @JSImport("black-engine", "Matrix.__cache")
  @js.native
  val cache: typings.blackEngine.matrixMod.Matrix = js.native
  
  @JSImport("black-engine", "Matrix.__identity")
  @js.native
  val identity: typings.blackEngine.matrixMod.Matrix = js.native
  
  @JSImport("black-engine", "Matrix.pool")
  @js.native
  val pool: typings.blackEngine.objectPoolMod.ObjectPool = js.native
}
