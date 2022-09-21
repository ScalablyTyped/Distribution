package typings.webpackCdYQfbEx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Basename extends StObject {
  
  var basename: String
  
  var chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Chunk */ Any
  
  var filename: String
  
  var hash: String
  
  var query: String
}
object Basename {
  
  inline def apply(
    basename: String,
    chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Chunk */ Any,
    filename: String,
    hash: String,
    query: String
  ): Basename = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], chunk = chunk.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basename]
  }
  
  extension [Self <: Basename](x: Self) {
    
    inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setChunk(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Chunk */ Any
    ): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
