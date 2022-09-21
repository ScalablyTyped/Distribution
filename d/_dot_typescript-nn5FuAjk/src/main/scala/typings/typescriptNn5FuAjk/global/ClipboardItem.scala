package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.ClipboardItemOptions
import typings.typescriptNn5FuAjk.PromiseLike
import typings.typescriptNn5FuAjk.ReadonlyArray
import typings.typescriptNn5FuAjk.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ClipboardItem")
@js.native
open class ClipboardItem protected ()
  extends StObject
     with typings.typescriptNn5FuAjk.ClipboardItem {
  def this(items: Record[
        java.lang.String, 
        java.lang.String | typings.typescriptNn5FuAjk.Blob | (PromiseLike[java.lang.String | typings.typescriptNn5FuAjk.Blob])
      ]) = this()
  def this(
    items: Record[
        java.lang.String, 
        java.lang.String | typings.typescriptNn5FuAjk.Blob | (PromiseLike[java.lang.String | typings.typescriptNn5FuAjk.Blob])
      ],
    options: ClipboardItemOptions
  ) = this()
  
  /* CompleteClass */
  override def getType(`type`: java.lang.String): typings.typescriptNn5FuAjk.Promise[typings.typescriptNn5FuAjk.Blob] = js.native
  
  /* CompleteClass */
  override val types: ReadonlyArray[java.lang.String] = js.native
}
