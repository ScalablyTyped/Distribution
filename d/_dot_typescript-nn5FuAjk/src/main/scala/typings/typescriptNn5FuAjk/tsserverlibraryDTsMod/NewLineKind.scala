package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NewLineKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "NewLineKind")
@js.native
object NewLineKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NewLineKind & Double] = js.native
  
  @js.native
  sealed trait CarriageReturnLineFeed
    extends StObject
       with NewLineKind
  /* 0 */ val CarriageReturnLineFeed: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.NewLineKind.CarriageReturnLineFeed & Double = js.native
  
  @js.native
  sealed trait LineFeed
    extends StObject
       with NewLineKind
  /* 1 */ val LineFeed: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.NewLineKind.LineFeed & Double = js.native
}
