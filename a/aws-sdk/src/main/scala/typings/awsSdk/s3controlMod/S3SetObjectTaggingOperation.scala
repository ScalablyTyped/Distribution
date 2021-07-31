package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3SetObjectTaggingOperation extends StObject {
  
  /**
    * 
    */
  var TagSet: js.UndefOr[S3TagSet] = js.undefined
}
object S3SetObjectTaggingOperation {
  
  @scala.inline
  def apply(): S3SetObjectTaggingOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3SetObjectTaggingOperation]
  }
  
  @scala.inline
  implicit class S3SetObjectTaggingOperationMutableBuilder[Self <: S3SetObjectTaggingOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagSet(value: S3TagSet): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSetUndefined: Self = StObject.set(x, "TagSet", js.undefined)
    
    @scala.inline
    def setTagSetVarargs(value: S3Tag*): Self = StObject.set(x, "TagSet", js.Array(value :_*))
  }
}
