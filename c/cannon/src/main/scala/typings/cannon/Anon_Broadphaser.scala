package typings.cannon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Broadphaser extends js.Object {
  var broadphaser: Double
  var integrate: Double
  var makeContactConstraints: Double
  var narrowphase: Double
  var solve: Double
}

object Anon_Broadphaser {
  @scala.inline
  def apply(
    broadphaser: Double,
    integrate: Double,
    makeContactConstraints: Double,
    narrowphase: Double,
    solve: Double
  ): Anon_Broadphaser = {
    val __obj = js.Dynamic.literal(broadphaser = broadphaser, integrate = integrate, makeContactConstraints = makeContactConstraints, narrowphase = narrowphase, solve = solve)
  
    __obj.asInstanceOf[Anon_Broadphaser]
  }
}

