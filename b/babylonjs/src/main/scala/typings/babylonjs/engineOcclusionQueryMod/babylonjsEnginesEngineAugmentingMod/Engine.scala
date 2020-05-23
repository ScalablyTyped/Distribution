package typings.babylonjs.engineOcclusionQueryMod.babylonjsEnginesEngineAugmentingMod

import typings.babylonjs.timeTokenMod.TimeToken
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.typesMod.int
import typings.std.WebGLQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Engine extends js.Object {
  /** @hidden */
  var _currentNonTimestampToken: Nullable[TimeToken]
  /** @hidden */
  def _createTimeQuery(): WebGLQuery
  /** @hidden */
  def _deleteTimeQuery(query: WebGLQuery): Unit
  /** @hidden */
  def _getGlAlgorithmType(algorithmType: Double): Double
  /** @hidden */
  def _getTimeQueryAvailability(query: WebGLQuery): js.Any
  /** @hidden */
  def _getTimeQueryResult(query: WebGLQuery): js.Any
  /**
    * Initiates an occlusion query
    * @param algorithmType defines the algorithm to use
    * @param query defines the query to use
    * @returns the current engine
    * @see http://doc.babylonjs.com/features/occlusionquery
    */
  def beginOcclusionQuery(algorithmType: Double, query: WebGLQuery): Engine
  /**
    * Create a new webGL query (you must be sure that queries are supported by checking getCaps() function)
    * @return the new query
    */
  def createQuery(): WebGLQuery
  /**
    * Delete and release a webGL query
    * @param query defines the query to delete
    * @return the current engine
    */
  def deleteQuery(query: WebGLQuery): Engine
  /**
    * Ends an occlusion query
    * @see http://doc.babylonjs.com/features/occlusionquery
    * @param algorithmType defines the algorithm to use
    * @returns the current engine
    */
  def endOcclusionQuery(algorithmType: Double): Engine
  /**
    * Ends a time query
    * @param token defines the token used to measure the time span
    * @returns the time spent (in ns)
    */
  def endTimeQuery(token: TimeToken): int
  /**
    * Gets the value of a given query
    * @param query defines the query to check
    * @returns the value of the query
    */
  def getQueryResult(query: WebGLQuery): Double
  /**
    * Check if a given query has resolved and got its value
    * @param query defines the query to check
    * @returns true if the query got its value
    */
  def isQueryResultAvailable(query: WebGLQuery): Boolean
  /**
    * Starts a time query (used to measure time spent by the GPU on a specific frame)
    * Please note that only one query can be issued at a time
    * @returns a time token used to track the time span
    */
  def startTimeQuery(): Nullable[TimeToken]
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
    startTimeQuery: () => Nullable[TimeToken],
    _currentNonTimestampToken: Nullable[TimeToken] = null
  ): Engine = {
    val __obj = js.Dynamic.literal(_createTimeQuery = js.Any.fromFunction0(_createTimeQuery), _deleteTimeQuery = js.Any.fromFunction1(_deleteTimeQuery), _getGlAlgorithmType = js.Any.fromFunction1(_getGlAlgorithmType), _getTimeQueryAvailability = js.Any.fromFunction1(_getTimeQueryAvailability), _getTimeQueryResult = js.Any.fromFunction1(_getTimeQueryResult), beginOcclusionQuery = js.Any.fromFunction2(beginOcclusionQuery), createQuery = js.Any.fromFunction0(createQuery), deleteQuery = js.Any.fromFunction1(deleteQuery), endOcclusionQuery = js.Any.fromFunction1(endOcclusionQuery), endTimeQuery = js.Any.fromFunction1(endTimeQuery), getQueryResult = js.Any.fromFunction1(getQueryResult), isQueryResultAvailable = js.Any.fromFunction1(isQueryResultAvailable), startTimeQuery = js.Any.fromFunction0(startTimeQuery), _currentNonTimestampToken = _currentNonTimestampToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Engine]
  }
}

