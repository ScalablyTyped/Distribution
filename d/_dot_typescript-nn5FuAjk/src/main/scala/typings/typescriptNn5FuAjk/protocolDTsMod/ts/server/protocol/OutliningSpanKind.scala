package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutliningSpanKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/protocol.d.ts", "ts.server.protocol.OutliningSpanKind")
@js.native
object OutliningSpanKind extends StObject {
  
  /** Declarations and expressions */
  @js.native
  sealed trait Code
    extends StObject
       with OutliningSpanKind
  
  /** Single or multi-line comments */
  @js.native
  sealed trait Comment
    extends StObject
       with OutliningSpanKind
  
  /** Contiguous blocks of import declarations */
  @js.native
  sealed trait Imports
    extends StObject
       with OutliningSpanKind
  
  /** Sections marked by '// #region' and '// #endregion' comments */
  @js.native
  sealed trait Region
    extends StObject
       with OutliningSpanKind
}
