package typings.cassanknex.mod

import typings.cassandraDriver.mod.ValueCallback
import typings.cassandraDriver.typesMod.types.ResultSet
import typings.cassandraDriver.typesMod.types.Row
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryBuilder extends StObject {
  
  def bindings(): js.Array[js.Any]
  
  def cql(): String
  
  def eachRow(
    onEachRow: js.Function2[/* n */ Double, /* row */ Row, js.Any],
    onError: js.Function1[/* err */ Error, js.Any]
  ): Unit
  
  def exec(cb: ValueCallback[ResultSet]): Unit
  
  def stream(params: StreamParams): Unit
}
object QueryBuilder {
  
  @scala.inline
  def apply(
    bindings: () => js.Array[js.Any],
    cql: () => String,
    eachRow: (js.Function2[/* n */ Double, /* row */ Row, js.Any], js.Function1[/* err */ Error, js.Any]) => Unit,
    exec: ValueCallback[ResultSet] => Unit,
    stream: StreamParams => Unit
  ): QueryBuilder = {
    val __obj = js.Dynamic.literal(bindings = js.Any.fromFunction0(bindings), cql = js.Any.fromFunction0(cql), eachRow = js.Any.fromFunction2(eachRow), exec = js.Any.fromFunction1(exec), stream = js.Any.fromFunction1(stream))
    __obj.asInstanceOf[QueryBuilder]
  }
  
  @scala.inline
  implicit class QueryBuilderMutableBuilder[Self <: QueryBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings(value: () => js.Array[js.Any]): Self = StObject.set(x, "bindings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCql(value: () => String): Self = StObject.set(x, "cql", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEachRow(
      value: (js.Function2[/* n */ Double, /* row */ Row, js.Any], js.Function1[/* err */ Error, js.Any]) => Unit
    ): Self = StObject.set(x, "eachRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExec(value: ValueCallback[ResultSet] => Unit): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStream(value: StreamParams => Unit): Self = StObject.set(x, "stream", js.Any.fromFunction1(value))
  }
}
