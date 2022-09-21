package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PropertyTypeForEdition extends StObject
@JSGlobal("BABYLON.PropertyTypeForEdition")
@js.native
object PropertyTypeForEdition extends StObject {
  
  /** property is a boolean */
  @js.native
  sealed trait Boolean
    extends StObject
       with PropertyTypeForEdition
  
  /** property is a float */
  @js.native
  sealed trait Float
    extends StObject
       with PropertyTypeForEdition
  
  /** property is a int */
  @js.native
  sealed trait Int
    extends StObject
       with PropertyTypeForEdition
  
  /** property is a list of values */
  @js.native
  sealed trait List
    extends StObject
       with PropertyTypeForEdition
  
  /** property is a Vector2 */
  @js.native
  sealed trait Vector2
    extends StObject
       with PropertyTypeForEdition
}
