package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.Identifier_
  - typings.babelTypes.ts36Mod.TSQualifiedName
*/
trait TSEntityName extends StObject
object TSEntityName {
  
  inline def Identifier_(end: Double, loc: SourceLocation, name: String, start: Double): typings.babelTypes.ts36Mod.Identifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.Identifier_]
  }
  
  inline def TSQualifiedName(end: Double, left: TSEntityName, loc: SourceLocation, right: Identifier_, start: Double): typings.babelTypes.ts36Mod.TSQualifiedName = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSQualifiedName")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSQualifiedName]
  }
}
