package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.FileSystemHandleKind
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("FileSystemFileHandle")
@js.native
open class FileSystemFileHandle ()
  extends StObject
     with typings.typescriptNn5FuAjk.FileSystemFileHandle {
  
  /* CompleteClass */
  override def getFile(): typings.typescriptNn5FuAjk.Promise[typings.typescriptNn5FuAjk.File] = js.native
  
  /* CompleteClass */
  override def isSameEntry(other: typings.typescriptNn5FuAjk.FileSystemHandle): typings.typescriptNn5FuAjk.Promise[scala.Boolean] = js.native
  
  /* CompleteClass */
  override val kind: FileSystemHandleKind = js.native
  /* CompleteClass */
  @JSName("kind")
  override val kind_FileSystemFileHandle: file = js.native
  
  /* CompleteClass */
  override val name: java.lang.String = js.native
}
