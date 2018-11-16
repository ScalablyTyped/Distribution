package typings
package businessDashRulesDashEngineLib.nodeDashValidatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "RangeLengthValidator")
@js.native
class RangeLengthValidator ()
  extends businessDashRulesDashEngineLib.businessDashRulesDashEngineMod.IStringValidator {
  def this(RangeLength: js.Array[scala.Double]) = this()
  var MaxLength: scala.Double = js.native
  var MinLength: scala.Double = js.native
  var RangeLength: js.Array[scala.Double] = js.native
  @JSName("tagName")
  var tagName_RangeLengthValidator: java.lang.String = js.native
  /* CompleteClass */
  override def isAcceptable(s: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): scala.Boolean = js.native
}

