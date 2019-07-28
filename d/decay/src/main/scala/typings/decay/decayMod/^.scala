package typings.decay.decayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decay", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hackerHot(): HackerNewsHotFunction = js.native
  def hackerHot(gravity: Double): HackerNewsHotFunction = js.native
  def redditHot(): RedditHotFunction = js.native
  def redditHot(decay: Double): RedditHotFunction = js.native
  def wilsonScore(): WilsonScoreFunction = js.native
  def wilsonScore(confidence: Double): WilsonScoreFunction = js.native
}

