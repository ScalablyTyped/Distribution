package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaFalseOptions
  extends StObject
     with MetaOptions {
  
  var meta: js.UndefOr[`false`] = js.undefined
}
object MetaFalseOptions {
  
  inline def apply(): MetaFalseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaFalseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetaFalseOptions] (val x: Self) extends AnyVal {
    
    inline def setMeta(value: `false`): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
