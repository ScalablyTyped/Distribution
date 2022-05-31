package typings.babylonjs

import typings.std.WebGLQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EXTDisjointTimerQuery extends StObject {
  
  var GPU_DISJOINT_EXT: Double
  
  var QUERY_COUNTER_BITS_EXT: Double
  
  var QUERY_RESULT_AVAILABLE_EXT: Double
  
  var QUERY_RESULT_EXT: Double
  
  var TIMESTAMP_EXT: Double
  
  var TIME_ELAPSED_EXT: Double
  
  def beginQueryEXT(target: Double, query: WebGLQuery): Unit
  
  def createQueryEXT(): WebGLQuery
  
  def deleteQueryEXT(query: WebGLQuery): Unit
  
  def endQueryEXT(target: Double): Unit
  
  def getQueryObjectEXT(query: WebGLQuery, target: Double): js.Any
  
  def queryCounterEXT(query: WebGLQuery, target: Double): Unit
}
object EXTDisjointTimerQuery {
  
  inline def apply(
    GPU_DISJOINT_EXT: Double,
    QUERY_COUNTER_BITS_EXT: Double,
    QUERY_RESULT_AVAILABLE_EXT: Double,
    QUERY_RESULT_EXT: Double,
    TIMESTAMP_EXT: Double,
    TIME_ELAPSED_EXT: Double,
    beginQueryEXT: (Double, WebGLQuery) => Unit,
    createQueryEXT: () => WebGLQuery,
    deleteQueryEXT: WebGLQuery => Unit,
    endQueryEXT: Double => Unit,
    getQueryObjectEXT: (WebGLQuery, Double) => js.Any,
    queryCounterEXT: (WebGLQuery, Double) => Unit
  ): EXTDisjointTimerQuery = {
    val __obj = js.Dynamic.literal(GPU_DISJOINT_EXT = GPU_DISJOINT_EXT.asInstanceOf[js.Any], QUERY_COUNTER_BITS_EXT = QUERY_COUNTER_BITS_EXT.asInstanceOf[js.Any], QUERY_RESULT_AVAILABLE_EXT = QUERY_RESULT_AVAILABLE_EXT.asInstanceOf[js.Any], QUERY_RESULT_EXT = QUERY_RESULT_EXT.asInstanceOf[js.Any], TIMESTAMP_EXT = TIMESTAMP_EXT.asInstanceOf[js.Any], TIME_ELAPSED_EXT = TIME_ELAPSED_EXT.asInstanceOf[js.Any], beginQueryEXT = js.Any.fromFunction2(beginQueryEXT), createQueryEXT = js.Any.fromFunction0(createQueryEXT), deleteQueryEXT = js.Any.fromFunction1(deleteQueryEXT), endQueryEXT = js.Any.fromFunction1(endQueryEXT), getQueryObjectEXT = js.Any.fromFunction2(getQueryObjectEXT), queryCounterEXT = js.Any.fromFunction2(queryCounterEXT))
    __obj.asInstanceOf[EXTDisjointTimerQuery]
  }
  
  extension [Self <: EXTDisjointTimerQuery](x: Self) {
    
    inline def setBeginQueryEXT(value: (Double, WebGLQuery) => Unit): Self = StObject.set(x, "beginQueryEXT", js.Any.fromFunction2(value))
    
    inline def setCreateQueryEXT(value: () => WebGLQuery): Self = StObject.set(x, "createQueryEXT", js.Any.fromFunction0(value))
    
    inline def setDeleteQueryEXT(value: WebGLQuery => Unit): Self = StObject.set(x, "deleteQueryEXT", js.Any.fromFunction1(value))
    
    inline def setEndQueryEXT(value: Double => Unit): Self = StObject.set(x, "endQueryEXT", js.Any.fromFunction1(value))
    
    inline def setGPU_DISJOINT_EXT(value: Double): Self = StObject.set(x, "GPU_DISJOINT_EXT", value.asInstanceOf[js.Any])
    
    inline def setGetQueryObjectEXT(value: (WebGLQuery, Double) => js.Any): Self = StObject.set(x, "getQueryObjectEXT", js.Any.fromFunction2(value))
    
    inline def setQUERY_COUNTER_BITS_EXT(value: Double): Self = StObject.set(x, "QUERY_COUNTER_BITS_EXT", value.asInstanceOf[js.Any])
    
    inline def setQUERY_RESULT_AVAILABLE_EXT(value: Double): Self = StObject.set(x, "QUERY_RESULT_AVAILABLE_EXT", value.asInstanceOf[js.Any])
    
    inline def setQUERY_RESULT_EXT(value: Double): Self = StObject.set(x, "QUERY_RESULT_EXT", value.asInstanceOf[js.Any])
    
    inline def setQueryCounterEXT(value: (WebGLQuery, Double) => Unit): Self = StObject.set(x, "queryCounterEXT", js.Any.fromFunction2(value))
    
    inline def setTIMESTAMP_EXT(value: Double): Self = StObject.set(x, "TIMESTAMP_EXT", value.asInstanceOf[js.Any])
    
    inline def setTIME_ELAPSED_EXT(value: Double): Self = StObject.set(x, "TIME_ELAPSED_EXT", value.asInstanceOf[js.Any])
  }
}
