package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemicolonPreference extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.protocol.SemicolonPreference")
@js.native
object SemicolonPreference extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SemicolonPreference & String] = js.native
  
  @js.native
  sealed trait Ignore
    extends StObject
       with SemicolonPreference
  /* "ignore" */ val Ignore: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.SemicolonPreference.Ignore & String = js.native
  
  @js.native
  sealed trait Insert
    extends StObject
       with SemicolonPreference
  /* "insert" */ val Insert: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.SemicolonPreference.Insert & String = js.native
  
  @js.native
  sealed trait Remove
    extends StObject
       with SemicolonPreference
  /* "remove" */ val Remove: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.SemicolonPreference.Remove & String = js.native
}
