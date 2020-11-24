package typings.benchmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("benchmark", "Event")
@js.native
class Event protected () extends js.Object {
  def this(`type`: String) = this()
  def this(`type`: js.Object) = this()
  
  var aborted: Boolean = js.native
  
  var cancelled: Boolean = js.native
  
  var currentTarget: js.Object = js.native
  
  var result: js.Any = js.native
  
  var target: Target = js.native
  
  var timeStamp: Double = js.native
  
  var `type`: String = js.native
}
