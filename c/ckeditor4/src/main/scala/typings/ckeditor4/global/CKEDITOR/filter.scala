package typings.ckeditor4.global.CKEDITOR

import typings.ckeditor4.CKEDITOR.filter.allowedContentRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.filter")
@js.native
open class filter protected ()
  extends StObject
     with typings.ckeditor4.CKEDITOR.filter {
  def this(editorOrRules: typings.ckeditor4.CKEDITOR.editor) = this()
  def this(editorOrRules: allowedContentRules) = this()
}
object filter {
  
  @JSGlobal("CKEDITOR.filter.transformationTools")
  @js.native
  val transformationTools: typings.ckeditor4.CKEDITOR.filter.transformationTools = js.native
}
