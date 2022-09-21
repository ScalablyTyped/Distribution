package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait StorageManager extends StObject {
  
  def estimate(): Promise[StorageEstimate]
  
  def getDirectory(): Promise[FileSystemDirectoryHandle]
  
  def persist(): Promise[scala.Boolean]
  
  def persisted(): Promise[scala.Boolean]
}
object StorageManager {
  
  inline def apply(
    estimate: () => Promise[StorageEstimate],
    getDirectory: () => Promise[FileSystemDirectoryHandle],
    persist: () => Promise[scala.Boolean],
    persisted: () => Promise[scala.Boolean]
  ): StorageManager = {
    val __obj = js.Dynamic.literal(estimate = js.Any.fromFunction0(estimate), getDirectory = js.Any.fromFunction0(getDirectory), persist = js.Any.fromFunction0(persist), persisted = js.Any.fromFunction0(persisted))
    __obj.asInstanceOf[StorageManager]
  }
  
  extension [Self <: StorageManager](x: Self) {
    
    inline def setEstimate(value: () => Promise[StorageEstimate]): Self = StObject.set(x, "estimate", js.Any.fromFunction0(value))
    
    inline def setGetDirectory(value: () => Promise[FileSystemDirectoryHandle]): Self = StObject.set(x, "getDirectory", js.Any.fromFunction0(value))
    
    inline def setPersist(value: () => Promise[scala.Boolean]): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
    
    inline def setPersisted(value: () => Promise[scala.Boolean]): Self = StObject.set(x, "persisted", js.Any.fromFunction0(value))
  }
}
