package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "addComment")
@js.native
object addComment extends js.Object {
  
  def apply[T /* <: Node */](node: T, `type`: CommentTypeShorthand, content: String): T = js.native
  def apply[T /* <: Node */](node: T, `type`: CommentTypeShorthand, content: String, line: Boolean): T = js.native
}
