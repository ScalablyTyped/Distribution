package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Polygon")
@js.native
open class Polygon ()
  extends typings.blackEngine.polygonMod.Polygon {
  def this(vertices: js.Array[typings.blackEngine.vectorMod.Vector]) = this()
}
/* static members */
object Polygon {
  
  @JSImport("black-engine", "Polygon")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("black-engine", "Polygon.__cache")
  @js.native
  val cache: typings.blackEngine.polygonMod.Polygon = js.native
  
  inline def fromPath(path: String): typings.blackEngine.polygonMod.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")(path.asInstanceOf[js.Any]).asInstanceOf[typings.blackEngine.polygonMod.Polygon]
}
