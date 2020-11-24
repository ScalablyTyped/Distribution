package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PropertyTypeForEdition extends js.Object
@JSGlobal("BABYLON.PropertyTypeForEdition")
@js.native
object PropertyTypeForEdition extends js.Object {
  
  /** property is a boolean */
  @js.native
  sealed trait Boolean extends PropertyTypeForEdition
  
  /** property is a float */
  @js.native
  sealed trait Float extends PropertyTypeForEdition
  
  /** property is a list of values */
  @js.native
  sealed trait List extends PropertyTypeForEdition
  
  /** property is a Vector2 */
  @js.native
  sealed trait Vector2 extends PropertyTypeForEdition
}
