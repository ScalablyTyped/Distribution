package typings.businessDashRulesDashEngine.nodeDashValidatorsMod

import typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod.IStringValidator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine/node-validators", "RangeLengthValidator")
@js.native
class RangeLengthValidator () extends IStringValidator {
  def this(RangeLength: js.Array[Double]) = this()
  var MaxLength: Double = js.native
  var MinLength: Double = js.native
  var RangeLength: js.Array[Double] = js.native
  @JSName("tagName")
  var tagName_RangeLengthValidator: String = js.native
  /* CompleteClass */
  override def isAcceptable(s: String): Boolean = js.native
  /* CompleteClass */
  override def isAcceptable(s: js.Any): Boolean = js.native
}

