package typings.codepage.codepageMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CP$Utils extends js.Object {
  var magic: StringDictionary[String] = js.native
  def decode(cp: CP$Index, data: CP$Data): String = js.native
  def encode(cp: CP$Index, data: CP$String): CP$Data = js.native
  def encode(cp: CP$Index, data: CP$String, opts: js.Any): CP$Data = js.native
  def hascp(n: Double): Boolean = js.native
}

