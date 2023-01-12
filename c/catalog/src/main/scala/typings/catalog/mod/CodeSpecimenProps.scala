package typings.catalog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeSpecimenProps extends StObject {
  
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var raw: js.UndefOr[Boolean] = js.undefined
}
object CodeSpecimenProps {
  
  inline def apply(): CodeSpecimenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeSpecimenProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeSpecimenProps] (val x: Self) extends AnyVal {
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
