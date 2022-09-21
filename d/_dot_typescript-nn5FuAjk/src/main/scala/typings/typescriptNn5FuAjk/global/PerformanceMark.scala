package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.DOMHighResTimeStamp
import typings.typescriptNn5FuAjk.PerformanceMarkOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PerformanceMark")
@js.native
open class PerformanceMark protected ()
  extends StObject
     with typings.typescriptNn5FuAjk.PerformanceMark {
  def this(markName: java.lang.String) = this()
  def this(markName: java.lang.String, markOptions: PerformanceMarkOptions) = this()
  
  /* CompleteClass */
  override val detail: Any = js.native
  
  /* CompleteClass */
  override val duration: DOMHighResTimeStamp = js.native
  
  /* CompleteClass */
  override val entryType: java.lang.String = js.native
  
  /* CompleteClass */
  override val name: java.lang.String = js.native
  
  /* CompleteClass */
  override val startTime: DOMHighResTimeStamp = js.native
  
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
