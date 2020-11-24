package typings.calq

import org.scalablytyped.runtime.StringDictionary
import typings.calq.Calq.Action
import typings.calq.Calq.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calq_ extends js.Object {
  
  var action: Action = js.native
  
  def init(writeKey: String): Unit = js.native
  def init(writeKey: String, options: StringDictionary[js.Any]): Unit = js.native
  
  var user: User = js.native
}
