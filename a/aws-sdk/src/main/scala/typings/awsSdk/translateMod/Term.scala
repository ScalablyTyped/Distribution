package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Term extends js.Object {
  /**
    * The source text of the term being translated by the custom terminology.
    */
  var SourceText: js.UndefOr[String] = js.native
  /**
    * The target text of the term being translated by the custom terminology.
    */
  var TargetText: js.UndefOr[String] = js.native
}

object Term {
  @scala.inline
  def apply(SourceText: String = null, TargetText: String = null): Term = {
    val __obj = js.Dynamic.literal()
    if (SourceText != null) __obj.updateDynamic("SourceText")(SourceText.asInstanceOf[js.Any])
    if (TargetText != null) __obj.updateDynamic("TargetText")(TargetText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Term]
  }
}

