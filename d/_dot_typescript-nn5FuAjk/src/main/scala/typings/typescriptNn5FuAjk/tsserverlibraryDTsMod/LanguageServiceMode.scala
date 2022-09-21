package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LanguageServiceMode extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "LanguageServiceMode")
@js.native
object LanguageServiceMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LanguageServiceMode & Double] = js.native
  
  @js.native
  sealed trait PartialSemantic
    extends StObject
       with LanguageServiceMode
  /* 1 */ val PartialSemantic: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.LanguageServiceMode.PartialSemantic & Double = js.native
  
  @js.native
  sealed trait Semantic
    extends StObject
       with LanguageServiceMode
  /* 0 */ val Semantic: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.LanguageServiceMode.Semantic & Double = js.native
  
  @js.native
  sealed trait Syntactic
    extends StObject
       with LanguageServiceMode
  /* 2 */ val Syntactic: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.LanguageServiceMode.Syntactic & Double = js.native
}
