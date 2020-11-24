package typings.babylonjs.engineOcclusionQueryMod.babylonjsEnginesEngineAugmentingMod

import typings.babylonjs.timeTokenMod.TimeToken
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.typesMod.int
import typings.std.WebGLQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Engine extends js.Object {
  
  /** @hidden */
  def _createTimeQuery(): WebGLQuery = js.native
  
  /** @hidden */
  var _currentNonTimestampToken: Nullable[TimeToken] = js.native
  
  /** @hidden */
  def _deleteTimeQuery(query: WebGLQuery): Unit = js.native
  
  /** @hidden */
  def _getGlAlgorithmType(algorithmType: Double): Double = js.native
  
  /** @hidden */
  def _getTimeQueryAvailability(query: WebGLQuery): js.Any = js.native
  
  /** @hidden */
  def _getTimeQueryResult(query: WebGLQuery): js.Any = js.native
  
  /**
    * Initiates an occlusion query
    * @param algorithmType defines the algorithm to use
    * @param query defines the query to use
    * @returns the current engine
    * @see https://doc.babylonjs.com/features/occlusionquery
    */
  def beginOcclusionQuery(algorithmType: Double, query: WebGLQuery): Engine = js.native
  
  /**
    * Create a new webGL query (you must be sure that queries are supported by checking getCaps() function)
    * @return the new query
    */
  def createQuery(): WebGLQuery = js.native
  
  /**
    * Delete and release a webGL query
    * @param query defines the query to delete
    * @return the current engine
    */
  def deleteQuery(query: WebGLQuery): Engine = js.native
  
  /**
    * Ends an occlusion query
    * @see https://doc.babylonjs.com/features/occlusionquery
    * @param algorithmType defines the algorithm to use
    * @returns the current engine
    */
  def endOcclusionQuery(algorithmType: Double): Engine = js.native
  
  /**
    * Ends a time query
    * @param token defines the token used to measure the time span
    * @returns the time spent (in ns)
    */
  def endTimeQuery(token: TimeToken): int = js.native
  
  /**
    * Gets the value of a given query
    * @param query defines the query to check
    * @returns the value of the query
    */
  def getQueryResult(query: WebGLQuery): Double = js.native
  
  /**
    * Check if a given query has resolved and got its value
    * @param query defines the query to check
    * @returns true if the query got its value
    */
  def isQueryResultAvailable(query: WebGLQuery): Boolean = js.native
  
  /**
    * Starts a time query (used to measure time spent by the GPU on a specific frame)
    * Please note that only one query can be issued at a time
    * @returns a time token used to track the time span
    */
  def startTimeQuery(): Nullable[TimeToken] = js.native
}
object Engine {
  
  @scala.inline
  def apply(
    _createTimeQuery: () => WebGLQuery,
    _deleteTimeQuery: WebGLQuery => Unit,
    _getGlAlgorithmType: Double => Double,
    _getTimeQueryAvailability: WebGLQuery => js.Any,
    _getTimeQueryResult: WebGLQuery => js.Any,
    beginOcclusionQuery: (Double, WebGLQuery) => Engine,
    createQuery: () => WebGLQuery,
    deleteQuery: WebGLQuery => Engine,
    endOcclusionQuery: Double => Engine,
    endTimeQuery: TimeToken => int,
    getQueryResult: WebGLQuery => Double,
    isQueryResultAvailable: WebGLQuery => Boolean,
    startTimeQuery: () => Nullable[TimeToken]
  ): Engine = {
    val __obj = js.Dynamic.literal(_createTimeQuery = js.Any.fromFunction0(_createTimeQuery), _deleteTimeQuery = js.Any.fromFunction1(_deleteTimeQuery), _getGlAlgorithmType = js.Any.fromFunction1(_getGlAlgorithmType), _getTimeQueryAvailability = js.Any.fromFunction1(_getTimeQueryAvailability), _getTimeQueryResult = js.Any.fromFunction1(_getTimeQueryResult), beginOcclusionQuery = js.Any.fromFunction2(beginOcclusionQuery), createQuery = js.Any.fromFunction0(createQuery), deleteQuery = js.Any.fromFunction1(deleteQuery), endOcclusionQuery = js.Any.fromFunction1(endOcclusionQuery), endTimeQuery = js.Any.fromFunction1(endTimeQuery), getQueryResult = js.Any.fromFunction1(getQueryResult), isQueryResultAvailable = js.Any.fromFunction1(isQueryResultAvailable), startTimeQuery = js.Any.fromFunction0(startTimeQuery))
    __obj.asInstanceOf[Engine]
  }
  
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
    
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
    def set_createTimeQuery(value: () => WebGLQuery): Self = this.set("_createTimeQuery", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_deleteTimeQuery(value: WebGLQuery => Unit): Self = this.set("_deleteTimeQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_getGlAlgorithmType(value: Double => Double): Self = this.set("_getGlAlgorithmType", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_getTimeQueryAvailability(value: WebGLQuery => js.Any): Self = this.set("_getTimeQueryAvailability", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_getTimeQueryResult(value: WebGLQuery => js.Any): Self = this.set("_getTimeQueryResult", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginOcclusionQuery(value: (Double, WebGLQuery) => Engine): Self = this.set("beginOcclusionQuery", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateQuery(value: () => WebGLQuery): Self = this.set("createQuery", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteQuery(value: WebGLQuery => Engine): Self = this.set("deleteQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndOcclusionQuery(value: Double => Engine): Self = this.set("endOcclusionQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndTimeQuery(value: TimeToken => int): Self = this.set("endTimeQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetQueryResult(value: WebGLQuery => Double): Self = this.set("getQueryResult", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsQueryResultAvailable(value: WebGLQuery => Boolean): Self = this.set("isQueryResultAvailable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartTimeQuery(value: () => Nullable[TimeToken]): Self = this.set("startTimeQuery", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_currentNonTimestampToken(value: Nullable[TimeToken]): Self = this.set("_currentNonTimestampToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_currentNonTimestampTokenNull: Self = this.set("_currentNonTimestampToken", null)
  }
}
