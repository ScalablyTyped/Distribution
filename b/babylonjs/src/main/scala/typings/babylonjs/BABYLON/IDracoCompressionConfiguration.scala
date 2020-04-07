package typings.babylonjs.BABYLON

import typings.babylonjs.AnonFallbackUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDracoCompressionConfiguration extends js.Object {
  /**
    * Configuration for the decoder.
    */
  var decoder: AnonFallbackUrl
}

object IDracoCompressionConfiguration {
  @scala.inline
  def apply(decoder: AnonFallbackUrl): IDracoCompressionConfiguration = {
    val __obj = js.Dynamic.literal(decoder = decoder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDracoCompressionConfiguration]
  }
}

