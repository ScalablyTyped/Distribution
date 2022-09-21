package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Stage")
@js.native
/**
  * Hide ctor from the rest of the world.
  * @param items The items to add.
  */
/* private */ open class Stage[T /* <: js.Function */] ()
  extends StObject
     with typings.babylonjs.BABYLON.Stage[T]
/* static members */
object Stage {
  
  @JSGlobal("BABYLON.Stage")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Stage.
    * @returns A new instance of a Stage
    */
  inline def Create[T /* <: js.Function */](): typings.babylonjs.BABYLON.Stage[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Create")().asInstanceOf[typings.babylonjs.BABYLON.Stage[T]]
}
