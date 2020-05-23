package typings.ckeditor.global.CKEDITOR

import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.replaceAll")
@js.native
object replaceAll extends js.Object {
  def apply(): Unit = js.native
  def apply(
    assertionFunction: js.Function2[
      /* textarea */ HTMLTextAreaElement, 
      /* config */ typings.ckeditor.CKEDITOR.config, 
      Boolean
    ]
  ): Unit = js.native
  def apply(className: String): Unit = js.native
}

