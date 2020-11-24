package typings.ckeditorCkeditor5Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ckeditor/ckeditor5-utils", "diffToChanges")
@js.native
object diffToChanges extends js.Object {
  
  def apply(diff: js.Array[Change], output: String): js.Array[DeleteChange | InsertChange] = js.native
  def apply(diff: js.Array[Change], output: js.Array[String]): js.Array[DeleteChange | InsertChange] = js.native
}
