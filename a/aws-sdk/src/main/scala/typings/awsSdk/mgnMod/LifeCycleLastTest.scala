package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifeCycleLastTest extends StObject {
  
  /**
    * Lifecycle last Test finalized.
    */
  var finalized: js.UndefOr[LifeCycleLastTestFinalized] = js.undefined
  
  /**
    * Lifecycle last Test initiated.
    */
  var initiated: js.UndefOr[LifeCycleLastTestInitiated] = js.undefined
  
  /**
    * Lifecycle last Test reverted.
    */
  var reverted: js.UndefOr[LifeCycleLastTestReverted] = js.undefined
}
object LifeCycleLastTest {
  
  inline def apply(): LifeCycleLastTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifeCycleLastTest]
  }
  
  extension [Self <: LifeCycleLastTest](x: Self) {
    
    inline def setFinalized(value: LifeCycleLastTestFinalized): Self = StObject.set(x, "finalized", value.asInstanceOf[js.Any])
    
    inline def setFinalizedUndefined: Self = StObject.set(x, "finalized", js.undefined)
    
    inline def setInitiated(value: LifeCycleLastTestInitiated): Self = StObject.set(x, "initiated", value.asInstanceOf[js.Any])
    
    inline def setInitiatedUndefined: Self = StObject.set(x, "initiated", js.undefined)
    
    inline def setReverted(value: LifeCycleLastTestReverted): Self = StObject.set(x, "reverted", value.asInstanceOf[js.Any])
    
    inline def setRevertedUndefined: Self = StObject.set(x, "reverted", js.undefined)
  }
}
