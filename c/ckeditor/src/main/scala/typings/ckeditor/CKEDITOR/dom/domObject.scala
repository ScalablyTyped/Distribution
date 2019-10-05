package typings.ckeditor.CKEDITOR.dom

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.domObject")
@js.native
class domObject protected ()
  extends typings.ckeditor.CKEDITOR.event {
  def this(nativeDomObject: StringDictionary[js.Any]) = this()
  @JSName("$")
  val $: js.Any = js.native
  def clearCustomData(): Unit = js.native
  def equals(`object`: js.Any): Boolean = js.native
  def getCustomData(key: String): js.Any = js.native
  def getPrivate(): js.Any = js.native
  def getUniqueId(): Double = js.native
  def removeCustomData(key: String): js.Any = js.native
  def setCustomData(key: String, value: js.Any): domObject = js.native
}

