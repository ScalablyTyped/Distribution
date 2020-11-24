package typings.ckeditor.CKEDITOR.plugins.indent

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.dom.elementPath
import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.anon.Exec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait specificDefinition extends js.Object {
  
  var database: StringDictionary[js.Any] = js.native
  
  val enterBr: Boolean = js.native
  
  def execJob(editor: editor, priority: Double): Boolean = js.native
  
  def getContext(node: elementPath): element = js.native
  
  val indentKey: StringDictionary[js.Any] = js.native
  
  val isIndent: Boolean = js.native
  
  val jobs: StringDictionary[Exec] = js.native
  
  def refreshJob(editor: editor, priority: Double): Double = js.native
  
  val relatedGlobal: StringDictionary[js.Any] = js.native
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
  
  @scala.inline
  implicit class specificDefinitionOps[Self <: specificDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatabase(value: StringDictionary[js.Any]): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterBr(value: Boolean): Self = this.set("enterBr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecJob(value: (editor, Double) => Boolean): Self = this.set("execJob", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetContext(value: elementPath => element): Self = this.set("getContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndentKey(value: StringDictionary[js.Any]): Self = this.set("indentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIndent(value: Boolean): Self = this.set("isIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobs(value: StringDictionary[Exec]): Self = this.set("jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshJob(value: (editor, Double) => Double): Self = this.set("refreshJob", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRelatedGlobal(value: StringDictionary[js.Any]): Self = this.set("relatedGlobal", value.asInstanceOf[js.Any])
  }
}
