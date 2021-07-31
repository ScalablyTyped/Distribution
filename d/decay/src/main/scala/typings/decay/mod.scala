package typings.decay

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("decay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hackerHot(): HackerNewsHotFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("hackerHot")().asInstanceOf[HackerNewsHotFunction]
  @scala.inline
  def hackerHot(gravity: Double): HackerNewsHotFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("hackerHot")(gravity.asInstanceOf[js.Any]).asInstanceOf[HackerNewsHotFunction]
  
  @scala.inline
  def redditHot(): RedditHotFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("redditHot")().asInstanceOf[RedditHotFunction]
  @scala.inline
  def redditHot(decay: Double): RedditHotFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("redditHot")(decay.asInstanceOf[js.Any]).asInstanceOf[RedditHotFunction]
  
  @scala.inline
  def wilsonScore(): WilsonScoreFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("wilsonScore")().asInstanceOf[WilsonScoreFunction]
  @scala.inline
  def wilsonScore(confidence: Double): WilsonScoreFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("wilsonScore")(confidence.asInstanceOf[js.Any]).asInstanceOf[WilsonScoreFunction]
  
  type HackerNewsHotFunction = js.Function2[/* votes */ Double, /* date */ Date, Double]
  
  type RedditHotFunction = js.Function3[/* upvotes */ Double, /* downvotes */ Double, /* date */ Date, Double]
  
  type WilsonScoreFunction = js.Function2[/* upvotes */ Double, /* downvotes */ Double, Double]
}
