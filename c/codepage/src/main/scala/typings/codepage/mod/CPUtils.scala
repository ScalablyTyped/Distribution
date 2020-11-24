package typings.codepage.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPUtils extends js.Object {
  
  def decode(cp: CPIndex, data: CPData): String = js.native
  
  def encode(cp: CPIndex, data: CPString): CPData = js.native
  def encode(cp: CPIndex, data: CPString, opts: js.Any): CPData = js.native
  
  def hascp(n: Double): Boolean = js.native
  
  var magic: StringDictionary[String] = js.native
}
