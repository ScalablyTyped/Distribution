package typings
package codepageLib.codepageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CP$Utils extends js.Object {
  var magic: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def decode(cp: CP$Index, data: CP$Data): java.lang.String = js.native
  def encode(cp: CP$Index, data: CP$String): CP$Data = js.native
  def encode(cp: CP$Index, data: CP$String, opts: js.Any): CP$Data = js.native
  def hascp(n: scala.Double): scala.Boolean = js.native
}

