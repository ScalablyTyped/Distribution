package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3 extends StObject {
  
  var Bucket: js.UndefOr[string] = js.native
  
  var Enabled: boolean = js.native
  
  var Prefix: js.UndefOr[string] = js.native
}
object S3 {
  
  @scala.inline
  def apply(Enabled: boolean): S3 = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3]
  }
  
  @scala.inline
  implicit class S3MutableBuilder[Self <: S3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: string): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    @scala.inline
    def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: string): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
