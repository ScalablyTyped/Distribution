package typings.commentJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("comment-json", "parse")
@js.native
object parse extends js.Object {
  
  def apply(json: String): CommentJSONValue = js.native
  def apply(json: String, reviver: js.UndefOr[scala.Nothing], removes_comments: Boolean): CommentJSONValue = js.native
  def apply(json: String, reviver: Reviver): CommentJSONValue = js.native
  def apply(json: String, reviver: Reviver, removes_comments: Boolean): CommentJSONValue = js.native
}
