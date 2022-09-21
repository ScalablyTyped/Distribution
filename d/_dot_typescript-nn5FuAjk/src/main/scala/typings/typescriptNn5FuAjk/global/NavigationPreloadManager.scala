package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.NavigationPreloadState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("NavigationPreloadManager")
@js.native
open class NavigationPreloadManager ()
  extends StObject
     with typings.typescriptNn5FuAjk.NavigationPreloadManager {
  
  /* CompleteClass */
  override def disable(): typings.typescriptNn5FuAjk.Promise[Unit] = js.native
  
  /* CompleteClass */
  override def enable(): typings.typescriptNn5FuAjk.Promise[Unit] = js.native
  
  /* CompleteClass */
  override def getState(): typings.typescriptNn5FuAjk.Promise[NavigationPreloadState] = js.native
  
  /* CompleteClass */
  override def setHeaderValue(value: java.lang.String): typings.typescriptNn5FuAjk.Promise[Unit] = js.native
}
