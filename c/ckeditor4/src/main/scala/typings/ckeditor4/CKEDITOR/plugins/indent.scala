package typings.ckeditor4.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor4.CKEDITOR.commandDefinition
import typings.ckeditor4.CKEDITOR.dom.element
import typings.ckeditor4.CKEDITOR.dom.elementPath
import typings.ckeditor4.CKEDITOR.editor
import typings.ckeditor4.anon.Exec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indent {
  
  @js.native
  trait genericDefinition
    extends StObject
       with commandDefinition {
    
    @JSName("async")
    var async_genericDefinition: Boolean = js.native
    
    @JSName("canUndo")
    var canUndo_genericDefinition: Boolean = js.native
    
    @JSName("contextSensitive")
    var contextSensitive_genericDefinition: Boolean = js.native
    
    @JSName("context")
    var context_genericDefinition: Boolean = js.native
    
    @JSName("editorFocus")
    var editorFocus_genericDefinition: Boolean = js.native
    
    @JSName("fakeKeystroke")
    var fakeKeystroke_genericDefinition: Double = js.native
    
    val isIndent: Boolean = js.native
    
    @JSName("modes")
    var modes_genericDefinition: StringDictionary[Any] = js.native
    
    @JSName("readOnly")
    var readOnly_genericDefinition: Boolean = js.native
    
    @JSName("startDisabled")
    var startDisabled_genericDefinition: Boolean = js.native
  }
  
  trait specificDefinition extends StObject {
    
    var database: StringDictionary[Any]
    
    val enterBr: Boolean
    
    def execJob(editor: editor, priority: Double): Boolean
    
    def getContext(node: elementPath): element
    
    val indentKey: StringDictionary[Any]
    
    val isIndent: Boolean
    
    val jobs: StringDictionary[Exec]
    
    def refreshJob(editor: editor, priority: Double): Double
    
    val relatedGlobal: StringDictionary[Any]
  }
  object specificDefinition {
    
    inline def apply(
      database: StringDictionary[Any],
      enterBr: Boolean,
      execJob: (editor, Double) => Boolean,
      getContext: elementPath => element,
      indentKey: StringDictionary[Any],
      isIndent: Boolean,
      jobs: StringDictionary[Exec],
      refreshJob: (editor, Double) => Double,
      relatedGlobal: StringDictionary[Any]
    ): specificDefinition = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], enterBr = enterBr.asInstanceOf[js.Any], execJob = js.Any.fromFunction2(execJob), getContext = js.Any.fromFunction1(getContext), indentKey = indentKey.asInstanceOf[js.Any], isIndent = isIndent.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], refreshJob = js.Any.fromFunction2(refreshJob), relatedGlobal = relatedGlobal.asInstanceOf[js.Any])
      __obj.asInstanceOf[specificDefinition]
    }
    
    extension [Self <: specificDefinition](x: Self) {
      
      inline def setDatabase(value: StringDictionary[Any]): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setEnterBr(value: Boolean): Self = StObject.set(x, "enterBr", value.asInstanceOf[js.Any])
      
      inline def setExecJob(value: (editor, Double) => Boolean): Self = StObject.set(x, "execJob", js.Any.fromFunction2(value))
      
      inline def setGetContext(value: elementPath => element): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
      
      inline def setIndentKey(value: StringDictionary[Any]): Self = StObject.set(x, "indentKey", value.asInstanceOf[js.Any])
      
      inline def setIsIndent(value: Boolean): Self = StObject.set(x, "isIndent", value.asInstanceOf[js.Any])
      
      inline def setJobs(value: StringDictionary[Exec]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
      
      inline def setRefreshJob(value: (editor, Double) => Double): Self = StObject.set(x, "refreshJob", js.Any.fromFunction2(value))
      
      inline def setRelatedGlobal(value: StringDictionary[Any]): Self = StObject.set(x, "relatedGlobal", value.asInstanceOf[js.Any])
    }
  }
}
