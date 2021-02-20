package typings.cassanknex.mod

import typings.cassandraDriver.mod.ValueCallback
import typings.cassandraDriver.typesMod.types.ResultSet
import typings.cassandraDriver.typesMod.types.Row
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryBuilder extends StObject {
  
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
  implicit class QueryBuilderMutableBuilder[Self <: QueryBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings(value: () => js.Array[_]): Self = StObject.set(x, "bindings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCql(value: () => String): Self = StObject.set(x, "cql", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEachRow(
      value: (js.Function2[/* n */ Double, /* row */ Row, _], js.Function1[/* err */ Error, _]) => js.UndefOr[scala.Nothing]
    ): Self = StObject.set(x, "eachRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExec(value: ValueCallback[ResultSet] => js.UndefOr[scala.Nothing]): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStream(value: StreamParams => js.UndefOr[scala.Nothing]): Self = StObject.set(x, "stream", js.Any.fromFunction1(value))
  }
}
