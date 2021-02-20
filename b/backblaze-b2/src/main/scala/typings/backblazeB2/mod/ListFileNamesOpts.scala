package typings.backblazeB2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFileNamesOpts extends CommonArgs {
  
  var bucketId: String = js.native
  
  var delimiter: String = js.native
  
  var maxFileCount: Double = js.native
  
  var prefix: String = js.native
  
  var startFileName: String = js.native
}
object ListFileNamesOpts {
  
  @scala.inline
  def apply(bucketId: String, delimiter: String, maxFileCount: Double, prefix: String, startFileName: String): ListFileNamesOpts = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], maxFileCount = maxFileCount.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], startFileName = startFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFileNamesOpts]
  }
  
  @scala.inline
  implicit class ListFileNamesOptsMutableBuilder[Self <: ListFileNamesOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFileCount(value: Double): Self = StObject.set(x, "maxFileCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartFileName(value: String): Self = StObject.set(x, "startFileName", value.asInstanceOf[js.Any])
  }
}
