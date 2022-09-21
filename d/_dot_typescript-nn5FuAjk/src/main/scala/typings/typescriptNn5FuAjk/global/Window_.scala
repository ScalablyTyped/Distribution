package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.AddEventListenerOptions
import typings.typescriptNn5FuAjk.EventListenerOptions
import typings.typescriptNn5FuAjk.EventListenerOrEventListenerObject
import typings.typescriptNn5FuAjk.FrameRequestCallback
import typings.typescriptNn5FuAjk.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Window")
@js.native
open class Window_ ()
  extends StObject
     with Window {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* CompleteClass */
  override def cancelAnimationFrame(handle: Double): Unit = js.native
  
  /* CompleteClass */
  override val localStorage: typings.typescriptNn5FuAjk.Storage = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  
  /* CompleteClass */
  override def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  
  /* CompleteClass */
  override val sessionStorage: typings.typescriptNn5FuAjk.Storage = js.native
}
