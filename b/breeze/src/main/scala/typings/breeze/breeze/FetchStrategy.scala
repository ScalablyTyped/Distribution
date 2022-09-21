package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchStrategy
  extends StObject
     with IEnum {
  
  var FromLocalCache: FetchStrategySymbol
  
  var FromServer: FetchStrategySymbol
}
object FetchStrategy {
  
  inline def apply(
    FromLocalCache: FetchStrategySymbol,
    FromServer: FetchStrategySymbol,
    contains: Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): FetchStrategy = {
    val __obj = js.Dynamic.literal(FromLocalCache = FromLocalCache.asInstanceOf[js.Any], FromServer = FromServer.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[FetchStrategy]
  }
  
  extension [Self <: FetchStrategy](x: Self) {
    
    inline def setFromLocalCache(value: FetchStrategySymbol): Self = StObject.set(x, "FromLocalCache", value.asInstanceOf[js.Any])
    
    inline def setFromServer(value: FetchStrategySymbol): Self = StObject.set(x, "FromServer", value.asInstanceOf[js.Any])
  }
}
