package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutputFileType extends StObject
@JSGlobal("ts.OutputFileType")
@js.native
object OutputFileType extends StObject {
  
  @js.native
  sealed trait Declaration
    extends StObject
       with OutputFileType
  
  @js.native
  sealed trait JavaScript
    extends StObject
       with OutputFileType
  
  @js.native
  sealed trait SourceMap
    extends StObject
       with OutputFileType
}
