package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.Document
import typings.typescriptNn5FuAjk.IntersectionObserverCallback
import typings.typescriptNn5FuAjk.IntersectionObserverInit
import typings.typescriptNn5FuAjk.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("IntersectionObserver")
@js.native
open class IntersectionObserver protected ()
  extends StObject
     with typings.typescriptNn5FuAjk.IntersectionObserver {
  def this(callback: IntersectionObserverCallback) = this()
  def this(callback: IntersectionObserverCallback, options: IntersectionObserverInit) = this()
  
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  
  /* CompleteClass */
  override def observe(target: typings.typescriptNn5FuAjk.Element): Unit = js.native
  
  /* CompleteClass */
  override val root: typings.typescriptNn5FuAjk.Element | Document | Null = js.native
  
  /* CompleteClass */
  override val rootMargin: java.lang.String = js.native
  
  /* CompleteClass */
  override def takeRecords(): typings.typescriptNn5FuAjk.Array[typings.typescriptNn5FuAjk.IntersectionObserverEntry] = js.native
  
  /* CompleteClass */
  override val thresholds: ReadonlyArray[Double] = js.native
  
  /* CompleteClass */
  override def unobserve(target: typings.typescriptNn5FuAjk.Element): Unit = js.native
}
