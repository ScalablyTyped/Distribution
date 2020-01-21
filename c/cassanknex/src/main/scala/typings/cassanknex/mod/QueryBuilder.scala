package typings.cassanknex.mod

import typings.cassandraDriver.mod.ValueCallback
import typings.cassandraDriver.typesMod.types.ResultSet
import typings.cassandraDriver.typesMod.types.Row
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryBuilder extends js.Object {
  def bindings(): js.Array[_]
  def cql(): String
  def eachRow(
    onEachRow: js.Function2[/* n */ Double, /* row */ Row, _],
    onError: js.Function1[/* err */ Error, _]
  ): js.UndefOr[scala.Nothing]
  def exec(cb: ValueCallback[ResultSet]): js.UndefOr[scala.Nothing]
  def stream(params: StreamParams): js.UndefOr[scala.Nothing]
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
}

