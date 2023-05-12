package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchSource extends StObject {
  
  /**
    * The value of the yum repo configuration. For example:  [main]   name=MyCustomRepository   baseurl=https://my-custom-repository   enabled=1   For information about other options available for your yum repository configuration, see dnf.conf(5). 
    */
  var Configuration: PatchSourceConfiguration
  
  /**
    * The name specified to identify the patch source.
    */
  var Name: PatchSourceName
  
  /**
    * The specific operating system versions a patch repository applies to, such as "Ubuntu16.04", "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product values, see PatchFilter.
    */
  var Products: PatchSourceProductList
}
object PatchSource {
  
  inline def apply(Configuration: PatchSourceConfiguration, Name: PatchSourceName, Products: PatchSourceProductList): PatchSource = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Products = Products.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchSource] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: PatchSourceConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setName(value: PatchSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setProducts(value: PatchSourceProductList): Self = StObject.set(x, "Products", value.asInstanceOf[js.Any])
    
    inline def setProductsVarargs(value: PatchSourceProduct*): Self = StObject.set(x, "Products", js.Array(value*))
  }
}
