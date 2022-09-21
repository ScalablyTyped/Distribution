package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionInfoFlags extends StObject
@JSGlobal("ts.CompletionInfoFlags")
@js.native
object CompletionInfoFlags extends StObject {
  
  @js.native
  sealed trait IsContinuation
    extends StObject
       with CompletionInfoFlags
  
  @js.native
  sealed trait IsImportStatementCompletion
    extends StObject
       with CompletionInfoFlags
  
  @js.native
  sealed trait MayIncludeAutoImports
    extends StObject
       with CompletionInfoFlags
  
  @js.native
  sealed trait MayIncludeMethodSnippets
    extends StObject
       with CompletionInfoFlags
  
  @js.native
  sealed trait None
    extends StObject
       with CompletionInfoFlags
  
  @js.native
  sealed trait ResolvedModuleSpecifiers
    extends StObject
       with CompletionInfoFlags
  
  @js.native
  sealed trait ResolvedModuleSpecifiersBeyondLimit
    extends StObject
       with CompletionInfoFlags
}
