package typings.backblazeB2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFileNamesOpts
  extends StObject
     with CommonArgs {
  
  var bucketId: String
  
  var delimiter: String
  
  var maxFileCount: Double
  
  var prefix: String
  
  var startFileName: String
}
object ListFileNamesOpts {
  
  inline def apply(bucketId: String, delimiter: String, maxFileCount: Double, prefix: String, startFileName: String): ListFileNamesOpts = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], maxFileCount = maxFileCount.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], startFileName = startFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFileNamesOpts]
  }
  
  extension [Self <: ListFileNamesOpts](x: Self) {
    
    inline def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setMaxFileCount(value: Double): Self = StObject.set(x, "maxFileCount", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setStartFileName(value: String): Self = StObject.set(x, "startFileName", value.asInstanceOf[js.Any])
  }
}
