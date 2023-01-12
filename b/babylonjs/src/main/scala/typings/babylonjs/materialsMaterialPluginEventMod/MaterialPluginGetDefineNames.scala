package typings.babylonjs.materialsMaterialPluginEventMod

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginGetDefineNames extends StObject {
  
  var defineNames: js.UndefOr[StringDictionary[Default]] = js.undefined
}
object MaterialPluginGetDefineNames {
  
  inline def apply(): MaterialPluginGetDefineNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterialPluginGetDefineNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaterialPluginGetDefineNames] (val x: Self) extends AnyVal {
    
    inline def setDefineNames(value: StringDictionary[Default]): Self = StObject.set(x, "defineNames", value.asInstanceOf[js.Any])
    
    inline def setDefineNamesUndefined: Self = StObject.set(x, "defineNames", js.undefined)
  }
}
