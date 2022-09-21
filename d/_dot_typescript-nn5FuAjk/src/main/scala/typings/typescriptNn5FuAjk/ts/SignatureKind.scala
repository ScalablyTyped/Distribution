package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SignatureKind extends StObject
@JSGlobal("ts.SignatureKind")
@js.native
object SignatureKind extends StObject {
  
  @js.native
  sealed trait Call
    extends StObject
       with SignatureKind
  
  @js.native
  sealed trait Construct
    extends StObject
       with SignatureKind
}
