package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Location extends StObject {
  
  /**
    * The S3 bucket name.
    */
  var Bucket: typings.awsSdk.databrewMod.Bucket
  
  /**
    * The unique name of the object in the bucket.
    */
  var Key: js.UndefOr[typings.awsSdk.databrewMod.Key] = js.undefined
}
object S3Location {
  
  @scala.inline
  def apply(Bucket: Bucket): S3Location = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
  
  @scala.inline
  implicit class S3LocationMutableBuilder[Self <: S3Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: Bucket): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
