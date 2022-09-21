package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3SourceAdditionalOptions extends StObject {
  
  /**
    * Sets the upper limit for the target number of files that will be processed.
    */
  var BoundedFiles: js.UndefOr[BoxedLong] = js.undefined
  
  /**
    * Sets the upper limit for the target size of the dataset in bytes that will be processed.
    */
  var BoundedSize: js.UndefOr[BoxedLong] = js.undefined
}
object S3SourceAdditionalOptions {
  
  inline def apply(): S3SourceAdditionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3SourceAdditionalOptions]
  }
  
  extension [Self <: S3SourceAdditionalOptions](x: Self) {
    
    inline def setBoundedFiles(value: BoxedLong): Self = StObject.set(x, "BoundedFiles", value.asInstanceOf[js.Any])
    
    inline def setBoundedFilesUndefined: Self = StObject.set(x, "BoundedFiles", js.undefined)
    
    inline def setBoundedSize(value: BoxedLong): Self = StObject.set(x, "BoundedSize", value.asInstanceOf[js.Any])
    
    inline def setBoundedSizeUndefined: Self = StObject.set(x, "BoundedSize", js.undefined)
  }
}
