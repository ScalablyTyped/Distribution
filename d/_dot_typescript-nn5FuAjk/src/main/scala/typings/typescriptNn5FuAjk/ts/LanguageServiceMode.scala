package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LanguageServiceMode extends StObject
@JSGlobal("ts.LanguageServiceMode")
@js.native
object LanguageServiceMode extends StObject {
  
  @js.native
  sealed trait PartialSemantic
    extends StObject
       with LanguageServiceMode
  
  @js.native
  sealed trait Semantic
    extends StObject
       with LanguageServiceMode
  
  @js.native
  sealed trait Syntactic
    extends StObject
       with LanguageServiceMode
}
