package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3InputFileLocation extends StObject {
  
  /**
    * Specifies the S3 bucket for the customer input file.
    */
  var Bucket: js.UndefOr[S3Bucket] = js.undefined
  
  /**
    * The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the object.
    */
  var Key: js.UndefOr[S3Key] = js.undefined
}
object S3InputFileLocation {
  
  inline def apply(): S3InputFileLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3InputFileLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3InputFileLocation] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setKey(value: S3Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
