package typings.backblazeB2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFileVersionsOpts
  extends StObject
     with CommonArgs {
  
  var bucketId: String
  
  var maxFileCount: Double
  
  var startFileId: String
  
  var startFileName: String
}
object ListFileVersionsOpts {
  
  inline def apply(bucketId: String, maxFileCount: Double, startFileId: String, startFileName: String): ListFileVersionsOpts = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], maxFileCount = maxFileCount.asInstanceOf[js.Any], startFileId = startFileId.asInstanceOf[js.Any], startFileName = startFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFileVersionsOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFileVersionsOpts] (val x: Self) extends AnyVal {
    
    inline def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    inline def setMaxFileCount(value: Double): Self = StObject.set(x, "maxFileCount", value.asInstanceOf[js.Any])
    
    inline def setStartFileId(value: String): Self = StObject.set(x, "startFileId", value.asInstanceOf[js.Any])
    
    inline def setStartFileName(value: String): Self = StObject.set(x, "startFileName", value.asInstanceOf[js.Any])
  }
}
