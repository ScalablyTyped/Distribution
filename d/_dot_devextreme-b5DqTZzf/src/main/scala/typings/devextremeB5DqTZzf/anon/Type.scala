package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.array
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.local
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.odata
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.xmla
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  /**
    * Specifies the PivotGridDataSource&apos;s storage type.
    */
  var `type`: js.UndefOr[array | local | odata | xmla] = js.undefined
}
object Type {
  
  inline def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: array | local | odata | xmla): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
