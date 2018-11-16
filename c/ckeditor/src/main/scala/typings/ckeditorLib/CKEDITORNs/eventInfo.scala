package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait eventInfo extends js.Object {
  var data: js.Any
  var editor: editor
  var listenerData: js.Any
  var name: java.lang.String
  var sender: ScalablyTyped.runtime.StringDictionary[js.Any]
  def cancel(): scala.Unit
  def removeListener(): scala.Unit
  def stop(): scala.Unit
}

