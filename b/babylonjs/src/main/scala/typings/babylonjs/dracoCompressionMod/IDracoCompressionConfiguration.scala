package typings.babylonjs.dracoCompressionMod

import typings.babylonjs.anon.FallbackUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDracoCompressionConfiguration extends js.Object {
  /**
    * Configuration for the decoder.
    */
  var decoder: FallbackUrl
}

object IDracoCompressionConfiguration {
  @scala.inline
  def apply(decoder: FallbackUrl): IDracoCompressionConfiguration = {
    val __obj = js.Dynamic.literal(decoder = decoder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDracoCompressionConfiguration]
  }
}

