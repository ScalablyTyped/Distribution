package typings.regexpTreeSaQo4gle.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpTreeSaQo4gle.astMod.CapturingGroup
  - typings.regexpTreeSaQo4gle.astMod.NoncapturingGroup
*/
trait Group
  extends StObject
     with Expression
object Group {
  
  inline def CapturingGroup(number: Double): typings.regexpTreeSaQo4gle.astMod.CapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = true, number = number.asInstanceOf[js.Any], expression = null)
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.CapturingGroup]
  }
  
  inline def NoncapturingGroup(): typings.regexpTreeSaQo4gle.astMod.NoncapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = false, expression = null)
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.NoncapturingGroup]
  }
}
