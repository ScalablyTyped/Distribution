package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginInts.`0`
import typings.cadesplugin.cadespluginInts.`1`
import typings.cadesplugin.cadespluginInts.`2`
import typings.cadesplugin.cadespluginInts.`3`
import typings.cadesplugin.cadespluginInts.`4`
import typings.cadesplugin.cadespluginInts.`5`
import typings.cadesplugin.cadespluginInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CAPICOM_HASH_ALGORITHM extends StObject {
  
  val CAPICOM_HASH_ALGORITHM_MD2: `1`
  
  val CAPICOM_HASH_ALGORITHM_MD4: `2`
  
  val CAPICOM_HASH_ALGORITHM_MD5: `3`
  
  val CAPICOM_HASH_ALGORITHM_SHA1: `0`
  
  val CAPICOM_HASH_ALGORITHM_SHA_256: `4`
  
  val CAPICOM_HASH_ALGORITHM_SHA_384: `5`
  
  val CAPICOM_HASH_ALGORITHM_SHA_512: `6`
}
object CAPICOM_HASH_ALGORITHM {
  
  inline def apply(): CAPICOM_HASH_ALGORITHM = {
    val __obj = js.Dynamic.literal(CAPICOM_HASH_ALGORITHM_MD2 = 1, CAPICOM_HASH_ALGORITHM_MD4 = 2, CAPICOM_HASH_ALGORITHM_MD5 = 3, CAPICOM_HASH_ALGORITHM_SHA1 = 0, CAPICOM_HASH_ALGORITHM_SHA_256 = 4, CAPICOM_HASH_ALGORITHM_SHA_384 = 5, CAPICOM_HASH_ALGORITHM_SHA_512 = 6)
    __obj.asInstanceOf[CAPICOM_HASH_ALGORITHM]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CAPICOM_HASH_ALGORITHM] (val x: Self) extends AnyVal {
    
    inline def setCAPICOM_HASH_ALGORITHM_MD2(value: `1`): Self = StObject.set(x, "CAPICOM_HASH_ALGORITHM_MD2", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_HASH_ALGORITHM_MD4(value: `2`): Self = StObject.set(x, "CAPICOM_HASH_ALGORITHM_MD4", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_HASH_ALGORITHM_MD5(value: `3`): Self = StObject.set(x, "CAPICOM_HASH_ALGORITHM_MD5", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_HASH_ALGORITHM_SHA1(value: `0`): Self = StObject.set(x, "CAPICOM_HASH_ALGORITHM_SHA1", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_HASH_ALGORITHM_SHA_256(value: `4`): Self = StObject.set(x, "CAPICOM_HASH_ALGORITHM_SHA_256", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_HASH_ALGORITHM_SHA_384(value: `5`): Self = StObject.set(x, "CAPICOM_HASH_ALGORITHM_SHA_384", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_HASH_ALGORITHM_SHA_512(value: `6`): Self = StObject.set(x, "CAPICOM_HASH_ALGORITHM_SHA_512", value.asInstanceOf[js.Any])
  }
}
