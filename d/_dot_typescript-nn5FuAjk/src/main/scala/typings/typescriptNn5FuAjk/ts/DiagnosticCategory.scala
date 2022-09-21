package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagnosticCategory extends StObject
@JSGlobal("ts.DiagnosticCategory")
@js.native
object DiagnosticCategory extends StObject {
  
  @js.native
  sealed trait Error
    extends StObject
       with DiagnosticCategory
  
  @js.native
  sealed trait Message
    extends StObject
       with DiagnosticCategory
  
  @js.native
  sealed trait Suggestion
    extends StObject
       with DiagnosticCategory
  
  @js.native
  sealed trait Warning
    extends StObject
       with DiagnosticCategory
}
