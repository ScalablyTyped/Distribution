package typings.clownface.mod

import typings.clownface.contextMod.Context
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.QuadGraph
import typings.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined clownface.clownface.ClownfaceInit<D> & {  value :string} */
@js.native
trait ClownfaceInitWithValue[D /* <: DatasetCore[Quad, Quad] */] extends js.Object {
  
  var _context: js.UndefOr[js.Array[Context[D, Term]]] = js.native
  
  var dataset: js.UndefOr[D] = js.native
  
  var graph: js.UndefOr[QuadGraph] = js.native
  
  var value: String = js.native
}
object ClownfaceInitWithValue {
  
  @scala.inline
  def apply[D /* <: DatasetCore[Quad, Quad] */](value: String): ClownfaceInitWithValue[D] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClownfaceInitWithValue[D]]
  }
  
  @scala.inline
  implicit class ClownfaceInitWithValueOps[Self <: ClownfaceInitWithValue[_], D /* <: DatasetCore[Quad, Quad] */] (val x: Self with ClownfaceInitWithValue[D]) extends AnyVal {
    
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_contextVarargs(value: (Context[D, Term])*): Self = this.set("_context", js.Array(value :_*))
    
    @scala.inline
    def set_context(value: js.Array[Context[D, Term]]): Self = this.set("_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_context: Self = this.set("_context", js.undefined)
    
    @scala.inline
    def setDataset(value: D): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setGraph(value: QuadGraph): Self = this.set("graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraph: Self = this.set("graph", js.undefined)
  }
}
