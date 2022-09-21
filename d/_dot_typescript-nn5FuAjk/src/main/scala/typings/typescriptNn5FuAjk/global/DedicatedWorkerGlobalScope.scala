package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DedicatedWorkerGlobalScope")
@js.native
open class DedicatedWorkerGlobalScope ()
  extends StObject
     with typings.typescriptNn5FuAjk.DedicatedWorkerGlobalScope {
  
  /* CompleteClass */
  override def cancelAnimationFrame(handle: Double): Unit = js.native
  
  /* CompleteClass */
  override val fonts: typings.typescriptNn5FuAjk.FontFaceSet = js.native
  
  /* CompleteClass */
  override def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
}
