package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.QueuingStrategyInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CountQueuingStrategy")
@js.native
open class CountQueuingStrategy protected ()
  extends StObject
     with typings.typescriptNn5FuAjk.CountQueuingStrategy {
  def this(init: QueuingStrategyInit) = this()
  
  /* CompleteClass */
  @JSName("highWaterMark")
  override val highWaterMark_CountQueuingStrategy: Double = js.native
  
  /* CompleteClass */
  @JSName("size")
  override def size_MCountQueuingStrategy(chunk: Any): Double = js.native
}
