package typings.cyclonedx.mod

import typings.cyclonedx.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Evidence extends StObject {
  
  var copyright: js.Array[Text]
  
  var licenses: js.UndefOr[js.Array[LicenseOrExpression]] = js.undefined
}
object Evidence {
  
  inline def apply(copyright: js.Array[Text]): Evidence = {
    val __obj = js.Dynamic.literal(copyright = copyright.asInstanceOf[js.Any])
    __obj.asInstanceOf[Evidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Evidence] (val x: Self) extends AnyVal {
    
    inline def setCopyright(value: js.Array[Text]): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightVarargs(value: Text*): Self = StObject.set(x, "copyright", js.Array(value*))
    
    inline def setLicenses(value: js.Array[LicenseOrExpression]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
    
    inline def setLicensesVarargs(value: LicenseOrExpression*): Self = StObject.set(x, "licenses", js.Array(value*))
  }
}
