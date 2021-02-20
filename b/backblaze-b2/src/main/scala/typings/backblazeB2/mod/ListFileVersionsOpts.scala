package typings.backblazeB2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFileVersionsOpts extends CommonArgs {
  
  var bucketId: String = js.native
  
  var maxFileCount: Double = js.native
  
  var startFileId: String = js.native
  
  var startFileName: String = js.native
}
object ListFileVersionsOpts {
  
  @scala.inline
  def apply(bucketId: String, maxFileCount: Double, startFileId: String, startFileName: String): ListFileVersionsOpts = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], maxFileCount = maxFileCount.asInstanceOf[js.Any], startFileId = startFileId.asInstanceOf[js.Any], startFileName = startFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFileVersionsOpts]
  }
  
  @scala.inline
  implicit class ListFileVersionsOptsMutableBuilder[Self <: ListFileVersionsOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFileCount(value: Double): Self = StObject.set(x, "maxFileCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartFileId(value: String): Self = StObject.set(x, "startFileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartFileName(value: String): Self = StObject.set(x, "startFileName", value.asInstanceOf[js.Any])
  }
}
