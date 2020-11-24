package typings.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object types {
  
  type ChromeSettingChangedEvent = typings.chromeApps.chrome.events.Event[typings.chromeApps.chrome.types.DetailsCallback]
  
  /**
    * @param details Details of the currently effective value.
    */
  type DetailsCallback = js.Function1[
    /* details */ typings.chromeApps.chrome.types.ChromeSettingGetResultDetails, 
    scala.Unit
  ]
}
