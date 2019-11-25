package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandidateTemplate extends js.Object {
  /**
    * Optional.
    * Additional text describing the candidate
    */
  var annotation: js.UndefOr[String] = js.undefined
  /** The candidate */
  var candidate: String
  /** The candidate's id */
  var id: Double
  /**
    * Optional.
    * Short string displayed to next to the candidate, often the shortcut key or index
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Optional.
    * The id to add these candidates under
    */
  var parentId: js.UndefOr[Double] = js.undefined
  /**
    * Optional.
    * The usage or detail description of word.
    */
  var usage: js.UndefOr[CandidateUsage] = js.undefined
}

object CandidateTemplate {
  @scala.inline
  def apply(
    candidate: String,
    id: Double,
    annotation: String = null,
    label: String = null,
    parentId: Int | Double = null,
    usage: CandidateUsage = null
  ): CandidateTemplate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandidateTemplate]
  }
}

