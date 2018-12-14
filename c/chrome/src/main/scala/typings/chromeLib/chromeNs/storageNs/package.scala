package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storageNs {
  type StorageChangedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* changes */ org.scalablytyped.runtime.StringDictionary[StorageChange], 
      /* areaName */ java.lang.String, 
      scala.Unit
    ]
  ]
}
