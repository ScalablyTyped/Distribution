package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EndOfLineState extends StObject
@JSGlobal("ts.EndOfLineState")
@js.native
object EndOfLineState extends StObject {
  
  @js.native
  sealed trait InDoubleQuoteStringLiteral
    extends StObject
       with EndOfLineState
  
  @js.native
  sealed trait InMultiLineCommentTrivia
    extends StObject
       with EndOfLineState
  
  @js.native
  sealed trait InSingleQuoteStringLiteral
    extends StObject
       with EndOfLineState
  
  @js.native
  sealed trait InTemplateHeadOrNoSubstitutionTemplate
    extends StObject
       with EndOfLineState
  
  @js.native
  sealed trait InTemplateMiddleOrTail
    extends StObject
       with EndOfLineState
  
  @js.native
  sealed trait InTemplateSubstitutionPosition
    extends StObject
       with EndOfLineState
  
  @js.native
  sealed trait None
    extends StObject
       with EndOfLineState
}
