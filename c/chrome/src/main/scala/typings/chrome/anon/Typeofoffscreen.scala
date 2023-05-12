package typings.chrome.anon

import typings.chrome.chrome.offscreen.CreateParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoffscreen extends StObject {
  
  def closeDocument(): js.Promise[Unit] = js.native
  def closeDocument(callback: js.Function0[Unit]): Unit = js.native
  
  def createDocument(parameters: CreateParameters): js.Promise[Unit] = js.native
  def createDocument(parameters: CreateParameters, callback: js.Function0[Unit]): Unit = js.native
  
  def hasDocument(): js.Promise[Boolean] = js.native
  def hasDocument(callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
}
