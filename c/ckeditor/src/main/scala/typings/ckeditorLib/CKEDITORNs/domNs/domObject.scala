package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.domObject")
@js.native
class domObject protected ()
  extends ckeditorLib.CKEDITORNs.event {
  def this(nativeDomObject: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  @JSName("$")
  val $: js.Any = js.native
  def clearCustomData(): scala.Unit = js.native
  def equals(`object`: js.Any): scala.Boolean = js.native
  def getCustomData(key: java.lang.String): js.Any = js.native
  def getPrivate(): js.Any = js.native
  def getUniqueId(): scala.Double = js.native
  def removeCustomData(key: java.lang.String): js.Any = js.native
  def setCustomData(key: java.lang.String, value: js.Any): domObject = js.native
}

