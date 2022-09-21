package typings.desmos.anon

import typings.desmos.desmosStrings.listValue
import typings.desmos.desmosStrings.numericValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListValue extends StObject {
  
  var listValue: js.Array[Double] = js.native
  
  var numericValue: Double = js.native
  
  def observe(eventName: numericValue | listValue, callback: js.Function0[Unit]): Unit = js.native
  def observe(eventName: String, callback: js.Function0[Unit]): Unit = js.native
}
