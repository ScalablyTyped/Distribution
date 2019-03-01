package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Document extends js.Object {
  var document: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Document | scala.Null
  var padWithNoOps: scala.Boolean
  var useRelations: scala.Boolean
}

object Anon_Document {
  @scala.inline
  def apply(
    padWithNoOps: scala.Boolean,
    useRelations: scala.Boolean,
    document: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Document = null
  ): Anon_Document = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("padWithNoOps")(padWithNoOps)
    __obj.updateDynamic("useRelations")(useRelations)
    if (document != null) __obj.updateDynamic("document")(document)
    __obj.asInstanceOf[Anon_Document]
  }
}

