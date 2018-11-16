package typings
package cordovaDashPluginDashIbeaconLib.cordovaDashPluginDashIbeaconMod.Global.BeaconPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeaconRegion
  extends Region
     with ScalablyTyped.runtime.Instantiable2[/* identifier */ java.lang.String, /* uuid */ java.lang.String, BeaconRegion]
     with ScalablyTyped.runtime.Instantiable3[
      /* identifier */ java.lang.String, 
      /* uuid */ java.lang.String, 
      /* major */ scala.Double, 
      BeaconRegion
    ]
     with ScalablyTyped.runtime.Instantiable4[
      /* identifier */ java.lang.String, 
      /* uuid */ java.lang.String, 
      /* major */ scala.Double, 
      /* minor */ scala.Double, 
      BeaconRegion
    ]
     with ScalablyTyped.runtime.Instantiable5[
      /* identifier */ java.lang.String, 
      /* uuid */ java.lang.String, 
      /* major */ scala.Double, 
      /* minor */ scala.Double, 
      /* notifyEntryStateOnDisplay */ scala.Boolean, 
      BeaconRegion
    ] {
  var major: java.lang.String = js.native
  var minor: java.lang.String = js.native
  var notifyEntryStateOnDisplay: scala.Boolean = js.native
  var uuid: java.lang.String = js.native
}

