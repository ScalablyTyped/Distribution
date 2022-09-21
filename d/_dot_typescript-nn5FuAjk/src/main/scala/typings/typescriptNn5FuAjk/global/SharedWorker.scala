package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.AddEventListenerOptions
import typings.typescriptNn5FuAjk.EventListenerOptions
import typings.typescriptNn5FuAjk.EventListenerOrEventListenerObject
import typings.typescriptNn5FuAjk.WorkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SharedWorker")
@js.native
open class SharedWorker protected ()
  extends StObject
     with typings.typescriptNn5FuAjk.SharedWorker {
  def this(scriptURL: java.lang.String) = this()
  def this(scriptURL: typings.typescriptNn5FuAjk.URL) = this()
  def this(scriptURL: java.lang.String, options: java.lang.String) = this()
  def this(scriptURL: java.lang.String, options: WorkerOptions) = this()
  def this(scriptURL: typings.typescriptNn5FuAjk.URL, options: java.lang.String) = this()
  def this(scriptURL: typings.typescriptNn5FuAjk.URL, options: WorkerOptions) = this()
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
}
