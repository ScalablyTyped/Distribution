package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CAPICOM.CAPICOM_HASH_ALGORITHM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPHashedData extends StObject {
  
  var Algorithm: ValuesOf[CADESCOM_HASH_ALGORITHM & CAPICOM_HASH_ALGORITHM]
  
  var DataEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]
  
  def Hash(newVal: String): Unit
  
  def SetHashValue(newVal: String): Unit
  
  var Value: String
}
object CPHashedData {
  
  inline def apply(
    Algorithm: ValuesOf[CADESCOM_HASH_ALGORITHM & CAPICOM_HASH_ALGORITHM],
    DataEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE],
    Hash: String => Unit,
    SetHashValue: String => Unit,
    Value: String
  ): CPHashedData = {
    val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], DataEncoding = DataEncoding.asInstanceOf[js.Any], Hash = js.Any.fromFunction1(Hash), SetHashValue = js.Any.fromFunction1(SetHashValue), Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPHashedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CPHashedData] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: ValuesOf[CADESCOM_HASH_ALGORITHM & CAPICOM_HASH_ALGORITHM]): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    inline def setDataEncoding(value: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]): Self = StObject.set(x, "DataEncoding", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String => Unit): Self = StObject.set(x, "Hash", js.Any.fromFunction1(value))
    
    inline def setSetHashValue(value: String => Unit): Self = StObject.set(x, "SetHashValue", js.Any.fromFunction1(value))
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
