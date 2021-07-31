package typings.cannon.global.CANNON

import typings.cannon.CANNON.IContactMaterialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.ContactMaterial")
@js.native
class ContactMaterial protected ()
  extends StObject
     with typings.cannon.CANNON.ContactMaterial {
  def this(m1: typings.cannon.CANNON.Material, m2: typings.cannon.CANNON.Material) = this()
  def this(
    m1: typings.cannon.CANNON.Material,
    m2: typings.cannon.CANNON.Material,
    options: IContactMaterialOptions
  ) = this()
  
  /* CompleteClass */
  var contactEquationRelaxation: Double = js.native
  
  /* CompleteClass */
  var contactEquationStiffness: Double = js.native
  
  /* CompleteClass */
  var friction: Double = js.native
  
  /* CompleteClass */
  var frictionEquationRelaxation: Double = js.native
  
  /* CompleteClass */
  var frictionEquationStiffness: Double = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var materials: js.Array[typings.cannon.CANNON.Material] = js.native
  
  /* CompleteClass */
  var restitution: Double = js.native
}
