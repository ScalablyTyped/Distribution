package typings.cyclonedx.anon

import typings.cyclonedx.mod.LicenseOrExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait License
  extends StObject
     with LicenseOrExpression {
  
  var expression: String
  
  var license: js.UndefOr[typings.cyclonedx.mod.License] = js.undefined
}
object License {
  
  inline def apply(expression: String): License = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[License]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: License] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setLicense(value: typings.cyclonedx.mod.License): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
  }
}
