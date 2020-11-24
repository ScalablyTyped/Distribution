package typings.cordovaPluginIbeacon.mod.global.BeaconPlugin

import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircularRegion
  extends Region
     with Instantiable4[
      /* identifier */ String, 
      /* latitude */ Double, 
      /* longitude */ Double, 
      /* radius */ Double, 
      CircularRegion
    ] {
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  var radius: Double = js.native
}
