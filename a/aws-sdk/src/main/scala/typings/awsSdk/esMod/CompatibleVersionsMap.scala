package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompatibleVersionsMap extends StObject {
  
  /**
    * The current version of Elasticsearch on which a domain is.
    */
  var SourceVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined
  
  var TargetVersions: js.UndefOr[ElasticsearchVersionList] = js.undefined
}
object CompatibleVersionsMap {
  
  inline def apply(): CompatibleVersionsMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibleVersionsMap]
  }
  
  extension [Self <: CompatibleVersionsMap](x: Self) {
    
    inline def setSourceVersion(value: ElasticsearchVersionString): Self = StObject.set(x, "SourceVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceVersionUndefined: Self = StObject.set(x, "SourceVersion", js.undefined)
    
    inline def setTargetVersions(value: ElasticsearchVersionList): Self = StObject.set(x, "TargetVersions", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionsUndefined: Self = StObject.set(x, "TargetVersions", js.undefined)
    
    inline def setTargetVersionsVarargs(value: ElasticsearchVersionString*): Self = StObject.set(x, "TargetVersions", js.Array(value :_*))
  }
}
