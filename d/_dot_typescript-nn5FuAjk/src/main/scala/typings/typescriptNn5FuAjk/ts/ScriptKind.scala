package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptKind extends StObject
@JSGlobal("ts.ScriptKind")
@js.native
object ScriptKind extends StObject {
  
  /**
    * Used on extensions that doesn't define the ScriptKind but the content defines it.
    * Deferred extensions are going to be included in all project contexts.
    */
  @js.native
  sealed trait Deferred
    extends StObject
       with ScriptKind
  
  @js.native
  sealed trait External
    extends StObject
       with ScriptKind
  
  @js.native
  sealed trait JS
    extends StObject
       with ScriptKind
  
  @js.native
  sealed trait JSON
    extends StObject
       with ScriptKind
  
  @js.native
  sealed trait JSX
    extends StObject
       with ScriptKind
  
  @js.native
  sealed trait TS
    extends StObject
       with ScriptKind
  
  @js.native
  sealed trait TSX
    extends StObject
       with ScriptKind
  
  @js.native
  sealed trait Unknown
    extends StObject
       with ScriptKind
}
