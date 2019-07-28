package typings.atCkeditorCkeditor5DashEngine

import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Document
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
    val __obj = js.Dynamic.literal(padWithNoOps = padWithNoOps, useRelations = useRelations)
    if (document != null) __obj.updateDynamic("document")(document)
    __obj.asInstanceOf[Anon_Document]
  }
}

