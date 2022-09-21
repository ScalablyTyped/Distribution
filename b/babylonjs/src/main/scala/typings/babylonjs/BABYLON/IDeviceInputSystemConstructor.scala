package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait IDeviceInputSystemConstructor
  extends StObject
     with Instantiable3[
      /* onDeviceConnected */ js.Function2[/* deviceType */ DeviceType, /* deviceSlot */ Double, Unit], 
      /* onDeviceDisconnected */ js.Function2[/* deviceType */ DeviceType, /* deviceSlot */ Double, Unit], 
      /* onInputChanged */ js.Function4[
        /* deviceType */ DeviceType, 
        /* deviceSlot */ Double, 
        /* inputIndex */ Double, 
        /* currentState */ Double, 
        Unit
      ], 
      IDeviceInputSystem
    ]
