package typings.cloudeventsSdk

import typings.cloudeventsSdk.cloudeventMod.CloudEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryMod {
  
  @JSImport("cloudevents-sdk/lib/bindings/http/validation/binary", "check")
  @js.native
  def check(payload: js.Any, headers: js.Any, receiver: js.Any): Boolean = js.native
  
  @JSImport("cloudevents-sdk/lib/bindings/http/validation/binary", "parse")
  @js.native
  def parse(payload: js.Any, headers: js.Any, receiver: js.Any): CloudEvent = js.native
}
