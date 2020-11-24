package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tabCapture {
  
  type CaptureStatusChangedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* info */ typings.chrome.chrome.tabCapture.CaptureInfo, scala.Unit]
  ]
}
