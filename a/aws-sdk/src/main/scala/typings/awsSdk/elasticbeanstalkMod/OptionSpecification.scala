package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionSpecification extends StObject {
  
  /**
    * A unique namespace identifying the option's associated AWS resource.
    */
  var Namespace: js.UndefOr[OptionNamespace] = js.native
  
  /**
    * The name of the configuration option.
    */
  var OptionName: js.UndefOr[ConfigurationOptionName] = js.native
  
  /**
    * A unique resource name for a time-based scaling configuration option.
    */
  var ResourceName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ResourceName] = js.native
}
object OptionSpecification {
  
  @scala.inline
  def apply(): OptionSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionSpecification]
  }
  
  @scala.inline
  implicit class OptionSpecificationMutableBuilder[Self <: OptionSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespace(value: OptionNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    @scala.inline
    def setOptionName(value: ConfigurationOptionName): Self = StObject.set(x, "OptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionNameUndefined: Self = StObject.set(x, "OptionName", js.undefined)
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
  }
}
