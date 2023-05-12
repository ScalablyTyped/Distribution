package typings.ddTrace.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpanContext
  extends typings.opentracing.mod.SpanContext {
  
  /**
    * Returns the string representation used for DBM integration.
    */
  def toTraceparent(): String = js.native
}
