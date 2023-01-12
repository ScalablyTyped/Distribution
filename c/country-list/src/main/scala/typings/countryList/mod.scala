package typings.countryList

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("country-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCode(name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCode")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getCodeList(): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodeList")().asInstanceOf[StringDictionary[String]]
  
  inline def getCodes(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodes")().asInstanceOf[js.Array[String]]
  
  inline def getData(): js.Array[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")().asInstanceOf[js.Array[Country]]
  
  inline def getName(code: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(code.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getNameList(): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameList")().asInstanceOf[StringDictionary[String]]
  
  inline def getNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNames")().asInstanceOf[js.Array[String]]
  
  inline def overwrite(countries: js.Array[Country]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overwrite")(countries.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Country extends StObject {
    
    var code: String
    
    var name: String
  }
  object Country {
    
    inline def apply(code: String, name: String): Country = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
