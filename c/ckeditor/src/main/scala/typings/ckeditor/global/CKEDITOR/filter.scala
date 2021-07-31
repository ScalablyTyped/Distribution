package typings.ckeditor.global.CKEDITOR

import typings.ckeditor.CKEDITOR.filter.allowedContentRules
import typings.ckeditor.CKEDITOR.filter.transformationTools
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.filter")
@js.native
class filter protected ()
  extends StObject
     with typings.ckeditor.CKEDITOR.filter {
  def this(editorOrRules: typings.ckeditor.CKEDITOR.editor) = this()
  def this(editorOrRules: allowedContentRules) = this()
}
object filter {
  
  @JSGlobal("CKEDITOR.filter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("CKEDITOR.filter.transformationTools")
  @js.native
  def transformationTools: typings.ckeditor.CKEDITOR.filter.transformationTools = js.native
  @scala.inline
  def transformationTools_=(x: transformationTools): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformationTools")(x.asInstanceOf[js.Any])
  
  /* static member */
  object instances
}
