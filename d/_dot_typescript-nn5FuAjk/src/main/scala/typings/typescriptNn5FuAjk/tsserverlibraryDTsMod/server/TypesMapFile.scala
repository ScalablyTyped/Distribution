package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypesMapFile extends StObject {
  
  var simpleMap: StringDictionary[String]
  
  var typesMap: SafeList
}
object TypesMapFile {
  
  inline def apply(simpleMap: StringDictionary[String], typesMap: SafeList): TypesMapFile = {
    val __obj = js.Dynamic.literal(simpleMap = simpleMap.asInstanceOf[js.Any], typesMap = typesMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypesMapFile]
  }
  
  extension [Self <: TypesMapFile](x: Self) {
    
    inline def setSimpleMap(value: StringDictionary[String]): Self = StObject.set(x, "simpleMap", value.asInstanceOf[js.Any])
    
    inline def setTypesMap(value: SafeList): Self = StObject.set(x, "typesMap", value.asInstanceOf[js.Any])
  }
}
