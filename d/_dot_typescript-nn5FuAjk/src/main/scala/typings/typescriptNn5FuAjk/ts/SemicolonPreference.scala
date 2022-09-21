package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemicolonPreference extends StObject
@JSGlobal("ts.SemicolonPreference")
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
