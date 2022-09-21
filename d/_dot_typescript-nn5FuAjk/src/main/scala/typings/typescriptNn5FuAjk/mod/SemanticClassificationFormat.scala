package typings.typescriptNn5FuAjk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemanticClassificationFormat extends StObject
@JSImport(".typescript-nn5FuAjk", "SemanticClassificationFormat")
@js.native
object SemanticClassificationFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[SemanticClassificationFormat & java.lang.String] = js.native
  
  @js.native
  sealed trait Original
    extends StObject
       with SemanticClassificationFormat
  /* "original" */ val Original: typings.typescriptNn5FuAjk.mod.SemanticClassificationFormat.Original & java.lang.String = js.native
  
  @js.native
  sealed trait TwentyTwenty
    extends StObject
       with SemanticClassificationFormat
  /* "2020" */ val TwentyTwenty: typings.typescriptNn5FuAjk.mod.SemanticClassificationFormat.TwentyTwenty & java.lang.String = js.native
}
