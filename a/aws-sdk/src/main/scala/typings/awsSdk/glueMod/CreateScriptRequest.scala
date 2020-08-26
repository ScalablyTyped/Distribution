package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateScriptRequest extends js.Object {
  /**
    * A list of the edges in the DAG.
    */
  var DagEdges: js.UndefOr[typings.awsSdk.glueMod.DagEdges] = js.native
  /**
    * A list of the nodes in the DAG.
    */
  var DagNodes: js.UndefOr[typings.awsSdk.glueMod.DagNodes] = js.native
  /**
    * The programming language of the resulting code from the DAG.
    */
  var Language: js.UndefOr[typings.awsSdk.glueMod.Language] = js.native
}

object CreateScriptRequest {
  @scala.inline
  def apply(): CreateScriptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateScriptRequest]
  }
  @scala.inline
  implicit class CreateScriptRequestOps[Self <: CreateScriptRequest] (val x: Self) extends AnyVal {
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
    def setDagEdgesVarargs(value: CodeGenEdge*): Self = this.set("DagEdges", js.Array(value :_*))
    @scala.inline
    def setDagEdges(value: DagEdges): Self = this.set("DagEdges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDagEdges: Self = this.set("DagEdges", js.undefined)
    @scala.inline
    def setDagNodesVarargs(value: CodeGenNode*): Self = this.set("DagNodes", js.Array(value :_*))
    @scala.inline
    def setDagNodes(value: DagNodes): Self = this.set("DagNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDagNodes: Self = this.set("DagNodes", js.undefined)
    @scala.inline
    def setLanguage(value: Language): Self = this.set("Language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("Language", js.undefined)
  }
  
}

