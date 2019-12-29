package typings.clownface.clownfaceMod

import typings.clownface.Anon_ToString
import typings.clownface.clownfaceStrings.BlankNode
import typings.clownface.clownfaceStrings.Literal
import typings.clownface.clownfaceStrings.NamedNode
import typings.rdfDashJs.rdfDashJsMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeOptions extends js.Object {
  var datatype: js.UndefOr[Term | Anon_ToString] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[BlankNode | Literal | NamedNode] = js.undefined
}

object NodeOptions {
  @scala.inline
  def apply(
    datatype: Term | Anon_ToString = null,
    language: String = null,
    `type`: BlankNode | Literal | NamedNode = null
  ): NodeOptions = {
    val __obj = js.Dynamic.literal()
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOptions]
  }
}

