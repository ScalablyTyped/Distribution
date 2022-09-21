package typings.regexpTreeSaQo4gle.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpTreeSaQo4gle.astMod.NumericBackreference
  - typings.regexpTreeSaQo4gle.astMod.NamedBackreference
*/
trait Backreference
  extends StObject
     with Expression
object Backreference {
  
  inline def NamedBackreference(number: Double, reference: String, referenceRaw: String): typings.regexpTreeSaQo4gle.astMod.NamedBackreference = {
    val __obj = js.Dynamic.literal(kind = "name", number = number.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], referenceRaw = referenceRaw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.NamedBackreference]
  }
  
  inline def NumericBackreference(number: Double, reference: Double): typings.regexpTreeSaQo4gle.astMod.NumericBackreference = {
    val __obj = js.Dynamic.literal(kind = "number", number = number.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.NumericBackreference]
  }
}
