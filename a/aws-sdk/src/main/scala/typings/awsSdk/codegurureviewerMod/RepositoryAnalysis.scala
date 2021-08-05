package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryAnalysis extends StObject {
  
  /**
    *  A  SourceCodeType  that specifies the tip of a branch in an associated repository. 
    */
  var RepositoryHead: RepositoryHeadSourceCodeType
}
object RepositoryAnalysis {
  
  inline def apply(RepositoryHead: RepositoryHeadSourceCodeType): RepositoryAnalysis = {
    val __obj = js.Dynamic.literal(RepositoryHead = RepositoryHead.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryAnalysis]
  }
  
  extension [Self <: RepositoryAnalysis](x: Self) {
    
    inline def setRepositoryHead(value: RepositoryHeadSourceCodeType): Self = StObject.set(x, "RepositoryHead", value.asInstanceOf[js.Any])
  }
}
