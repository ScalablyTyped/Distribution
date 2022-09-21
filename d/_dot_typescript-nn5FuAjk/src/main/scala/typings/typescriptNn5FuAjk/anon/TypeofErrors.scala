package typings.typescriptNn5FuAjk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofErrors extends StObject {
  
  def ThrowNoProject(): scala.Nothing
  
  def ThrowProjectDoesNotContainDocument(fileName: String, project: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project): scala.Nothing
  
  def ThrowProjectLanguageServiceDisabled(): scala.Nothing
}
object TypeofErrors {
  
  inline def apply(
    ThrowNoProject: () => scala.Nothing,
    ThrowProjectDoesNotContainDocument: (String, typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project) => scala.Nothing,
    ThrowProjectLanguageServiceDisabled: () => scala.Nothing
  ): TypeofErrors = {
    val __obj = js.Dynamic.literal(ThrowNoProject = js.Any.fromFunction0(ThrowNoProject), ThrowProjectDoesNotContainDocument = js.Any.fromFunction2(ThrowProjectDoesNotContainDocument), ThrowProjectLanguageServiceDisabled = js.Any.fromFunction0(ThrowProjectLanguageServiceDisabled))
    __obj.asInstanceOf[TypeofErrors]
  }
  
  extension [Self <: TypeofErrors](x: Self) {
    
    inline def setThrowNoProject(value: () => scala.Nothing): Self = StObject.set(x, "ThrowNoProject", js.Any.fromFunction0(value))
    
    inline def setThrowProjectDoesNotContainDocument(value: (String, typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project) => scala.Nothing): Self = StObject.set(x, "ThrowProjectDoesNotContainDocument", js.Any.fromFunction2(value))
    
    inline def setThrowProjectLanguageServiceDisabled(value: () => scala.Nothing): Self = StObject.set(x, "ThrowProjectLanguageServiceDisabled", js.Any.fromFunction0(value))
  }
}
