package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for Draco compression
  */
trait IDracoCompressionConfiguration extends js.Object {
  /**
    * Configuration for the decoder.
    */
  var decoder: js.UndefOr[babylonjsLib.Anon_FallbackUrl] = js.undefined
}

object IDracoCompressionConfiguration {
  @scala.inline
  def apply(decoder: babylonjsLib.Anon_FallbackUrl = null): IDracoCompressionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (decoder != null) __obj.updateDynamic("decoder")(decoder)
    __obj.asInstanceOf[IDracoCompressionConfiguration]
  }
}

