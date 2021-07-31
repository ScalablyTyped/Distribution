package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.elementPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait commandDefinition extends StObject {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var canUndo: js.UndefOr[Boolean] = js.native
  
  var context: js.UndefOr[Boolean] = js.native
  
  var contextSensitive: js.UndefOr[Boolean] = js.native
  
  var editorFocus: js.UndefOr[Boolean] = js.native
  
  def exec(editor: editor): Boolean = js.native
  def exec(editor: editor, data: js.Any): Boolean = js.native
  
  var fakeKeystroke: js.UndefOr[Double] = js.native
  
  var modes: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var refresh: js.UndefOr[js.Function2[/* editor */ editor, /* path */ elementPath, Unit]] = js.native
  
  var startDisabled: js.UndefOr[Boolean] = js.native
}
