package typings.chai.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * Default: false
    */
  var includeStack: Boolean
  /**
    * Default: ['then', 'catch', 'inspect', 'toJSON']
    */
  var proxyExcludedKeys: js.Array[String]
  /**
    * Default: true
    */
  var showDiff: Boolean
  /**
    * Default: 40
    */
  var truncateThreshold: Double
  /**
    * Default: true
    */
  var useProxy: Boolean
}

object Config {
  @scala.inline
  def apply(
    includeStack: Boolean,
    proxyExcludedKeys: js.Array[String],
    showDiff: Boolean,
    truncateThreshold: Double,
    useProxy: Boolean
  ): Config = {
    val __obj = js.Dynamic.literal(includeStack = includeStack, proxyExcludedKeys = proxyExcludedKeys, showDiff = showDiff, truncateThreshold = truncateThreshold, useProxy = useProxy)
  
    __obj.asInstanceOf[Config]
  }
}

