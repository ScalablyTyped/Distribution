package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyNameQuery extends StObject {
  
  /**
    * Text that begins a property's name.
    */
  var PropertyNameHint: typings.awsSdk.sagemakerMod.PropertyNameHint
}
object PropertyNameQuery {
  
  @scala.inline
  def apply(PropertyNameHint: PropertyNameHint): PropertyNameQuery = {
    val __obj = js.Dynamic.literal(PropertyNameHint = PropertyNameHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyNameQuery]
  }
  
  @scala.inline
  implicit class PropertyNameQueryMutableBuilder[Self <: PropertyNameQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyNameHint(value: PropertyNameHint): Self = StObject.set(x, "PropertyNameHint", value.asInstanceOf[js.Any])
  }
}
