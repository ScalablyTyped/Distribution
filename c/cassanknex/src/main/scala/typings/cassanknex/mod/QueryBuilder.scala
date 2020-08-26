package typings.cassanknex.mod

import typings.cassandraDriver.mod.ValueCallback
import typings.cassandraDriver.typesMod.types.ResultSet
import typings.cassandraDriver.typesMod.types.Row
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryBuilder extends js.Object {
  def bindings(): js.Array[_] = js.native
  def cql(): String = js.native
  def eachRow(
    onEachRow: js.Function2[/* n */ Double, /* row */ Row, _],
    onError: js.Function1[/* err */ Error, _]
  ): js.UndefOr[scala.Nothing] = js.native
  def exec(cb: ValueCallback[ResultSet]): js.UndefOr[scala.Nothing] = js.native
  def stream(params: StreamParams): js.UndefOr[scala.Nothing] = js.native
}

object QueryBuilder {
  @scala.inline
  def apply(
    bindings: () => js.Array[_],
    cql: () => String,
    eachRow: (js.Function2[/* n */ Double, /* row */ Row, _], js.Function1[/* err */ Error, _]) => js.UndefOr[scala.Nothing],
    exec: ValueCallback[ResultSet] => js.UndefOr[scala.Nothing],
    stream: StreamParams => js.UndefOr[scala.Nothing]
  ): QueryBuilder = {
    val __obj = js.Dynamic.literal(bindings = js.Any.fromFunction0(bindings), cql = js.Any.fromFunction0(cql), eachRow = js.Any.fromFunction2(eachRow), exec = js.Any.fromFunction1(exec), stream = js.Any.fromFunction1(stream))
    __obj.asInstanceOf[QueryBuilder]
  }
  @scala.inline
  implicit class QueryBuilderOps[Self <: QueryBuilder] (val x: Self) extends AnyVal {
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
    def setBindings(value: () => js.Array[_]): Self = this.set("bindings", js.Any.fromFunction0(value))
    @scala.inline
    def setCql(value: () => String): Self = this.set("cql", js.Any.fromFunction0(value))
    @scala.inline
    def setEachRow(
      value: (js.Function2[/* n */ Double, /* row */ Row, _], js.Function1[/* err */ Error, _]) => js.UndefOr[scala.Nothing]
    ): Self = this.set("eachRow", js.Any.fromFunction2(value))
    @scala.inline
    def setExec(value: ValueCallback[ResultSet] => js.UndefOr[scala.Nothing]): Self = this.set("exec", js.Any.fromFunction1(value))
    @scala.inline
    def setStream(value: StreamParams => js.UndefOr[scala.Nothing]): Self = this.set("stream", js.Any.fromFunction1(value))
  }
  
}

