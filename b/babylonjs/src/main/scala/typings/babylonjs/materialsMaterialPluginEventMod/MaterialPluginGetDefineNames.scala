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
  
  extension [Self <: MaterialPluginGetDefineNames](x: Self) {
    
    inline def setDefineNames(value: StringDictionary[Default]): Self = StObject.set(x, "defineNames", value.asInstanceOf[js.Any])
    
    inline def setDefineNamesUndefined: Self = StObject.set(x, "defineNames", js.undefined)
  }
}
