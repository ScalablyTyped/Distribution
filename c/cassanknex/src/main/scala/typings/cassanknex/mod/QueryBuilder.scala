package typings.cassanknex.mod

import typings.cassandraDriver.libTypesMod.types.ResultSet
import typings.cassandraDriver.libTypesMod.types.Row
import typings.cassandraDriver.mod.ValueCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryBuilder extends StObject {
  
  def bindings(): js.Array[Any]
  
  def cql(): String
  
  def eachRow(
    onEachRow: js.Function2[/* n */ Double, /* row */ Row, Any],
    onError: js.Function1[/* err */ js.Error, Any]
  ): Unit
  
  def exec(cb: ValueCallback[ResultSet]): Unit
  
  def stream(params: StreamParams): Unit
}
object QueryBuilder {
  
  inline def apply(
    bindings: () => js.Array[Any],
    cql: () => String,
    eachRow: (js.Function2[/* n */ Double, /* row */ Row, Any], js.Function1[/* err */ js.Error, Any]) => Unit,
    exec: ValueCallback[ResultSet] => Unit,
    stream: StreamParams => Unit
  ): QueryBuilder = {
    val __obj = js.Dynamic.literal(bindings = js.Any.fromFunction0(bindings), cql = js.Any.fromFunction0(cql), eachRow = js.Any.fromFunction2(eachRow), exec = js.Any.fromFunction1(exec), stream = js.Any.fromFunction1(stream))
    __obj.asInstanceOf[QueryBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryBuilder] (val x: Self) extends AnyVal {
    
    inline def setBindings(value: () => js.Array[Any]): Self = StObject.set(x, "bindings", js.Any.fromFunction0(value))
    
    inline def setCql(value: () => String): Self = StObject.set(x, "cql", js.Any.fromFunction0(value))
    
    inline def setEachRow(
      value: (js.Function2[/* n */ Double, /* row */ Row, Any], js.Function1[/* err */ js.Error, Any]) => Unit
    ): Self = StObject.set(x, "eachRow", js.Any.fromFunction2(value))
    
    inline def setExec(value: ValueCallback[ResultSet] => Unit): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
    
    inline def setStream(value: StreamParams => Unit): Self = StObject.set(x, "stream", js.Any.fromFunction1(value))
  }
}
