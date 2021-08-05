package typings.chrome.anon

import typings.chrome.chrome.topSites.MostVisitedURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoftopSites extends StObject {
  
  def get(callback: js.Function1[/* data */ js.Array[MostVisitedURL], Unit]): Unit
}
object TypeoftopSites {
  
  inline def apply(get: js.Function1[/* data */ js.Array[MostVisitedURL], Unit] => Unit): TypeoftopSites = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[TypeoftopSites]
  }
  
  extension [Self <: TypeoftopSites](x: Self) {
    
    inline def setGet(value: js.Function1[/* data */ js.Array[MostVisitedURL], Unit] => Unit): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
