package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateSpecification extends StObject {
  
  /**
    * The ID of the launch template.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the launch template.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the launch template to use. If no version is specified, then the template's default version is used.
    */
  var version: js.UndefOr[String] = js.undefined
}
object LaunchTemplateSpecification {
  
  @scala.inline
  def apply(): LaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateSpecification]
  }
  
  @scala.inline
  implicit class LaunchTemplateSpecificationMutableBuilder[Self <: LaunchTemplateSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
