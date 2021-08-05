package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryObj extends StObject {
  
  var OR: js.Array[Query]
  
  var URI: String
  
  def ascending(field: String): Unit
  
  def columns(columnsArray: js.Array[String]): Unit
  
  def descending(field: String): Unit
  
  def equalTo(field: String, value: QueryValue): Unit
  
  def fetch(callback: CbCallback): Unit
  
  def greaterThan(field: String, value: QueryValue): Unit
  
  def greaterThanEqualTo(field: String, value: QueryValue): Unit
  
  var id: String
  
  def lessThan(field: String, value: QueryValue): Unit
  
  def lessThanEqualTo(field: String, value: QueryValue): Unit
  
  var limit: Double
  
  def matches(field: String, pattern: QueryValue): Unit
  
  def notEqualTo(field: String, value: QueryValue): Unit
  
  var offset: Double
  
  def or(query: QueryObj): Unit
  
  var query: Query
  
  def remove(callback: CbCallback): Unit
  
  def setPage(pageSize: Double, pageNum: Double): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(changes: js.Object, callback: CbCallback): Unit
  
  var user: APIUser
}
object QueryObj {
  
  inline def apply(
    OR: js.Array[Query],
    URI: String,
    ascending: String => Unit,
    columns: js.Array[String] => Unit,
    descending: String => Unit,
    equalTo: (String, QueryValue) => Unit,
    fetch: CbCallback => Unit,
    greaterThan: (String, QueryValue) => Unit,
    greaterThanEqualTo: (String, QueryValue) => Unit,
    id: String,
    lessThan: (String, QueryValue) => Unit,
    lessThanEqualTo: (String, QueryValue) => Unit,
    limit: Double,
    matches: (String, QueryValue) => Unit,
    notEqualTo: (String, QueryValue) => Unit,
    offset: Double,
    or: QueryObj => Unit,
    query: Query,
    remove: CbCallback => Unit,
    setPage: (Double, Double) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (js.Object, CbCallback) => Unit,
    user: APIUser
  ): QueryObj = {
    val __obj = js.Dynamic.literal(OR = OR.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any], ascending = js.Any.fromFunction1(ascending), columns = js.Any.fromFunction1(columns), descending = js.Any.fromFunction1(descending), equalTo = js.Any.fromFunction2(equalTo), fetch = js.Any.fromFunction1(fetch), greaterThan = js.Any.fromFunction2(greaterThan), greaterThanEqualTo = js.Any.fromFunction2(greaterThanEqualTo), id = id.asInstanceOf[js.Any], lessThan = js.Any.fromFunction2(lessThan), lessThanEqualTo = js.Any.fromFunction2(lessThanEqualTo), limit = limit.asInstanceOf[js.Any], matches = js.Any.fromFunction2(matches), notEqualTo = js.Any.fromFunction2(notEqualTo), offset = offset.asInstanceOf[js.Any], or = js.Any.fromFunction1(or), query = query.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), setPage = js.Any.fromFunction2(setPage), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction2(update), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObj]
  }
  
  extension [Self <: QueryObj](x: Self) {
    
    inline def setAscending(value: String => Unit): Self = StObject.set(x, "ascending", js.Any.fromFunction1(value))
    
    inline def setColumns(value: js.Array[String] => Unit): Self = StObject.set(x, "columns", js.Any.fromFunction1(value))
    
    inline def setDescending(value: String => Unit): Self = StObject.set(x, "descending", js.Any.fromFunction1(value))
    
    inline def setEqualTo(value: (String, QueryValue) => Unit): Self = StObject.set(x, "equalTo", js.Any.fromFunction2(value))
    
    inline def setFetch(value: CbCallback => Unit): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
    
    inline def setGreaterThan(value: (String, QueryValue) => Unit): Self = StObject.set(x, "greaterThan", js.Any.fromFunction2(value))
    
    inline def setGreaterThanEqualTo(value: (String, QueryValue) => Unit): Self = StObject.set(x, "greaterThanEqualTo", js.Any.fromFunction2(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLessThan(value: (String, QueryValue) => Unit): Self = StObject.set(x, "lessThan", js.Any.fromFunction2(value))
    
    inline def setLessThanEqualTo(value: (String, QueryValue) => Unit): Self = StObject.set(x, "lessThanEqualTo", js.Any.fromFunction2(value))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: (String, QueryValue) => Unit): Self = StObject.set(x, "matches", js.Any.fromFunction2(value))
    
    inline def setNotEqualTo(value: (String, QueryValue) => Unit): Self = StObject.set(x, "notEqualTo", js.Any.fromFunction2(value))
    
    inline def setOR(value: js.Array[Query]): Self = StObject.set(x, "OR", value.asInstanceOf[js.Any])
    
    inline def setORVarargs(value: Query*): Self = StObject.set(x, "OR", js.Array(value :_*))
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: CbCallback => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSetPage(value: (Double, Double) => Unit): Self = StObject.set(x, "setPage", js.Any.fromFunction2(value))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (js.Object, CbCallback) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
