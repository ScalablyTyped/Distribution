package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Tag extends StObject {
  
  /**
    * 
    */
  var Key: TagKeyString
  
  /**
    * 
    */
  var Value: TagValueString
}
object S3Tag {
  
  @scala.inline
  def apply(Key: TagKeyString, Value: TagValueString): S3Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Tag]
  }
  
  @scala.inline
  implicit class S3TagMutableBuilder[Self <: S3Tag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: TagKeyString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TagValueString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
