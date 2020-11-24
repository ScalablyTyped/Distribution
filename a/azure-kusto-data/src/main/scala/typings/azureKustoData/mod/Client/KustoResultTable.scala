package typings.azureKustoData.mod.Client

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KustoResultTable[T] extends js.Object {
  
  var columns: js.Array[_] = js.native
  
  var id: String = js.native
  
  var kind: String = js.native
  
  var name: String = js.native
  
  def rows(): IterableIterator[KustoResultRow[T]] = js.native
  
  def toJson(): js.Any = js.native
}
object KustoResultTable {
  
  @scala.inline
  def apply[T](
    columns: js.Array[_],
    id: String,
    kind: String,
    name: String,
    rows: () => IterableIterator[KustoResultRow[T]],
    toJson: () => js.Any
  ): KustoResultTable[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rows = js.Any.fromFunction0(rows), toJson = js.Any.fromFunction0(toJson))
    __obj.asInstanceOf[KustoResultTable[T]]
  }
  
  @scala.inline
  implicit class KustoResultTableOps[Self <: KustoResultTable[_], T] (val x: Self with KustoResultTable[T]) extends AnyVal {
    
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
    def setColumnsVarargs(value: js.Any*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[_]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: () => IterableIterator[KustoResultRow[T]]): Self = this.set("rows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJson(value: () => js.Any): Self = this.set("toJson", js.Any.fromFunction0(value))
  }
}
