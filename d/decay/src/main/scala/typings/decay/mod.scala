package typings.decay

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("decay", "hackerHot")
  @js.native
  def hackerHot(): HackerNewsHotFunction = js.native
  @JSImport("decay", "hackerHot")
  @js.native
  def hackerHot(gravity: Double): HackerNewsHotFunction = js.native
  
  @JSImport("decay", "redditHot")
  @js.native
  def redditHot(): RedditHotFunction = js.native
  @JSImport("decay", "redditHot")
  @js.native
  def redditHot(decay: Double): RedditHotFunction = js.native
  
  @JSImport("decay", "wilsonScore")
  @js.native
  def wilsonScore(): WilsonScoreFunction = js.native
  @JSImport("decay", "wilsonScore")
  @js.native
  def wilsonScore(confidence: Double): WilsonScoreFunction = js.native
  
  type HackerNewsHotFunction = js.Function2[/* votes */ Double, /* date */ Date, Double]
  
  type RedditHotFunction = js.Function3[/* upvotes */ Double, /* downvotes */ Double, /* date */ Date, Double]
  
  type WilsonScoreFunction = js.Function2[/* upvotes */ Double, /* downvotes */ Double, Double]
}
