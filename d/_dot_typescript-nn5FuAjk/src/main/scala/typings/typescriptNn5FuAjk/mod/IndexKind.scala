package typings.typescriptNn5FuAjk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndexKind extends StObject
@JSImport(".typescript-nn5FuAjk", "IndexKind")
@js.native
object IndexKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexKind & Double] = js.native
  
  @js.native
  sealed trait Number
    extends StObject
       with IndexKind
  /* 1 */ val Number: typings.typescriptNn5FuAjk.mod.IndexKind.Number & Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with IndexKind
  /* 0 */ val String: typings.typescriptNn5FuAjk.mod.IndexKind.String & Double = js.native
}
