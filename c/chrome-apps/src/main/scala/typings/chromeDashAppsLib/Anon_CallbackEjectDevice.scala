package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackEjectDevice extends js.Object {
  val EjectDeviceResultCode: Anon_FAILURE
  val StorageUnitType: Anon_FIXED
  /** Fired when a new removable storage is attached to the system. */
  val onAttached: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[
      /* info */ chromeDashAppsLib.chromeNs.systemNs.storageNs.StorageUnitInfo, 
      scala.Unit
    ]
  ]
  /** Fired when a removable storage is detached from the system. */
  val onDetached: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* id */ java.lang.String, scala.Unit]]
  /**
    * Ejects a removable storage device.
    * @param callback
    * Parameter **result**:
    *
    * **success:** The ejection command is successful -- the application can prompt the user to remove the device;
    *
    * **in_use:** The device is in use by another application. The ejection did not succeed;
    *   the user should not remove the device until the other application is done with the device;
    *
    * **no_such_device:** There is no such device known.
    *
    * **failure:** The ejection command failed.
    */
  def ejectDevice(
    id: java.lang.String,
    callback: js.Function1[
      /* result */ chromeDashAppsLib.chromeNs.ToStringLiteral[
        /* import warning: ImportType.apply Failed type conversion: typeof EjectDeviceResultCode */ js.Any, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: typeof EjectDeviceResultCode[keyof typeof EjectDeviceResultCode] */ js.Any
        ]
      ], 
      scala.Unit
    ]
  ): scala.Unit
  /**
    * Get the available capacity of a specified |id| storage device. The |id| is the transient device ID from StorageUnitInfo.
    * @since Dev channel only.
    */
  def getAvailableCapacity(
    id: java.lang.String,
    callback: js.Function1[
      /* info */ chromeDashAppsLib.chromeNs.systemNs.storageNs.StorageCapacityInfo, 
      scala.Unit
    ]
  ): scala.Unit
  /** Get the storage information from the system. The argument passed to the callback is an array of StorageUnitInfo objects. */
  def getInfo(
    callback: js.Function1[
      /* info */ js.Array[chromeDashAppsLib.chromeNs.systemNs.storageNs.StorageUnitInfo], 
      scala.Unit
    ]
  ): scala.Unit
}

object Anon_CallbackEjectDevice {
  @scala.inline
  def apply(
    EjectDeviceResultCode: Anon_FAILURE,
    StorageUnitType: Anon_FIXED,
    ejectDevice: (java.lang.String, js.Function1[
      /* result */ chromeDashAppsLib.chromeNs.ToStringLiteral[
        /* import warning: ImportType.apply Failed type conversion: typeof EjectDeviceResultCode */ js.Any, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: typeof EjectDeviceResultCode[keyof typeof EjectDeviceResultCode] */ js.Any
        ]
      ], 
      scala.Unit
    ]) => scala.Unit,
    getAvailableCapacity: (java.lang.String, js.Function1[
      /* info */ chromeDashAppsLib.chromeNs.systemNs.storageNs.StorageCapacityInfo, 
      scala.Unit
    ]) => scala.Unit,
    getInfo: js.Function1[
      /* info */ js.Array[chromeDashAppsLib.chromeNs.systemNs.storageNs.StorageUnitInfo], 
      scala.Unit
    ] => scala.Unit,
    onAttached: chromeDashAppsLib.chromeNs.eventsNs.Event[
      js.Function1[
        /* info */ chromeDashAppsLib.chromeNs.systemNs.storageNs.StorageUnitInfo, 
        scala.Unit
      ]
    ],
    onDetached: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* id */ java.lang.String, scala.Unit]]
  ): Anon_CallbackEjectDevice = {
    val __obj = js.Dynamic.literal(EjectDeviceResultCode = EjectDeviceResultCode, StorageUnitType = StorageUnitType, ejectDevice = js.Any.fromFunction2(ejectDevice), getAvailableCapacity = js.Any.fromFunction2(getAvailableCapacity), getInfo = js.Any.fromFunction1(getInfo), onAttached = onAttached, onDetached = onDetached)
  
    __obj.asInstanceOf[Anon_CallbackEjectDevice]
  }
}

