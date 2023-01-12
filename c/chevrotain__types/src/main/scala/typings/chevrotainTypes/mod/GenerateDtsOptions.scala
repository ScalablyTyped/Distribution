package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateDtsOptions extends StObject {
  
  /**
    * `true` by default.
    * Disable this to prevent the generation of the CSTVisitor interface.
    * For example, if a different traversal method on the CST has been implemented
    * by the end-user and the Chevrotain CST Visitor apis are not used.
    */
  var includeVisitorInterface: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The generated visitor interface will be called `ICstNodeVisitor` by default
    * This parameter enables giving it a more specific name, for example: `MyCstVisitor` or `JohnDoe`
    */
  var visitorInterfaceName: js.UndefOr[String] = js.undefined
}
object GenerateDtsOptions {
  
  inline def apply(): GenerateDtsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDtsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateDtsOptions] (val x: Self) extends AnyVal {
    
    inline def setIncludeVisitorInterface(value: Boolean): Self = StObject.set(x, "includeVisitorInterface", value.asInstanceOf[js.Any])
    
    inline def setIncludeVisitorInterfaceUndefined: Self = StObject.set(x, "includeVisitorInterface", js.undefined)
    
    inline def setVisitorInterfaceName(value: String): Self = StObject.set(x, "visitorInterfaceName", value.asInstanceOf[js.Any])
    
    inline def setVisitorInterfaceNameUndefined: Self = StObject.set(x, "visitorInterfaceName", js.undefined)
  }
}
