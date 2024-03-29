package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.QueuingStrategy
import typings.typescriptNn5FuAjk.UnderlyingSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("WritableStream")
@js.native
open class WritableStream[W] ()
  extends StObject
     with typings.typescriptNn5FuAjk.WritableStream[W] {
  def this(underlyingSink: UnderlyingSink[W]) = this()
  def this(underlyingSink: Unit, strategy: QueuingStrategy[W]) = this()
  def this(underlyingSink: UnderlyingSink[W], strategy: QueuingStrategy[W]) = this()
}
