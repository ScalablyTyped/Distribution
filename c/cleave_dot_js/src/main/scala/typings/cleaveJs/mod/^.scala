package typings.cleaveJs.mod

import typings.cleaveJs.optionsMod.CleaveOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cleave.js", JSImport.Namespace)
@js.native
class ^ protected () extends Cleave {
  def this(selector: String, options: CleaveOptions) = this()
  def this(selector: HTMLElement, options: CleaveOptions) = this()
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def getFormattedValue(): String = js.native
  /* CompleteClass */
  override def getISOFormatDate(): String = js.native
  /* CompleteClass */
  override def getRawValue(): String = js.native
  /* CompleteClass */
  override def setPhoneRegionCode(regionCode: String): Unit = js.native
  /* CompleteClass */
  override def setRawValue(value: String): Unit = js.native
}

