package typings.babylonjs

import typings.std.WebGLQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EXTDisjointTimerQuery extends js.Object {
  
  var GPU_DISJOINT_EXT: Double = js.native
  
  var QUERY_COUNTER_BITS_EXT: Double = js.native
  
  var QUERY_RESULT_AVAILABLE_EXT: Double = js.native
  
  var QUERY_RESULT_EXT: Double = js.native
  
  var TIMESTAMP_EXT: Double = js.native
  
  var TIME_ELAPSED_EXT: Double = js.native
  
  def beginQueryEXT(target: Double, query: WebGLQuery): Unit = js.native
  
  def createQueryEXT(): WebGLQuery = js.native
  
  def deleteQueryEXT(query: WebGLQuery): Unit = js.native
  
  def endQueryEXT(target: Double): Unit = js.native
  
  def getQueryObjectEXT(query: WebGLQuery, target: Double): js.Any = js.native
  
  def queryCounterEXT(query: WebGLQuery, target: Double): Unit = js.native
}
object EXTDisjointTimerQuery {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class EXTDisjointTimerQueryOps[Self <: EXTDisjointTimerQuery] (val x: Self) extends AnyVal {
    
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
    def setGPU_DISJOINT_EXT(value: Double): Self = this.set("GPU_DISJOINT_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUERY_COUNTER_BITS_EXT(value: Double): Self = this.set("QUERY_COUNTER_BITS_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUERY_RESULT_AVAILABLE_EXT(value: Double): Self = this.set("QUERY_RESULT_AVAILABLE_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUERY_RESULT_EXT(value: Double): Self = this.set("QUERY_RESULT_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTIMESTAMP_EXT(value: Double): Self = this.set("TIMESTAMP_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTIME_ELAPSED_EXT(value: Double): Self = this.set("TIME_ELAPSED_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginQueryEXT(value: (Double, WebGLQuery) => Unit): Self = this.set("beginQueryEXT", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateQueryEXT(value: () => WebGLQuery): Self = this.set("createQueryEXT", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteQueryEXT(value: WebGLQuery => Unit): Self = this.set("deleteQueryEXT", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndQueryEXT(value: Double => Unit): Self = this.set("endQueryEXT", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetQueryObjectEXT(value: (WebGLQuery, Double) => js.Any): Self = this.set("getQueryObjectEXT", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQueryCounterEXT(value: (WebGLQuery, Double) => Unit): Self = this.set("queryCounterEXT", js.Any.fromFunction2(value))
  }
}
