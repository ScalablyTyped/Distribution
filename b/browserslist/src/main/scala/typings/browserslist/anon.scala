package typings.browserslist

import org.scalablytyped.runtime.StringDictionary
import typings.browserslist.mod.Stats
import typings.browserslist.mod._StatsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DataByBrowser
    extends StObject
       with _StatsOptions {
    
    var dataByBrowser: Stats
  }
  object DataByBrowser {
    
    inline def apply(dataByBrowser: Stats): DataByBrowser = {
      val __obj = js.Dynamic.literal(dataByBrowser = dataByBrowser.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataByBrowser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataByBrowser] (val x: Self) extends AnyVal {
      
      inline def setDataByBrowser(value: Stats): Self = StObject.set(x, "dataByBrowser", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var releaseDate: StringDictionary[js.UndefOr[Double | Null]]
    
    var released: js.Array[String]
    
    var versions: js.Array[String]
  }
  object Name {
    
    inline def apply(
      name: String,
      releaseDate: StringDictionary[js.UndefOr[Double | Null]],
      released: js.Array[String],
      versions: js.Array[String]
    ): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], released = released.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReleaseDate(value: StringDictionary[js.UndefOr[Double | Null]]): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
      
      inline def setReleased(value: js.Array[String]): Self = StObject.set(x, "released", value.asInstanceOf[js.Any])
      
      inline def setReleasedVarargs(value: String*): Self = StObject.set(x, "released", js.Array(value*))
      
      inline def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value*))
    }
  }
}
