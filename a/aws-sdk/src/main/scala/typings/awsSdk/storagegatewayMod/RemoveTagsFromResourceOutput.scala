package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveTagsFromResourceOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource that the tags were removed from.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.storagegatewayMod.ResourceARN] = js.native
}
object RemoveTagsFromResourceOutput {
  
  @scala.inline
  def apply(): RemoveTagsFromResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveTagsFromResourceOutput]
  }
  
  @scala.inline
  implicit class RemoveTagsFromResourceOutputMutableBuilder[Self <: RemoveTagsFromResourceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
  }
}
