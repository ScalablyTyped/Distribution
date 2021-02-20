package typings.cannon.mod

import typings.cannon.anon.BOX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Shape")
@js.native
class Shape ()
  extends typings.cannon.CANNON.Shape
/* static members */
object Shape {
  
  @JSImport("cannon", "Shape")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cannon", "Shape.types")
  @js.native
  def types: BOX = js.native
  @scala.inline
  def types_=(x: BOX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
}
