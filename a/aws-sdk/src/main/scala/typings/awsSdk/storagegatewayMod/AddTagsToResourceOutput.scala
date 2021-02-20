package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTagsToResourceOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource you want to add tags to.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.storagegatewayMod.ResourceARN] = js.native
}
object AddTagsToResourceOutput {
  
  @scala.inline
  def apply(): AddTagsToResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTagsToResourceOutput]
  }
  
  @scala.inline
  implicit class AddTagsToResourceOutputMutableBuilder[Self <: AddTagsToResourceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
  }
}
