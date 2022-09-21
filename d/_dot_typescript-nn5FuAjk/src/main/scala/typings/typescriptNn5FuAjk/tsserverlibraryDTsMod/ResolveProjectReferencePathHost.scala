package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveProjectReferencePathHost extends StObject {
  
  def fileExists(fileName: java.lang.String): Boolean
}
object ResolveProjectReferencePathHost {
  
  inline def apply(fileExists: java.lang.String => Boolean): ResolveProjectReferencePathHost = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists))
    __obj.asInstanceOf[ResolveProjectReferencePathHost]
  }
  
  extension [Self <: ResolveProjectReferencePathHost](x: Self) {
    
    inline def setFileExists(value: java.lang.String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
  }
}
