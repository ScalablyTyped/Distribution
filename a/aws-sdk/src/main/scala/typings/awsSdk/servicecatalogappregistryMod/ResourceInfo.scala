package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceInfo extends StObject {
  
  /**
    * The Amazon resource name (ARN) that specifies the resource across services.
    */
  var arn: js.UndefOr[StackArn] = js.native
  
  /**
    * The name of the resource.
    */
  var name: js.UndefOr[ResourceSpecifier] = js.native
}
object ResourceInfo {
  
  @scala.inline
  def apply(): ResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceInfo]
  }
  
  @scala.inline
  implicit class ResourceInfoMutableBuilder[Self <: ResourceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: StackArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setName(value: ResourceSpecifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
