package typings
package decayLib.decayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decay", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hackerHot(): decayLib.decayMod.HackerNewsHotFunction = js.native
  def hackerHot(gravity: scala.Double): decayLib.decayMod.HackerNewsHotFunction = js.native
  def redditHot(): decayLib.decayMod.RedditHotFunction = js.native
  def redditHot(decay: scala.Double): decayLib.decayMod.RedditHotFunction = js.native
  def wilsonScore(): decayLib.decayMod.WilsonScoreFunction = js.native
  def wilsonScore(confidence: scala.Double): decayLib.decayMod.WilsonScoreFunction = js.native
}

