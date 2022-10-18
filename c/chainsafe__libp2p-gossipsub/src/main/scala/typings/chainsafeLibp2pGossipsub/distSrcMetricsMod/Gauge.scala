package typings.chainsafeLibp2pGossipsub.distSrcMetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gauge[Labels /* <: LabelsGeneric */] extends StObject {
  
  def addCollect(collectFn: CollectFn[Labels]): Unit = js.native
  
  def inc(): Unit = js.native
  def inc(arg1: Double, arg2: Double): Unit = js.native
  def inc(arg1: Unit, arg2: Double): Unit = js.native
  def inc(labels: Labels): Unit = js.native
  def inc(labels: Labels, value: Double): Unit = js.native
  def inc(value: Double): Unit = js.native
  
  def set(): Unit = js.native
  def set(arg1: Labels): Unit = js.native
  def set(arg1: Double, arg2: Double): Unit = js.native
  def set(arg1: Unit, arg2: Double): Unit = js.native
  def set(labels: Labels, value: Double): Unit = js.native
  def set(value: Double): Unit = js.native
}
