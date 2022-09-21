package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.StorageEstimate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("StorageManager")
@js.native
open class StorageManager ()
  extends StObject
     with typings.typescriptNn5FuAjk.StorageManager {
  
  /* CompleteClass */
  override def estimate(): typings.typescriptNn5FuAjk.Promise[StorageEstimate] = js.native
  
  /* CompleteClass */
  override def getDirectory(): typings.typescriptNn5FuAjk.Promise[typings.typescriptNn5FuAjk.FileSystemDirectoryHandle] = js.native
  
  /* CompleteClass */
  override def persist(): typings.typescriptNn5FuAjk.Promise[scala.Boolean] = js.native
  
  /* CompleteClass */
  override def persisted(): typings.typescriptNn5FuAjk.Promise[scala.Boolean] = js.native
}
