package typings.blackEngine.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Engine")
@js.native
open class Engine protected ()
  extends typings.blackEngine.engineMod.Engine {
  def this(
    containerElementId: String,
    gameClass: Instantiable0[typings.blackEngine.gameObjectMod.GameObject],
    videoDriverClass: Instantiable3[
        /* arg1 */ HTMLElement, 
        /* arg2 */ Double, 
        /* arg3 */ Double, 
        typings.blackEngine.videoNullDriverMod.VideoNullDriver
      ]
  ) = this()
  def this(
    containerElementId: String,
    gameClass: Instantiable0[typings.blackEngine.gameObjectMod.GameObject],
    videoDriverClass: Instantiable3[
        /* arg1 */ HTMLElement, 
        /* arg2 */ Double, 
        /* arg3 */ Double, 
        typings.blackEngine.videoNullDriverMod.VideoNullDriver
      ],
    systemClasses: js.Array[Instantiable0[typings.blackEngine.systemMod.System]]
  ) = this()
}
