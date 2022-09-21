package typings.blueprintjsIcons

import typings.blueprintjsIcons.snakeCaseMod.SnakeCase
import typings.std.Uppercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screamingSnakeCaseMod {
  
  /**
  Returns a boolean for whether the string is screaming snake case.
  */
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsIcons.blueprintjsIconsBooleans.`false`
    - typings.blueprintjsIcons.blueprintjsIconsBooleans.`true`
  */
  trait IsScreamingSnakeCase[Value /* <: String */] extends StObject
  
  type ScreamingSnakeCase[Value] = Value | Uppercase[SnakeCase[Value]]
}
