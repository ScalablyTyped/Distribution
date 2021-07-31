package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterOptions extends StObject {
  
  /**
    * Set the initial expiration time for the document. A value of 0 represents never expiring.
    */
  var expiry: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the initial value for the document if it does not exist. Specifying a value of undefined will cause the operation to fail if the document does not exist, otherwise this value must be equal to or greater than 0.
    */
  var initial: js.UndefOr[Double] = js.undefined
  
  /**
    * Ensures this operation is persisted to this many nodes
    */
  var persist_to: js.UndefOr[Double] = js.undefined
  
  /**
    * Ensures this operation is replicated to this many nodes
    */
  var replicate_to: js.UndefOr[Double] = js.undefined
}
object CounterOptions {
  
  @scala.inline
  def apply(): CounterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterOptions]
  }
  
  @scala.inline
  implicit class CounterOptionsMutableBuilder[Self <: CounterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    @scala.inline
    def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    @scala.inline
    def setPersist_to(value: Double): Self = StObject.set(x, "persist_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersist_toUndefined: Self = StObject.set(x, "persist_to", js.undefined)
    
    @scala.inline
    def setReplicate_to(value: Double): Self = StObject.set(x, "replicate_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicate_toUndefined: Self = StObject.set(x, "replicate_to", js.undefined)
  }
}
