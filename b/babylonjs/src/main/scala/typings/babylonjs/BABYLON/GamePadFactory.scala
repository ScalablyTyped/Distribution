package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GamePadFactory extends StObject {
  
  /**
    * Returns whether or not the current gamepad can be created for this type of controller.
    * @param gamepadInfo Defines the gamepad info as received from the controller APIs.
    * @returns true if it can be created, otherwise false
    */
  def canCreate(gamepadInfo: js.Any): Boolean = js.native
  
  /**
    * Creates a new instance of the Gamepad.
    * @param gamepadInfo Defines the gamepad info as received from the controller APIs.
    * @returns the new gamepad instance
    */
  def create(gamepadInfo: js.Any): Gamepad = js.native
}
object GamePadFactory {
  
  @scala.inline
  def apply(canCreate: js.Any => Boolean, create: js.Any => Gamepad): GamePadFactory = {
    val __obj = js.Dynamic.literal(canCreate = js.Any.fromFunction1(canCreate), create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[GamePadFactory]
  }
  
  @scala.inline
  implicit class GamePadFactoryMutableBuilder[Self <: GamePadFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanCreate(value: js.Any => Boolean): Self = StObject.set(x, "canCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreate(value: js.Any => Gamepad): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
