package typings.cloudeventsSdk

import typings.cloudeventsSdk.cloudeventMod.CloudEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cloudevents-sdk/lib/bindings/http/validation/binary", JSImport.Namespace)
@js.native
object binaryMod extends js.Object {
  
  def check(payload: js.Any, headers: js.Any, receiver: js.Any): Boolean = js.native
  
  def parse(payload: js.Any, headers: js.Any, receiver: js.Any): CloudEvent = js.native
}
