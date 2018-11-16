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

