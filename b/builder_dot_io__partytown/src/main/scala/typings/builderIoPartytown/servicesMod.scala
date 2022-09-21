package typings.builderIoPartytown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesMod {
  
  @JSImport("@builder.io/partytown/services", "facebookPixelForward")
  @js.native
  val facebookPixelForward: js.Array[PartytownForwardProperty] = js.native
  
  @JSImport("@builder.io/partytown/services", "freshpaintForward")
  @js.native
  val freshpaintForward: js.Array[PartytownForwardProperty] = js.native
  
  @JSImport("@builder.io/partytown/services", "googleTagManagerForward")
  @js.native
  val googleTagManagerForward: js.Array[PartytownForwardProperty] = js.native
  
  /**
    * A foward property to patch on `window`. The foward config property is an string,
    * representing the call to forward, such as `dataLayer.push` or `fbq`.
    *
    * https://partytown.builder.io/forwarding-events
    *
    * @public
    */
  type PartytownForwardProperty = String
}
