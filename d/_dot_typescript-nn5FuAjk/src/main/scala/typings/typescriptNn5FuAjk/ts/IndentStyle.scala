package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndentStyle extends StObject
@JSGlobal("ts.IndentStyle")
@js.native
object IndentStyle extends StObject {
  
  @js.native
  sealed trait Block
    extends StObject
       with IndentStyle
  
  @js.native
  sealed trait None
    extends StObject
       with IndentStyle
  
  @js.native
  sealed trait Smart
    extends StObject
       with IndentStyle
}
