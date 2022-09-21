package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemicolonPreference extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "SemicolonPreference")
@js.native
object SemicolonPreference extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[SemicolonPreference & java.lang.String] = js.native
  
  @js.native
  sealed trait Ignore
    extends StObject
       with SemicolonPreference
  /* "ignore" */ val Ignore: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SemicolonPreference.Ignore & java.lang.String = js.native
  
  @js.native
  sealed trait Insert
    extends StObject
       with SemicolonPreference
  /* "insert" */ val Insert: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SemicolonPreference.Insert & java.lang.String = js.native
  
  @js.native
  sealed trait Remove
    extends StObject
       with SemicolonPreference
  /* "remove" */ val Remove: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SemicolonPreference.Remove & java.lang.String = js.native
}
