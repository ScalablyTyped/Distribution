package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vec3Pool
  extends StObject
     with Pool
object Vec3Pool {
  
  inline def apply(
    constructObject: () => Any,
    get: () => Any,
    objects: js.Array[Any],
    release: () => Any,
    `type`: js.Array[Any]
  ): Vec3Pool = {
    val __obj = js.Dynamic.literal(constructObject = js.Any.fromFunction0(constructObject), get = js.Any.fromFunction0(get), objects = objects.asInstanceOf[js.Any], release = js.Any.fromFunction0(release))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vec3Pool]
  }
}
