package typings.clownface.mod

import typings.clownface.anon.ToString
import typings.clownface.clownfaceStrings.BlankNode
import typings.clownface.clownfaceStrings.Literal
import typings.clownface.clownfaceStrings.NamedNode
import typings.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeOptions extends js.Object {
  var datatype: js.UndefOr[Term | ToString] = js.native
  var language: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[BlankNode | Literal | NamedNode] = js.native
}

object NodeOptions {
  @scala.inline
  def apply(): NodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeOptions]
  }
  @scala.inline
  implicit class NodeOptionsOps[Self <: NodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDatatype(value: Term | ToString): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setType(value: BlankNode | Literal | NamedNode): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

