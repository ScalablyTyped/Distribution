package typings.blocks

import org.scalablytyped.runtime.StringDictionary
import typings.blocks.anon.Create
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionPrototype
  extends StObject
     with /* propertyName */ StringDictionary[js.Any] {
  
  var options: js.UndefOr[Create] = js.undefined
}
object CollectionPrototype {
  
  inline def apply(): CollectionPrototype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionPrototype]
  }
  
  extension [Self <: CollectionPrototype](x: Self) {
    
    inline def setOptions(value: Create): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
