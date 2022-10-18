package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Pair")
@js.native
open class Pair ()
  extends typings.blackEngine.physicsArcadePairsPairMod.Pair
/* static members */
object Pair {
  
  @JSImport("black-engine", "Pair")
  @js.native
  val ^ : js.Any = js.native
  
  inline def __id(
    a: typings.blackEngine.collidersColliderMod.Collider,
    b: typings.blackEngine.collidersColliderMod.Collider
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("__id")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
}
