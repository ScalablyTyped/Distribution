package typings.baseui.anon

import typings.baseui.snackbarTypesMod.SnackbarElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dequeue extends StObject {
  
  def dequeue(): Unit = js.native
  
  def enqueue(elementProps: SnackbarElementProps): Unit = js.native
  def enqueue(elementProps: SnackbarElementProps, duration: Double): Unit = js.native
}
