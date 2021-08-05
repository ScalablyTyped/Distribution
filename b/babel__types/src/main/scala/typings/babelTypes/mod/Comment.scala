package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.CommentBlock
  - typings.babelTypes.mod.CommentLine
*/
trait Comment extends StObject
object Comment {
  
  inline def CommentBlock(end: Double, loc: SourceLocation, start: Double, value: String): typings.babelTypes.mod.CommentBlock = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentBlock")
    __obj.asInstanceOf[typings.babelTypes.mod.CommentBlock]
  }
  
  inline def CommentLine(end: Double, loc: SourceLocation, start: Double, value: String): typings.babelTypes.mod.CommentLine = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CommentLine")
    __obj.asInstanceOf[typings.babelTypes.mod.CommentLine]
  }
}
