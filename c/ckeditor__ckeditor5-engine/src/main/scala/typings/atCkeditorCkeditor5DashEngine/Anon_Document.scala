package typings.atCkeditorCkeditor5DashEngine

import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Document extends js.Object {
  var document: Document | Null
  var padWithNoOps: Boolean
  var useRelations: Boolean
}

object Anon_Document {
  @scala.inline
  def apply(padWithNoOps: Boolean, useRelations: Boolean, document: Document = null): Anon_Document = {
    val __obj = js.Dynamic.literal(padWithNoOps = padWithNoOps.asInstanceOf[js.Any], useRelations = useRelations.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Document]
  }
}

