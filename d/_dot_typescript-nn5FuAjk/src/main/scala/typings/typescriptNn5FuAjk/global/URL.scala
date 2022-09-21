package typings.typescriptNn5FuAjk.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("URL")
@js.native
open class URL protected ()
  extends StObject
     with typings.typescriptNn5FuAjk.URL {
  def this(url: java.lang.String) = this()
  def this(url: typings.typescriptNn5FuAjk.URL) = this()
  def this(url: java.lang.String, base: java.lang.String) = this()
  def this(url: java.lang.String, base: typings.typescriptNn5FuAjk.URL) = this()
  def this(url: typings.typescriptNn5FuAjk.URL, base: java.lang.String) = this()
  def this(url: typings.typescriptNn5FuAjk.URL, base: typings.typescriptNn5FuAjk.URL) = this()
  
  /* CompleteClass */
  var hash: java.lang.String = js.native
  
  /* CompleteClass */
  var host: java.lang.String = js.native
  
  /* CompleteClass */
  var hostname: java.lang.String = js.native
  
  /* CompleteClass */
  var href: java.lang.String = js.native
  
  /* CompleteClass */
  override val origin: java.lang.String = js.native
  
  /* CompleteClass */
  var password: java.lang.String = js.native
  
  /* CompleteClass */
  var pathname: java.lang.String = js.native
  
  /* CompleteClass */
  var port: java.lang.String = js.native
  
  /* CompleteClass */
  var protocol: java.lang.String = js.native
  
  /* CompleteClass */
  var search: java.lang.String = js.native
  
  /* CompleteClass */
  override val searchParams: typings.typescriptNn5FuAjk.URLSearchParams = js.native
  
  /* CompleteClass */
  override def toJSON(): java.lang.String = js.native
  
  /* CompleteClass */
  var username: java.lang.String = js.native
}
object URL {
  
  @JSGlobal("URL")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createObjectURL(obj: typings.typescriptNn5FuAjk.Blob): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def createObjectURL(obj: typings.typescriptNn5FuAjk.MediaSource): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  inline def revokeObjectURL(url: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeObjectURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
