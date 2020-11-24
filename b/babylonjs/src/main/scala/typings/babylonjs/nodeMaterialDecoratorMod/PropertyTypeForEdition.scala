package typings.babylonjs.nodeMaterialDecoratorMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PropertyTypeForEdition extends js.Object
@JSImport("babylonjs/Materials/Node/nodeMaterialDecorator", "PropertyTypeForEdition")
@js.native
object PropertyTypeForEdition extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertyTypeForEdition with Double] = js.native
  
  /** property is a boolean */
  @js.native
  sealed trait Boolean extends PropertyTypeForEdition
  /* 0 */ @js.native
  object Boolean extends TopLevel[Boolean with Double]
  
  /** property is a float */
  @js.native
  sealed trait Float extends PropertyTypeForEdition
  /* 1 */ @js.native
  object Float extends TopLevel[Float with Double]
  
  /** property is a list of values */
  @js.native
  sealed trait List extends PropertyTypeForEdition
  /* 3 */ @js.native
  object List extends TopLevel[List with Double]
  
  /** property is a Vector2 */
  @js.native
  sealed trait Vector2 extends PropertyTypeForEdition
  /* 2 */ @js.native
  object Vector2 extends TopLevel[Vector2 with Double]
}
