package typings
package decayLib.decayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decay", JSImport.Namespace)
@js.native
object decayModMembers extends js.Object {
  def hackerHot(): HackerNewsHotFunction = js.native
  def hackerHot(gravity: scala.Double): HackerNewsHotFunction = js.native
  def redditHot(): RedditHotFunction = js.native
  def redditHot(decay: scala.Double): RedditHotFunction = js.native
  def wilsonScore(): WilsonScoreFunction = js.native
  def wilsonScore(confidence: scala.Double): WilsonScoreFunction = js.native
}

