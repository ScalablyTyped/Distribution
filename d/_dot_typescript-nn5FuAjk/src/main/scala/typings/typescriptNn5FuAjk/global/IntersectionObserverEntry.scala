package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.DOMHighResTimeStamp
import typings.typescriptNn5FuAjk.IntersectionObserverEntryInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("IntersectionObserverEntry")
@js.native
open class IntersectionObserverEntry protected ()
  extends StObject
     with typings.typescriptNn5FuAjk.IntersectionObserverEntry {
  def this(intersectionObserverEntryInit: IntersectionObserverEntryInit) = this()
  
  /* CompleteClass */
  override val boundingClientRect: typings.typescriptNn5FuAjk.DOMRectReadOnly = js.native
  
  /* CompleteClass */
  override val intersectionRatio: Double = js.native
  
  /* CompleteClass */
  override val intersectionRect: typings.typescriptNn5FuAjk.DOMRectReadOnly = js.native
  
  /* CompleteClass */
  override val isIntersecting: scala.Boolean = js.native
  
  /* CompleteClass */
  override val rootBounds: typings.typescriptNn5FuAjk.DOMRectReadOnly | Null = js.native
  
  /* CompleteClass */
  override val target: typings.typescriptNn5FuAjk.Element = js.native
  
  /* CompleteClass */
  override val time: DOMHighResTimeStamp = js.native
}
