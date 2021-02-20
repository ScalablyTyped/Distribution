package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyBuffer extends StObject {
  
  var copyBuffer: js.UndefOr[Boolean] = js.native
  
  var map: js.UndefOr[js.Function] = js.native
  
  var set: js.UndefOr[js.Function] = js.native
  
  var useBigIntAsLong: js.UndefOr[Boolean] = js.native
  
  var useBigIntAsVarint: js.UndefOr[Boolean] = js.native
  
  var useUndefinedAsUnset: js.UndefOr[Boolean] = js.native
}
object CopyBuffer {
  
  @scala.inline
  def apply(): CopyBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyBuffer]
  }
  
  @scala.inline
  implicit class CopyBufferMutableBuilder[Self <: CopyBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyBuffer(value: Boolean): Self = StObject.set(x, "copyBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyBufferUndefined: Self = StObject.set(x, "copyBuffer", js.undefined)
    
    @scala.inline
    def setMap(value: js.Function): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setSet(value: js.Function): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    @scala.inline
    def setUseBigIntAsLong(value: Boolean): Self = StObject.set(x, "useBigIntAsLong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBigIntAsLongUndefined: Self = StObject.set(x, "useBigIntAsLong", js.undefined)
    
    @scala.inline
    def setUseBigIntAsVarint(value: Boolean): Self = StObject.set(x, "useBigIntAsVarint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBigIntAsVarintUndefined: Self = StObject.set(x, "useBigIntAsVarint", js.undefined)
    
    @scala.inline
    def setUseUndefinedAsUnset(value: Boolean): Self = StObject.set(x, "useUndefinedAsUnset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUndefinedAsUnsetUndefined: Self = StObject.set(x, "useUndefinedAsUnset", js.undefined)
  }
}
