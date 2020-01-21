package typings.cacache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgorithm extends js.Object {
  var algorithm: String
  var digest: String
  var options: js.Array[_]
  var source: String
}

object AnonAlgorithm {
  @scala.inline
  def apply(algorithm: String, digest: String, options: js.Array[_], source: String): AnonAlgorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlgorithm]
  }
}

