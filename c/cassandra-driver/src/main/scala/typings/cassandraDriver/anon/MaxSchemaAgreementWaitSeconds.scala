package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxSchemaAgreementWaitSeconds extends StObject {
  
  var maxSchemaAgreementWaitSeconds: js.UndefOr[Double] = js.undefined
  
  var maxVersion: js.UndefOr[Double] = js.undefined
  
  var noCompact: js.UndefOr[Boolean] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
}
object MaxSchemaAgreementWaitSeconds {
  
  inline def apply(): MaxSchemaAgreementWaitSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxSchemaAgreementWaitSeconds]
  }
  
  extension [Self <: MaxSchemaAgreementWaitSeconds](x: Self) {
    
    inline def setMaxSchemaAgreementWaitSeconds(value: Double): Self = StObject.set(x, "maxSchemaAgreementWaitSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxSchemaAgreementWaitSecondsUndefined: Self = StObject.set(x, "maxSchemaAgreementWaitSeconds", js.undefined)
    
    inline def setMaxVersion(value: Double): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
    
    inline def setNoCompact(value: Boolean): Self = StObject.set(x, "noCompact", value.asInstanceOf[js.Any])
    
    inline def setNoCompactUndefined: Self = StObject.set(x, "noCompact", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
