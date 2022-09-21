package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Inherits from Event, and represents the event object of an event sent on a document or worker when its content security policy is violated. */
@js.native
trait SecurityPolicyViolationEvent
  extends StObject
     with Event {
  
  val blockedURI: java.lang.String = js.native
  
  val columnNumber: Double = js.native
  
  val disposition: SecurityPolicyViolationEventDisposition = js.native
  
  val documentURI: java.lang.String = js.native
  
  val effectiveDirective: java.lang.String = js.native
  
  val lineNumber: Double = js.native
  
  val originalPolicy: java.lang.String = js.native
  
  val referrer: java.lang.String = js.native
  
  val sample: java.lang.String = js.native
  
  val sourceFile: java.lang.String = js.native
  
  val statusCode: Double = js.native
  
  val violatedDirective: java.lang.String = js.native
}
