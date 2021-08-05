package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyBuffer extends StObject {
  
  var copyBuffer: js.UndefOr[Boolean] = js.undefined
  
  var map: js.UndefOr[js.Function] = js.undefined
  
  var set: js.UndefOr[js.Function] = js.undefined
  
  var useBigIntAsLong: js.UndefOr[Boolean] = js.undefined
  
  var useBigIntAsVarint: js.UndefOr[Boolean] = js.undefined
  
  var useUndefinedAsUnset: js.UndefOr[Boolean] = js.undefined
}
object CopyBuffer {
  
  inline def apply(): CopyBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyBuffer]
  }
  
  extension [Self <: CopyBuffer](x: Self) {
    
    inline def setCopyBuffer(value: Boolean): Self = StObject.set(x, "copyBuffer", value.asInstanceOf[js.Any])
    
    inline def setCopyBufferUndefined: Self = StObject.set(x, "copyBuffer", js.undefined)
    
    inline def setMap(value: js.Function): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setSet(value: js.Function): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setUseBigIntAsLong(value: Boolean): Self = StObject.set(x, "useBigIntAsLong", value.asInstanceOf[js.Any])
    
    inline def setUseBigIntAsLongUndefined: Self = StObject.set(x, "useBigIntAsLong", js.undefined)
    
    inline def setUseBigIntAsVarint(value: Boolean): Self = StObject.set(x, "useBigIntAsVarint", value.asInstanceOf[js.Any])
    
    inline def setUseBigIntAsVarintUndefined: Self = StObject.set(x, "useBigIntAsVarint", js.undefined)
    
    inline def setUseUndefinedAsUnset(value: Boolean): Self = StObject.set(x, "useUndefinedAsUnset", value.asInstanceOf[js.Any])
    
    inline def setUseUndefinedAsUnsetUndefined: Self = StObject.set(x, "useUndefinedAsUnset", js.undefined)
  }
}
