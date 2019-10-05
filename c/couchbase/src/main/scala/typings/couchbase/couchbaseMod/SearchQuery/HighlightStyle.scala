package typings.couchbase.couchbaseMod.SearchQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HighlightStyle extends js.Object

/**
  * Enumeration for specifying FTS highlight styling.
  */
@JSImport("couchbase", "SearchQuery.HighlightStyle")
@js.native
object HighlightStyle extends js.Object {
  /**
    * This causes hits to be highlighted with ANSI character codes.
    */
  @js.native
  sealed trait ANSI extends HighlightStyle
  
  /**
    * This causes hits to be highlighted using the default style.
    */
  @js.native
  sealed trait DEFAULT extends HighlightStyle
  
  /**
    * This causes hits to be highlighted using HTML tags.
    */
  @js.native
  sealed trait HTML extends HighlightStyle
  
  /* 2 */ val ANSI: typings.couchbase.couchbaseMod.SearchQuery.HighlightStyle.ANSI with Double = js.native
  /* 0 */ val DEFAULT: typings.couchbase.couchbaseMod.SearchQuery.HighlightStyle.DEFAULT with Double = js.native
  /* 1 */ val HTML: typings.couchbase.couchbaseMod.SearchQuery.HighlightStyle.HTML with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HighlightStyle with Double] = js.native
}

