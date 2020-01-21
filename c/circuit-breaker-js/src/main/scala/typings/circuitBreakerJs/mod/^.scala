package typings.circuitBreakerJs.mod

import typings.circuitBreakerJs.circuitBreakerJsNumbers.`0`
import typings.circuitBreakerJs.circuitBreakerJsNumbers.`1`
import typings.circuitBreakerJs.circuitBreakerJsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("circuit-breaker-js", JSImport.Namespace)
@js.native
class ^ () extends CircuitBreaker {
  def this(options: Options) = this()
}

@JSImport("circuit-breaker-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CLOSED: `2` = js.native
  var HALF_OPEN: `1` = js.native
  var OPEN: `0` = js.native
}

