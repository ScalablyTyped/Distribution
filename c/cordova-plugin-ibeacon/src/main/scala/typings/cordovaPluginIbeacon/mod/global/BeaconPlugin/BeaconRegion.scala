package typings.cordovaPluginIbeacon.mod.global.BeaconPlugin

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeaconRegion
  extends Region
     with Instantiable2[/* identifier */ String, /* uuid */ String, BeaconRegion]
     with Instantiable3[/* identifier */ String, /* uuid */ String, /* major */ Double, BeaconRegion]
     with Instantiable4[
      /* identifier */ String, 
      /* uuid */ String, 
      js.UndefOr[/* major */ Double], 
      /* minor */ Double, 
      BeaconRegion
    ]
     with Instantiable5[
      /* identifier */ String, 
      /* uuid */ String, 
      js.UndefOr[/* major */ Double], 
      js.UndefOr[/* minor */ Double], 
      /* notifyEntryStateOnDisplay */ Boolean, 
      BeaconRegion
    ] {
  var major: String = js.native
  var minor: String = js.native
  var notifyEntryStateOnDisplay: Boolean = js.native
  var uuid: String = js.native
}

