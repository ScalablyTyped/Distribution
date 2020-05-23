package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.filter.allowedContentRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.filter")
@js.native
class filter protected ()
  extends typings.ckeditor.CKEDITOR.filter {
  def this(editorOrRules: typings.ckeditor.CKEDITOR.editor) = this()
  def this(editorOrRules: allowedContentRules) = this()
}

/* static members */
@JSGlobal("CKEDITOR.filter")
@js.native
object filter extends js.Object {
  var instances: StringDictionary[typings.ckeditor.CKEDITOR.filter] = js.native
  var transformationTools: typings.ckeditor.CKEDITOR.filter.transformationTools = js.native
}

