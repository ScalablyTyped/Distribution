package typings.codepage.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CPUtils extends js.Object {
  var magic: StringDictionary[String] = js.native
  def decode(cp: CPIndex, data: CPData): String = js.native
  def encode(cp: CPIndex, data: CPString): CPData = js.native
  def encode(cp: CPIndex, data: CPString, opts: js.Any): CPData = js.native
  def hascp(n: Double): Boolean = js.native
}

