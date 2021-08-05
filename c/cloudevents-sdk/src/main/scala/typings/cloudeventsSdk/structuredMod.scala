package typings.cloudeventsSdk

import typings.cloudeventsSdk.cloudeventMod.CloudEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structuredMod {
  
  @JSImport("cloudevents-sdk/lib/bindings/http/validation/structured", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def check(payload: js.Any, headers: js.Any, receiver: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(payload.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parse(payload: js.Any, headers: js.Any, receiver: js.Any): CloudEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(payload.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[CloudEvent]
}
