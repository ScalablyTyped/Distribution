package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTags extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The tags for the resource.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object ResourceTags {
  
  @scala.inline
  def apply(): ResourceTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTags]
  }
  
  @scala.inline
  implicit class ResourceTagsMutableBuilder[Self <: ResourceTags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
