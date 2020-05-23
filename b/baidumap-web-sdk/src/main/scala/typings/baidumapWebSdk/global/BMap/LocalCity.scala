package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.LocalCityOptions
import typings.baidumapWebSdk.BMap.LocalCityResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.LocalCity")
@js.native
class LocalCity ()
  extends typings.baidumapWebSdk.BMap.LocalCity {
  def this(opts: LocalCityOptions) = this()
  /* CompleteClass */
  override def get(callback: js.Function1[/* result */ LocalCityResult, Unit]): Unit = js.native
}

