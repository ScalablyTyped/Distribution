package typings.babylonjs.global

import typings.babylonjs.PressureObserverOptions
import typings.babylonjs.PressureRecord
import typings.babylonjs.PressureSource
import typings.babylonjs.PressureUpdateCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PressureObserver")
@js.native
open class PressureObserver protected ()
  extends StObject
     with typings.babylonjs.PressureObserver {
  def this(callback: PressureUpdateCallback) = this()
  def this(callback: PressureUpdateCallback, options: PressureObserverOptions) = this()
  
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  
  /* CompleteClass */
  override def observe(source: PressureSource): Unit = js.native
  
  /* CompleteClass */
  override def takeRecords(): js.Array[PressureRecord] = js.native
  
  /* CompleteClass */
  override def unobserve(source: PressureSource): Unit = js.native
}
object PressureObserver {
  
  @JSGlobal("PressureObserver")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("PressureObserver.supportedSources")
  @js.native
  def supportedSources: js.Array[PressureSource] = js.native
  inline def supportedSources_=(x: js.Array[PressureSource]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedSources")(x.asInstanceOf[js.Any])
}
