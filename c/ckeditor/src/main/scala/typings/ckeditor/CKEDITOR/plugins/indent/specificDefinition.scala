package typings.ckeditor.CKEDITOR.plugins.indent

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.dom.elementPath
import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.anon.Exec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait specificDefinition extends js.Object {
  var database: StringDictionary[js.Any]
  val enterBr: Boolean
  val indentKey: StringDictionary[js.Any]
  val isIndent: Boolean
  val jobs: StringDictionary[Exec]
  val relatedGlobal: StringDictionary[js.Any]
  def execJob(editor: editor, priority: Double): Boolean
  def getContext(node: elementPath): element
  def refreshJob(editor: editor, priority: Double): Double
}

object specificDefinition {
  @scala.inline
  def apply(
    database: StringDictionary[js.Any],
    enterBr: Boolean,
    execJob: (editor, Double) => Boolean,
    getContext: elementPath => element,
    indentKey: StringDictionary[js.Any],
    isIndent: Boolean,
    jobs: StringDictionary[Exec],
    refreshJob: (editor, Double) => Double,
    relatedGlobal: StringDictionary[js.Any]
  ): specificDefinition = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], enterBr = enterBr.asInstanceOf[js.Any], execJob = js.Any.fromFunction2(execJob), getContext = js.Any.fromFunction1(getContext), indentKey = indentKey.asInstanceOf[js.Any], isIndent = isIndent.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], refreshJob = js.Any.fromFunction2(refreshJob), relatedGlobal = relatedGlobal.asInstanceOf[js.Any])
    __obj.asInstanceOf[specificDefinition]
  }
}

