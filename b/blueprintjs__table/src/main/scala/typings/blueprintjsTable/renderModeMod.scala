package typings.blueprintjsTable

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common/renderMode", JSImport.Namespace)
@js.native
object renderModeMod extends js.Object {
  @js.native
  sealed trait RenderMode extends js.Object
  
  @js.native
  object RenderMode extends js.Object {
    /**
      * Renders cells in batches across multiple animation frames. This improves
      * performance by spreading out work to keep a high FPS and avoid blocking
      * the UI, but it also introduces a noticeable scan-line rendering artifact
      * as successive batches of cells finish rendering.
      */
    @js.native
    sealed trait BATCH extends RenderMode
    
    /**
      * Renders all cells synchronously on initial mount, then renders cells in
      * batches on successive updates (e.g. during scrolling). This helps to
      * remove visual rendering artifacts when the table is first rendered,
      * wihout slowing scrolling performance to a crawl.
      */
    @js.native
    sealed trait BATCH_ON_UPDATE extends RenderMode
    
    /**
      * Disables the batch-rendering behavior, rendering all cells synchronously
      * at once. This may result in degraded performance on large tables and/or
      * on tables with complex cells.
      */
    @js.native
    sealed trait NONE extends RenderMode
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RenderMode with String] = js.native
    /* "batch" */ @js.native
    object BATCH extends TopLevel[BATCH with String]
    
    /* "batch-on-update" */ @js.native
    object BATCH_ON_UPDATE extends TopLevel[BATCH_ON_UPDATE with String]
    
    /* "none" */ @js.native
    object NONE extends TopLevel[NONE with String]
    
  }
  
}

