package typings.braftEditor

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.Draft.Model.Encoding.RawDraftContentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsEmpty
  extends /* key */ StringDictionary[js.Any] {
  def isEmpty(): Boolean = js.native
  def setConvertOptions(): Unit = js.native
  def setConvertOptions(option: js.Object): Unit = js.native
  def toHTML(): String = js.native
  def toHTML(option: js.Object): String = js.native
  def toRAW(): RawDraftContentState | String = js.native
  def toRAW(noStringify: Boolean): RawDraftContentState | String = js.native
  def toText(): String = js.native
}

