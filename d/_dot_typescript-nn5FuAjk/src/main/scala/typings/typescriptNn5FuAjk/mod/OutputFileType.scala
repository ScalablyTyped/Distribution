package typings.typescriptNn5FuAjk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutputFileType extends StObject
@JSImport(".typescript-nn5FuAjk", "OutputFileType")
@js.native
object OutputFileType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputFileType & Double] = js.native
  
  @js.native
  sealed trait Declaration
    extends StObject
       with OutputFileType
  /* 2 */ val Declaration: typings.typescriptNn5FuAjk.mod.OutputFileType.Declaration & Double = js.native
  
  @js.native
  sealed trait JavaScript
    extends StObject
       with OutputFileType
  /* 0 */ val JavaScript: typings.typescriptNn5FuAjk.mod.OutputFileType.JavaScript & Double = js.native
  
  @js.native
  sealed trait SourceMap
    extends StObject
       with OutputFileType
  /* 1 */ val SourceMap: typings.typescriptNn5FuAjk.mod.OutputFileType.SourceMap & Double = js.native
}
