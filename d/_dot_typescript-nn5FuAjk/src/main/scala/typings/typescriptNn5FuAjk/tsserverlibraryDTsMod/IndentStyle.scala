package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndentStyle extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "IndentStyle")
@js.native
object IndentStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndentStyle & Double] = js.native
  
  @js.native
  sealed trait Block
    extends StObject
       with IndentStyle
  /* 1 */ val Block: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.IndentStyle.Block & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with IndentStyle
  /* 0 */ val None: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.IndentStyle.None & Double = js.native
  
  @js.native
  sealed trait Smart
    extends StObject
       with IndentStyle
  /* 2 */ val Smart: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.IndentStyle.Smart & Double = js.native
}
