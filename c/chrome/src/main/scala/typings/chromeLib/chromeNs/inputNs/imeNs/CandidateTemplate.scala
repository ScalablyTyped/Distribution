package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandidateTemplate extends js.Object {
  /**
    * Optional.
    * Additional text describing the candidate
    */
  var annotation: js.UndefOr[java.lang.String] = js.undefined
  /** The candidate */
  var candidate: java.lang.String
  /** The candidate's id */
  var id: scala.Double
  /**
    * Optional.
    * Short string displayed to next to the candidate, often the shortcut key or index
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional.
    * The id to add these candidates under
    */
  var parentId: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional.
    * The usage or detail description of word.
    */
  var usage: js.UndefOr[CandidateUsage] = js.undefined
}

object CandidateTemplate {
  @scala.inline
  def apply(
    candidate: java.lang.String,
    id: scala.Double,
    annotation: java.lang.String = null,
    label: java.lang.String = null,
    parentId: scala.Int | scala.Double = null,
    usage: CandidateUsage = null
  ): CandidateTemplate = {
    val __obj = js.Dynamic.literal(candidate = candidate, id = id)
    if (annotation != null) __obj.updateDynamic("annotation")(annotation)
    if (label != null) __obj.updateDynamic("label")(label)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage)
    __obj.asInstanceOf[CandidateTemplate]
  }
}

