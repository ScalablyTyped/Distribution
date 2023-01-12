package typings.c3.anon

import org.scalablytyped.runtime.StringDictionary
import typings.c3.mod.FormatFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var format: StringDictionary[Boolean | FormatFunction]
}
object `1` {
  
  inline def apply(format: StringDictionary[Boolean | FormatFunction]): `1` = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: StringDictionary[Boolean | FormatFunction]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
