package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.QueuingStrategy
import typings.typescriptNn5FuAjk.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("TransformStream")
@js.native
open class TransformStream[I, O] ()
  extends StObject
     with typings.typescriptNn5FuAjk.TransformStream[I, O] {
  def this(transformer: Transformer[I, O]) = this()
  def this(transformer: Unit, writableStrategy: QueuingStrategy[I]) = this()
  def this(transformer: Transformer[I, O], writableStrategy: QueuingStrategy[I]) = this()
  def this(transformer: Unit, writableStrategy: Unit, readableStrategy: QueuingStrategy[O]) = this()
  def this(transformer: Unit, writableStrategy: QueuingStrategy[I], readableStrategy: QueuingStrategy[O]) = this()
  def this(transformer: Transformer[I, O], writableStrategy: Unit, readableStrategy: QueuingStrategy[O]) = this()
  def this(
    transformer: Transformer[I, O],
    writableStrategy: QueuingStrategy[I],
    readableStrategy: QueuingStrategy[O]
  ) = this()
  
  /* CompleteClass */
  override val readable: typings.typescriptNn5FuAjk.ReadableStream[O] = js.native
  
  /* CompleteClass */
  override val writable: typings.typescriptNn5FuAjk.WritableStream[I] = js.native
}
