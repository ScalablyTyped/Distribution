package typings.chainsafeLibp2pGossipsub.distSrcMetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Histogram[Labels /* <: LabelsGeneric */] extends StObject {
  
  def observe(arg1: Labels): Unit = js.native
  def observe(arg1: Double, arg2: Double): Unit = js.native
  def observe(labels: Labels, values: Double): Unit = js.native
  def observe(value: Double): Unit = js.native
  
  def reset(): Unit = js.native
  
  def startTimer(): js.Function0[Unit] = js.native
}
