package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxSchemaAgreementWaitSeconds extends StObject {
  
  var maxSchemaAgreementWaitSeconds: js.UndefOr[Double] = js.native
  
  var maxVersion: js.UndefOr[Double] = js.native
  
  var noCompact: js.UndefOr[Boolean] = js.native
  
  var port: js.UndefOr[Double] = js.native
}
object MaxSchemaAgreementWaitSeconds {
  
  @scala.inline
  def apply(): MaxSchemaAgreementWaitSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxSchemaAgreementWaitSeconds]
  }
  
  @scala.inline
  implicit class MaxSchemaAgreementWaitSecondsMutableBuilder[Self <: MaxSchemaAgreementWaitSeconds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxSchemaAgreementWaitSeconds(value: Double): Self = StObject.set(x, "maxSchemaAgreementWaitSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSchemaAgreementWaitSecondsUndefined: Self = StObject.set(x, "maxSchemaAgreementWaitSeconds", js.undefined)
    
    @scala.inline
    def setMaxVersion(value: Double): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
    
    @scala.inline
    def setNoCompact(value: Boolean): Self = StObject.set(x, "noCompact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoCompactUndefined: Self = StObject.set(x, "noCompact", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
