package typings.typescriptNn5FuAjk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NewLineKind extends StObject
@JSImport(".typescript-nn5FuAjk", "NewLineKind")
@js.native
object NewLineKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NewLineKind & Double] = js.native
  
  @js.native
  sealed trait CarriageReturnLineFeed
    extends StObject
       with NewLineKind
  /* 0 */ val CarriageReturnLineFeed: typings.typescriptNn5FuAjk.mod.NewLineKind.CarriageReturnLineFeed & Double = js.native
  
  @js.native
  sealed trait LineFeed
    extends StObject
       with NewLineKind
  /* 1 */ val LineFeed: typings.typescriptNn5FuAjk.mod.NewLineKind.LineFeed & Double = js.native
}
