package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NavigationBarMode extends StObject
@JSGlobal("Microsoft.Maps.NavigationBarMode")
@js.native
object NavigationBarMode extends StObject {
  
  /**
    * The default navigation bar that has a drop down for the map type, a locate me button, and zoom buttons. Recommended for
    * medium to large maps in desktop browsers.
    */
  @js.native
  sealed trait default
    extends StObject
       with NavigationBarMode
  
  /**
    * A compact navigation bar that includes a smaller drop down for the map type and zoom buttons. Recommended for small
    * maps or screen such as a mobile device.
    */
  @js.native
  sealed trait compact
    extends StObject
       with NavigationBarMode
  
  /**
    * A minified navigation bar that has a button to toggle between road and aerial maps, zoom buttons, and a button to turn
    * traffic information on and off. Recommended for small maps or screen such as a mobile device.
    */
  @js.native
  sealed trait minified
    extends StObject
       with NavigationBarMode
}
