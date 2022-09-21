package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemicolonPreference extends StObject
@JSImport(".typescript-nn5FuAjk/lib/protocol.d.ts", "ts.server.protocol.SemicolonPreference")
@js.native
object SemicolonPreference extends StObject {
  
  @js.native
  sealed trait Ignore
    extends StObject
       with SemicolonPreference
  
  @js.native
  sealed trait Insert
    extends StObject
       with SemicolonPreference
  
  @js.native
  sealed trait Remove
    extends StObject
       with SemicolonPreference
}
