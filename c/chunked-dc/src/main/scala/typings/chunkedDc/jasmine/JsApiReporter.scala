package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsApiReporter
  extends StObject
     with Reporter
     with Instantiable0[scala.Any] {
  
  var finished: Boolean = js.native
  
  def log(str: scala.Any): scala.Any = js.native
  
  var messages: scala.Any = js.native
  
  var result: scala.Any = js.native
  
  def results(): scala.Any = js.native
  
  def resultsForSpec(specId: scala.Any): scala.Any = js.native
  
  def resultsForSpecs(specIds: scala.Any): scala.Any = js.native
  
  var started: Boolean = js.native
  
  def suites(): js.Array[Suite] = js.native
  
  def summarizeResult_(result: scala.Any): scala.Any = js.native
  
  def summarize_(suiteOrSpec: SuiteOrSpec): scala.Any = js.native
}
